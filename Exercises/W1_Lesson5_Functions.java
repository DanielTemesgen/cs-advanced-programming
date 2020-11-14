import java.util.Scanner;

public class W1_Lesson5_Functions 
{
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		

		//6. In Java the functions do not have to be defined before they are called
		//   Here is the code that runs ALL the functions below

		System.out.println("1-4. Using multiple functions") ;
		String[] name = getName() ;
		printGreeting() ;
		System.out.println(name[0]) ;
		System.out.println("Your initials are: " + makeInitials(name[0], name[1])) ;

		System.out.println("5. Outputs the nth nimber in the Fibonacci sequence") ;

	    System.out.println("Please enter a number: ") ;
		int num  = input.nextInt() ;
		System.out.println("The " + num + "th number in the Fibonacci sequence is: " + fib(num)) ;

		input.close() ;

	}
	
	
	
	
	// Functions are placed outside of the main method in Java
	// It is the Java convention to place them after the main method
	//1. A Function that simply performs an action
	public static void printGreeting()
	{
	    System.out.print("Hello ") ;
	}


	
	//2. A function that returns a value
	public static String[] getName()
	{
		String[] names = new String[2] ;
		
		System.out.print("What is your first name? ") ;
	    names[0] = input.nextLine();
	    		
	    System.out.print("\nWhat is your surname?") ;
	    names[1] = input.nextLine();
	    return names ;
	}

	

	//3. A function that takes two arguments
	public static String makeInitials(final String firstName, final String surname)
	{
	    String firstInitial = firstName.substring(0, 1).toUpperCase() ;
	    String secondInitial = surname.substring(0, 1).toUpperCase() ;
	    
	    return firstInitial + "." + secondInitial  + "."  ;
	}

	
	
	//4. A function that calls other function
	public static void personalised()
	{
		String[] name = getName() ;
		printGreeting() ;
		System.out.println(" " + name[0]) ;
	}

			    
	//5. A recursive function (one that calls itself)
	//   Function to calculate the nth number in the 
	//   fibonacci sequence
	public static int fib(final int num)
	{
		if (num <= 1)
			return num ;
		else
			return (fib(num - 1) + fib(num - 2)) ;
	}

}
