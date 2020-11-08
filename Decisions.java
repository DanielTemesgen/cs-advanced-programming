
import java.util.Random;

public class Decisions {

	public static void main(String[] args) 
	{
		//Testing the size of a snake
		System.out.println("*** Testing the size of a snake ***\n") ;
		
		int snake_size = 6 ;

		if (snake_size > 7.67)
			System.out.println("That's a reticulated python and a new world record") ; 
		
		if (snake_size <= 7.67)
			System.out.println("That's not a new world record") ;
		
		// simply adding space
		System.out.println("\n\n") ;
		
		
		//Testing two random numbers
		System.out.println("*** Testing two random numbers ***\n") ;

		Random tRan = new Random() ;
		
		int num1 = tRan.nextInt(100) ;
		int num2 = tRan.nextInt(100) ;


		if (num1 > num2)
		{
			System.out.println(num1 + " is larger than " + num2 + ".") ;
		}
		else if (num2 > num1)
		{
			System.out.println(num2 + " is larger than " + num1 + ".") ;
		}
		else
		{
			System.out.println(num1 + " and " +  num2 + " are the same.") ;
		}
		
		System.out.println("\n\n") ;
		
		
		
		// Calculating discount fairs
		System.out.println("*** Calculating discount fairs ***\n") ;
		
		int age = 4 ;
		int group_size = 2 ;
		double ticket_price = 20.67 ;

		if (age > 65 || age <= 4)
		{
			if (group_size <= 2)
			{
				ticket_price = ticket_price * 0.85 ;
			}
			else
			{
				ticket_price = ticket_price * 0.8 ;
			}
		}
		else if ( age < 18 && group_size >= 4)
		{
			ticket_price = ticket_price * 0.9 ;
		}
		else
		{
			System.out.println("Unable ot calualte fare") ;
		}

		 
		System.out.println("Your ticket price is: " + ticket_price) ;
		
		
	}

}
