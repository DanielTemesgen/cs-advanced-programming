
public class Iteration {

	public static void main(String[] args) 
	{
		
		// Calculating Factorials 
		System.out.println("*** Using a for loop to calculate Factorials ***\n") ;
		int tFactMax = 12 ;

		int tTotal = 1 ;


		for (int i = 1; i <= tFactMax; i++)
		{
			tTotal = i * tTotal ;
			
			System.out.println(i + " = " + tTotal) ;
			
		}
		
		System.out.println("\n\n") ;
		
		
		
		
		
		// Using nested for loops to generate a right-angled Triangle
		System.out.println("*** Using a for loop to generate a rightangled Triangle ***\n") ;
		int tNumStars = 8 ;
		
		int tSpaces = tNumStars - 1; 
			
		for(int i = 1 ; i <= tNumStars ; i++)	
		{
			for(int j = tSpaces ; j > 0 ; j--)
			{
				System.out.print(" ") ;
				
			}
			
			
			for(int k = 1 ; k < i+1 ; k++)
			{
				System.out.print("*") ;
				
			}
			
			System.out.println() ;
			
			tSpaces --; 
			
		}// end for
		System.out.println("\n\n") ;
		
		
		
		
		
		
		// Using a while loop to demonstrate the Collatz Conjecture
		System.out.println("*** Using a while loop to demonstrate the Collatz Conjecture ***\n") ;
			
		int tNum = 67 ;
		int tSteps = 0;
				
		while (tNum > 1)
		{
			tSteps ++ ;
			// even dived by 2
			if(tNum % 2 == 0 )
			{
				tNum /= 2 ;
				System.out.println("Even: " + tNum); 
			}
			// odd *3 + 1
			else
			{
				tNum = (tNum * 3) + 1 ;
				System.out.println("Odd: " + tNum); 
			}
		}
				
		System.out.println("Total steps :" + tSteps); 
		System.out.println("\n\n") ;
		
		
		
		
		
		// using a do while to print out a sting backwards
		System.out.println("*** Using a do while to print out a sting backwards ***\n") ;
		
		String tString = "University of York" ;
		int tCount = tString.length() ;
		
		do {
			
			System.out.print(tString.substring(tCount-1,tCount));
			tCount-- ;
		}while (tCount > 0);
		System.out.println("\n\n") ;
		

	}

}
