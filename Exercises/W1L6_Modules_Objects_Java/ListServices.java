
public class ListServices 
{
	// 1. generates a list of indices that are 
    // the positions in the list toSearch of every instance
	// of the given ftoFind object
	// Returns a list on indices or a list containing
	//  -1 if no instances are found
	public static int[] find(final Object[] toSearch, final Object toFind)
	{
		int count = countFinds(toSearch, toFind) ;
	    int[] found ;
	    
	    if(count != 0)
	    {
	    	found = new int[count] ;
	    	int index = 0 ;
	    	count = 0;
	    
		    while (index < toSearch.length)
		    {
		        if (toSearch[index].equals(toFind))
		        {
		            found[count] = index ;
		            count +=1 ;
		        }
		        index += 1 ;
		    }
	    }
	    else
	    {
	    	found = new int[1] ;
	    	found[0] = -1 ;
	    }

	    return found ;
	}
	
	
	// helper method to avoid writing an expanding array method
	public static int countFinds(final Object[] toSearch, final Object toFind)
	{
		int count = 0 ;
		
	    for(int i = 0; i < toSearch.length; i++)
	    {
	        if (toSearch[i].equals(toFind))
	            count += 1 ;
	    }
		return count; 
	}
	    
	    
  

	//2. Converts any sting that is a value to 
	// an integer representation of that value
	// returns a new list object, the object passed into 
	// the function is untouched
	// If there is a string that cannot be converted
	// or any other object returns a list containing -1
	public static int[] convertToInts(final Object[] convert)
	{
		int[] allInts = new int[convert.length] ;
		int index = 0 ;
		for (int i = 0; i < convert.length; i++)
		{
			Object temp = convert[i] ;
		
		    if(temp instanceof java.lang.Integer)
		    {
		        try
		        {
		        	allInts[index] = ((java.lang.Integer) temp).intValue() ;
		        	index ++ ;
		        }
		        catch(Exception e)
		        {
		            allInts[0] = -1 ;
		            break ;
		        }
		    }
		    else if (temp instanceof java.lang.String)
		    {
		        try
		        {
		        	allInts[index] = Integer.parseInt(((java.lang.String) temp)) ;
		        	index ++ ;
		        }
		        catch(Exception e)
		        {
		            allInts[0] = -1 ;
		            break ;
		        }
		    }
		    else
		    {
	            allInts[0] = -1 ;
	            break ;
		    }
		}
		return allInts  ;
	}



	
	//3. Removes all instances of a given object.
	// If the object is not found simply returns a copy of 
	// the original list   
	public static Object[] clean(final Object[] toClean, final Object toRemove)
	{
	    Object[] cleaned ;
	    int[] indexes = find(toClean, toRemove) ;
	    
	    if (indexes[0] != -1 )
	    {
	    	cleaned = new Object[toClean.length - indexes.length] ;
	    	int j = 0; // index for indexes
	    	int k = 0 ; // index for cleaned
	    	
	    	for (int i = 0; i < toClean.length; i++)
	    	{
	    	    if(j != indexes.length && i == indexes[j])
	    	    {
	    	    	// skip
	    	    	j++ ;
	    	    }
	    	    else
	    	    {
	    	    	cleaned[k] = toClean[i] ;
	    	    	k++ ;
	    	    }
	    	}
	    }
	    else
	    {
	    	cleaned = toClean ;
	    }
	    return cleaned ;
	}
	    
}
