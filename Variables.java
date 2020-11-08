
public class Variables 
{

	public static void main(String[] args) 
	{
		// initialising variables 
		System.out.println("*** Initialising Variables ***\n") ;
		
		String myName = "James Wilson" ;
		int myAge = 75 ;
		double myHeight = 175.3 ;
		
		
		System.out.println(myName) ;
		System.out.println(myAge) ;
		System.out.println(myHeight) ;
		
		// simply adding space
		System.out.println("\n\n") ;
		
		
		//Finding the average for a set of exam marks
		System.out.println("*** Finding an average mark ***\n") ;
		
		int exam1 = 56 ;
		int exam2 = 65 ;
		int exam3 = 68 ;
		int exam4 = 64 ;

		
		int total = (exam1 + exam2 + exam3 + exam4) ;
		double average = total / 4.0 ;
		
		
		System.out.println("The average mark for the four exams is " + average) ;
		System.out.println("\n\n") ;
		
		
		//Converting Fahrenheit into Celsius
		System.out.println("*** Converting Fahrenheit into Celsius ***\n") ;
		
		double fahrenheit = 56.0 ;

		
		double celsius = (5.0/9.0) * (fahrenheit - 32.0) ;

	
		
		System.out.println(fahrenheit + " degres fahrenheit is " + 
				celsius + " degrees celsius") ;
		System.out.println("\n\n") ;
		
		
		
		
		
		// Demonstrating Integer division
		System.out.println("*** Demonstrating Integer division ***\n") ;
		
		int result = 5 / 2 ;

		
		System.out.println("The result of 5/2 is " + result) ;


		//Integer division that returns the remainder
		result = 5 % 2 ;

		System.out.println("The remander from 5/2 is: " + result) ;
		System.out.println("\n\n") ;
		
		
		
		
		// Operator precedence
		System.out.println("*** Operator precedence ***\n") ;
		
		result = -5 + 6 - 3 * 8 / 4 ;
		System.out.println("Result 1: " + result) ;

		result = -5 + (6 - 3) * 8 / 4 ;
		System.out.println("Result 2: " + result) ;

		// Java uses a function for powers
		// the function returns a double so needs to be cast
		result = -5 + (6 - 3) * (int)Math.pow(8, 3) / 4 ;
		
		System.out.println("Result 3: " + result) ;
		System.out.println("\n\n") ;
		
		
		
		// Concatenating strings
		System.out.println("*** Concatenating strings ***\n") ;
		
		String num1 = "56" ;
		String num2 = "75" ;

		String stringResult = num1 + num2 ;

		
		System.out.println("The result is: " + stringResult) ;
		System.out.println("\n\n") ;
	}

}
