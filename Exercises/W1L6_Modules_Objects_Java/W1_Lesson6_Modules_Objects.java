// No requirement in Java to import the module 
// providing it is within the same package 


public class W1_Lesson6_Modules_Objects 
{
	
	
    public static void main(final String[] pArgs)
    {
  
    	//1. Testing with a valid list
        // Lists of values that can be used by the moduel's functions
    	// All values must be of type object, cannot mix arrays
    	// with primitive types, such as ints in Java
		Object[] validList = {new Integer(5), "4", new Integer(234),"678",new Integer(3), 
		                   new Integer(4), "5" , new Integer(6), new Integer(8), 
		                   new Integer(5), new Integer(7)} ;
		
		
		//2. Testing find() function in the Module ListService
		int[] found = ListServices.find(validList, 5) ;
		printArray(found) ;

		//3. Testing convert to integers in Module ListService
		int[] allNum = ListServices.convertToInts(validList) ;
		printArray(allNum) ;
		
		//4. Testing clean in Module ListService
		Object[] cleanNum = ListServices.clean(validList, 5) ;
		printArray(cleanNum) ;
		
		
		//5. Testing with values that return -1 or do nothing
		Object[] invalidList = {new Integer(5), "a", new Integer(234),"678",new Integer(3),
                          new Integer(4), "5", new Integer(6),  new Integer(8),
                         new Integer(5), new Integer(7)} ;
		
		//6. This wil return -1 one as 1 is not in the list
		found = ListServices.find(validList, 1) ;
		printArray(found) ;

		//7. This will return -1 as not all objects can be converted to ints
		allNum = ListServices.convertToInts(validList) ;
		printArray(allNum) ;
		
		//8.  This will return the original list as 'b' is not in the list
		cleanNum = ListServices.clean(validList, 5) ;
		printArray(cleanNum) ;
    	
    	
		//9. Creating DOB object with a valid data 
		DOB tim = new DOB("12/12/2012") ;
		System.out.println("9. Valid values in a DOB object:" +tim.toString()) ;

		//10. Creating a DOB object with an invalid data
		DOB ben = new DOB("30/2/2000") ;
		System.out.println("10, Default values in a DOB object:" + ben.toString()) ;

		//11. Changing the day value with a valid value
		tim.setDay(14) ;
		System.out.println("11. Changing the day value:" + tim.toString()) ;

		//12. Changing the month value with an invalid value
		tim.setMonth(13) ;
		System.out.println("12. Changing the month value:" + tim.toString()) ;

		//13. Changing the month value with an valid value
		tim.setMonth(13) ;
		System.out.println("13. Changing the month value:" + tim.toString()) ;

		//14. Getting the attributes of the object via the methods
		System.out.println("14: Getting individual values:") ;
		System.out.println("\tTim was born on" + " tim.getDay()" + " day of the" 
					+ " tim.getMonth()" + " month in " + " tim.getYear()") ;

		//15. Following best practice in Java attributes can NOT be accessed directly
		// as they are all defined as private
		
    }// end main
    
    
    // Helper methods for printing out arrays
    private static void printArray(final Object[] array)
    {
		System.out.print("[") ;
		for(int i = 0; i < array.length; i++)
		{
			if(i == array.length-1)
				System.out.print(array[i]) ;
			else
				System.out.print(array[i] + ",") ;
		}
		System.out.println("]") ;
    }
    
    
    
    private static void printArray(final int[] array)
    {
		System.out.print("[") ;
		for(int i = 0; i < array.length; i++)
		{
			if(i == array.length-1)
				System.out.print(array[i]) ;
			else
				System.out.print(array[i] + ",") ;
		}
		System.out.println("]") ;
    }

}
