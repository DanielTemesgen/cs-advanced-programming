import java.util.Scanner;

public class StringManipulation 
{

	public static void main(final String[] pArgs) 
	{
		
		// Two ways to create a string in Java, first:
		String uoy_string = "University of York" ;
		
		//or using new
		String studying = new String("Computer Science") ;
		
		// Accessing parts of a string
		System.out.println("\tAccessing parts of string") ; 

		//Print the complete string
		System.out.println("The string: " + uoy_string)  ;
		System.out.println("The second string: " + studying)  ;
		
		// Print first character only
		System.out.println("1st char: "+ uoy_string.charAt(0)) ;   

		// Prints the string starting from 3rd character
		System.out.println("From the 3rd char: " + uoy_string.substring(3)) ; 

		// Prints characters starting from 2nd to 7th
		System.out.println("2nd to 7th char: " + uoy_string.substring(1,8)); 

		// Prints the whole string 4 times
		System.out.println("Multiple copies: "+  uoy_string +
							uoy_string + uoy_string + uoy_string) ;
		
		
		
		
		
		
		// using loops to access the characters in a String
		System.out.println("\n\tIterating over a sting ") ; 
		
	
		// the length of the string
		System.out.println("Length of string: " + uoy_string.length()) ;


		// as a string is effectively a list it can be used directly in a for loop
		for ( int i = 0; i < uoy_string.length(); i++)
		{
			System.out.print(uoy_string.substring(i, i + 1) + "-") ;
		}
			
		  
		System.out.println() ; // simply creates a blank line
		
		  
		// to use a while loop we need the length of the stirng as part of the condition
		int count = 0 ;
		
		while (count < uoy_string.length())
		{
			System.out.print(uoy_string.substring(count, count + 1) + "*") ;
			count ++ ;
		}
	
		System.out.println() ; // simply creates a blank line
		
		
		// Java also has the do ... while loop 
		count = 0 ; // reset the counter
		
		do
		{
			System.out.print(uoy_string.substring(count, count + 1) + "#") ;
			count ++ ;
		}while(count < uoy_string.length()) ;
		
		
		System.out.println() ; // simply creates a blank line
		
		
		
		
		
		// other string functions:
		System.out.println("\n\tOther String Functions") ; 
		
		// there is no count method for strings
		// this returns true if the string contains the letter 'i'
		System.out.println("Coantains an \'i\'? " + uoy_string.contains("i")) ; 
		
		// creates a new string in lower case
		System.out.println("In lower case: " + uoy_string.toLowerCase()) ;  
		
		// no method for checking upper/lowercase would need to use a regular expression 
		
		// returns the index of the first occurrence
		System.out.println("Index of teh first \'Y\':" + uoy_string.indexOf('Y')) ;
		
		// there is no method for splitting a string into words 
		// it would have to be done manually using a loop
		
		// there are many other methods in class String 
		
		
		
		
		
		
		// Demonstrating output and string formating instructions 
		System.out.println("\n\tString formating") ; 
		double myWeight = 75.785 ;
		System.out.printf("\t My weight is %.2fcm\n", myWeight) ;
		
	
		String york = "York" ;
		
		System.out.printf("%10s",york);
		System.out.printf("%10s%n",york);
	
		// there are a range of flags that can be used 
		// within strings to format variables and structure
		
		
		
		
		
		// Comparing strings
		System.out.println("\n\tComparing strings") ; 
		String myFruit = "Melon" ;
		String myOtherFruit = "Banana" ;
		
		// the method returns a value depending on the lexical difference
		// equals() could be used to see if they are the same or not
		int comparison = myFruit.compareTo(myOtherFruit) ;

		if (comparison > 0)
			System.out.println(myFruit + " comes after " + myOtherFruit) ;
		else if(comparison < 0)
			System.out.println(myFruit + " comes before " + myOtherFruit) ;
		// if 0 is returned the strings are the same
		else
			System.out.println(myFruit + " is the same as " + myOtherFruit) ;
			
		
		
		
		
		
		// Getting user input as a string
		System.out.println("\n\tGetting user input") ; 
		
		// scanner needs to be imported, see the top of this file
		Scanner input = new Scanner(System.in);
		
		System.out.print("\tEnter your name: ") ;
		String myName = input.nextLine() ;

		//Getting user input as an integer
		int myAge ;
		System.out.print("\tEnter your age: ") ;
		myAge = input.nextInt() ;

		//Getting user input floating point value (decimal value)

		float myHeight ;
		System.out.print("\tEnter your height: ") ;
		myHeight = input.nextFloat() ;

		//Outputting the values of the variables
		System.out.println("\nMy name is " +  myName +
				      ", I am " + myAge + "years old," +
				      " and I am " + myHeight + "m tall.") ;
		
		
		// there are many ways to handle input in Java 
		// the above is one of the simplest but does rely
		// on the user giving the correct type
		
		
		
		
		
		System.out.println("\n\tUsing a try catch for errors") ; 
		// if the user enters characters this will cause an exception
		try
		{
			System.out.print("\tEnter your age: ") ;
			myAge = input.nextInt() ;
		}
		catch(final Exception e)
		{
			
			System.out.println("You have enetered the wrong type") ;
			System.err.print(e.getStackTrace());
		}
		
		// There is a large range of different Exceptions in Java 
		// given different error types 
		
		// all streams need to be closed
		input.close();
		
	}// end main

}// end class
