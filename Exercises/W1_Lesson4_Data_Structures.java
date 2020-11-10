import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class W1_Lesson4_Data_Structures {

	public static void main(final String[] pArgs) 
	{
		/* 
		 * There are two possible ways to represent a Python List or Tuple in Java
		 * A primitive array OR an ArrayList from the collections API
		 * The array will be presented here, the ArrayList is more flexible 
		 * and should be reviewed in your own time 
		 */
		
	


		//1. An array using Strings
		String[] animals = {"elephant", "panda", "mouse", "penguin"} ;
		System.out.print("1. Array contents: ") ;
		
		// Printing an array requires a loop
		for(int i = 0; i < animals.length; i++)
		{
			System.out.print(animals[i] + " ") ;
		}
		
		
		
		//2. Accessing an element in an array
		System.out.println("\n2. The animal in the first position is: " + animals[0]);
		
		
		
		//3. To create a slice is to iterate over the array
		//   extracting what you need (1:3)
		int from = 1 ;
		int to = 3 ;
		int size = to - from ;
		int count = 0 ;
		
		String[] animalSlice = new String[size] ;
		
		for(int i = from; i < to; i++)
		{
			animalSlice[count] = animals[i] ;
			count ++ ;
		}
		
		// Outputting the slice
		System.out.print("3. Contents of slice: ") ;
		for(int i = 0; i < animalSlice.length; i++)
		{
			System.out.print(animalSlice[i] + " ") ;
		}
		
		
		//4. An array is always index 0 to length-1
		//5. An array in Java has a fixed length so no appending
		
		
		
		//6. Changing an element of the array
		animals[2] = "rat" ;
		System.out.print("\n6. Changing an element:  ") ;
		for(int i = 0; i < animals.length; i++)
		{
			System.out.print(animals[i] + " ") ;
		}
		
		
		//7. Iteration demonstrated above
		//8. Manually concatenating array to string as demonstrated above.
		//9. Here are some array examples. As Java requires an explicit type
		//   this means no mixed type arrays
		
		
		
		//10. comparison
		String[] animals2 = {"elephant", "panda", "mouse", "penguin"} ;
		if(animals2.equals(animals))
		{
			System.out.print("\n10. The arrays are equal") ;
		}
		else
		{
			System.out.print("\n10. The arrays are NOT equal") ;
		}
		
		
		
		//11-12. String to Array
		String moreAnimals = "fox eagle whale" ;
		
		String[] moreAnimalsArray = moreAnimals.split(" ") ;
		System.out.print("\n12. String to array:  ") ;
		for(int i = 0; i < moreAnimalsArray.length; i++)
		{
			System.out.print(moreAnimalsArray[i] + " ") ;
		}
		
		
		
		
		//13-16 no pop or append on an array
		// Manually add the contents of one to the other
		// or use one of the external libraries developed by Google 
		int totalAnimals = moreAnimalsArray.length + animals.length ;
		String allAnimals[] = new String[totalAnimals] ;
		
		for(int i = 0; i < totalAnimals; i++)
		{
			count = 0 ;
			while(count < animals.length)
			{
				allAnimals[i] = animals[count] ;
				i++ ;
				count ++;
			}
			count = 0 ;
			while(count < moreAnimalsArray.length)
			{
				allAnimals[i] = moreAnimalsArray[count] ;
				i++ ;
				count ++;
			}
		}
		
		
		
		//17-18 creating a string from the array 
		String allAnimalsString = String.join(" ", allAnimals) ;
		
		System.out.print("\n13-18 All animals: " + allAnimalsString 
				  + " which contains " + allAnimals.length + " animals") ;
		
		
	
		//19-21 Creating a matrix
		String[][] matrix = {{"1A", "2A", "3A",  "4A"},
		                    {"1B", "2B", "3B", "4B", "5B"},
		                    {"1C", "2C", "3C"}};
		
		
		// Outputting a matrix
		System.out.println("\n19-20 Matrix: ") ;
		for(int i = 0 ; i < matrix.length; i++)
		{
			String temp = "\t" + String.join(" ", matrix[i]) ;
			System.out.println(temp) ;
		}
		
		
		
		//22. Accessing individual elements
		System.out.println("22. Accessing top left: " + matrix[0][0]) ;
		System.out.println("and accessing bottom right:" + matrix[2][2]) ;
		
		
		//23. Printing all the matrix elements demonstrated above
		
		
		//24. Accessing a given horizontal row  
		int row = 1  ;
		System.out.print("\n24. Row " + row + " :");

		for(int i = 0 ; i < matrix.length; i++)
		{
			System.out.print(matrix[row][i] + " ") ;
		}
		
		//25. Accessing a given vertical column
		int column = 2  ;
		System.out.print("\n25. Column " + column + " :");

		for(int i = 0 ; i < matrix.length; i++)
		{
			System.out.print(matrix[i][column] + " ") ;
		}
		
		
		
		/*
		 * 26-36 As tuples are structurally the same as a list, the only difference
		 * being that they are immutable, an array as demonstrated above is the most
		 * Similar structure in Java. An arrays size cannot be altered all though
		 * as demonstrated its elements cane be changed. 
		 */		
		
		
		
		
		
		/*
		 * Java provides the set interface as part of the collections API
		 * and three concrete implementations: HashSet, TreeSet, and LinkedHashSet
		 * Here the examples from Python are implemented using the HashSet
		 */	
		
		
		/*37. Sets of even numbers, odd numbers, numbers divisible by three
		 and integers from 1 to 10 */	
		
		Set<Integer> even = new HashSet<Integer>() ;
		even.add(2) ;
		even.add(new Integer(4)) ;
		even.add(new Integer(6)) ;
		even.add(new Integer(8)) ;
		even.add(new Integer(10)) ;

		Set<Integer> odd = new HashSet<Integer>();
		odd.add(new Integer(1)) ;
		odd.add(new Integer(3)) ;
		odd.add(new Integer(5)) ;
		odd.add(new Integer(7)) ;
		odd.add(new Integer(9)) ;
		
		Set<Integer> byThree = new HashSet<Integer>();
		byThree.add(new Integer(3)) ;
		byThree.add(new Integer(6)) ;
		byThree.add(new Integer(9)) ;
		byThree.add(new Integer(12)) ;
		byThree.add(new Integer(15)) ;		
		
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(new Integer(1)) ;
		numbers.add(new Integer(2)) ;
		numbers.add(new Integer(3)) ;
		numbers.add(new Integer(4)) ;
		numbers.add(new Integer(5)) ;
		numbers.add(new Integer(6)) ;
		numbers.add(new Integer(7)) ;
		numbers.add(new Integer(8)) ;
		numbers.add(new Integer(9)) ;
		numbers.add(new Integer(10)) ;
		

		
		//38. Testing membership within a set
		System.out.println("38. Testing membership within a set") ;
		System.out.println("Enter a number between 0 and 20:") ;
		Scanner input = new Scanner(System.in);
		Integer num = new Integer(input.nextInt()) ;

		if (even.contains(num))
		{
		    if (!byThree.contains(num))
		    	System.out.println("The value " + num + " is only in the Even set") ;
		    else 
		    	System.out.println("The value " + num + " is in the Even and By Three set") ;
		}
		else if (odd.contains(num))
		{
		    if (!byThree.contains(num))
		    	System.out.println("The value " + num + " is only in the Odd set") ;
		    else
		    	System.out.println("The value " + num + " is in the Odd and By Three set") ;
		}
		else if (byThree.contains(num))
			System.out.println("The value " + num + " is only in the By Three set") ;
		else
			System.out.println("The vaule " + num + " is not in any of the sets") ;

		input.close();
		
		

		    
		//39. Testing for subset by iterating over a dictionary of sets (excluding numbers)
		System.out.println("\n39. Testing for subset and supperset") ;
		Map <String, Set<Integer>> sets = new HashMap<String, Set<Integer>>() ;
		//{: even, "Odd": odd, "ByThree": byThree}
		
		sets.put("Even", even) ;
		sets.put("Odd", odd) ;
		sets.put("ByThree", byThree) ;
		    
		for(String key: sets.keySet())
		{
		    Set members = sets.get(key) ;
		    
		    if (numbers.containsAll(members)) 
		    {
		    	if(!(numbers.equals(members)))
		    		System.out.println( key + " is a proper subset of numbers") ;
		    	else
		    		System.out.println(key + " is a just a subset of numbers") ;
		    }
		    else
		    	System.out.println(key + " is NOT a subset of numbers") ;
		}

	
		
		//40. Testing Union and Intersection
		// first make a copy so that the original is not changed
		Set<Integer> newNumbers = new HashSet(numbers) ;
		
		newNumbers.addAll(byThree) ;
		
		System.out.print("40a. Union: ") ;
		for(Integer i: newNumbers)
		{
			System.out.print(i + ".") ;
		}
		
		newNumbers = new HashSet(numbers) ;
		
		// Produces the intersection
		newNumbers.retainAll(byThree) ;
		
		System.out.print("\n40b. Intersection: ") ;
		for(Integer i: newNumbers)
		{
			System.out.print(i + ",") ;
		}
	
		
		
		
		/*
		 * To emulate a dictionary in Java the closest construct is a map
		 * from the collections API. A map is an interface and the API provides 
		 * three implementations of this: HashMap, TreeMap, and LinkedHashMap.
		 * Here I demonstrate the application of a map using a HashMap
		 */
		
		
		//41. Creating a map
		//    A map cannot take mixed values unless the type is set to
		//    <object, object>. Here it is set to Strings for both the
		//    key and the value
		

		Map<String, String> person = new HashMap<String, String>();
		
		person.put("name", "Frank") ;
		person.put("age", Integer.toString(56)) ;
		person.put("height", Integer.toString(6 * 12 + 2)) ;
		
		// printing out a map using the for-each loop
		System.out.println("\n41. Map contains : ");
		for(String key: person.keySet())
			System.out.println("\t" + key + " : " + person.get(key)) ;
		
		

		//42. Accessing elements of map
		System.out.print("42. My name is " + person.get("name")) ;
		System.out.print(", I am  " + person.get("age") + " years old, ") ;
		System.out.println("and I am  " + person.get("height") + "inches tall.") ;

		
		//43. Adding to a map
		person.put("town", "York") ;
		System.out.println("43. I live in {person['town']}") ;
		 
		
		//44. Size of a map
		System.out.println("44. Person conatins " + person.size() + " key-value pairs") ;

		
		
		//45. Is a key present in a dictionary?
		System.out.print("45. Is weight present? " + person.containsKey("weight")) ;
		System.out.println(", and is height present? " + person.containsKey("height")) ;
		
		
		//46. Is value in a dictionary?
		// there is no requirement in Java to return all values
		// to check if one is within the map
		System.out.print("46. Is York present? " + person.containsValue("York")) ;
		System.out.println(", and is 26 in these vaues? " + person.containsValue("26"))  ;

		
		//47. Cross referencing dictionaries 
		Map<String, String> departments = new HashMap<String, String>();
		departments.put("Accounts", "Ac") ;
		departments.put("Sales", "S") ;
		departments.put("Customer Service", "CS") ;
		
		Map<String, String> deptHead = new HashMap<String, String>();
		deptHead.put("Ac", "Alison") ;
		deptHead.put("S", "Frank") ;
		deptHead.put("CS", "James") ;

		
		System.out.println("47. Department codes are:") ;
		for(String key: departments.keySet())
		  System.out.println("\t" + key + " is " + departments.get (key)) ;
		  
		
		System.out.println("Therefore the heads of departments are:")  ;
		for(String key: departments.keySet())
		  System.out.println("\t" + key + " is " + deptHead.get(departments.get(key)))  ;

		
		
	}// end main

}// end class
