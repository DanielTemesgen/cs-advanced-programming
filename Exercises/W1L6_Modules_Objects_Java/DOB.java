

public class DOB 
{
	private int iDay ;
	private int iMonth ;
	private int iYear ;
	
	private static char iDeliminator = '/' ;

	
	public DOB(final String pDOB)
	{
		int tIndex1 = pDOB.indexOf(iDeliminator, 0) ;
		int tIndex2 = pDOB.indexOf(iDeliminator, tIndex1+1) ;
		
		String tDayS = pDOB.substring(0, tIndex1) ;
		
		String tMonthS = pDOB.substring(tIndex1 +1, tIndex2) ;
		
		String tYearS = pDOB.substring(tIndex2+1) ;
		
		int tDay = Integer.parseInt(tDayS) ;
		int tMonth = Integer.parseInt(tMonthS) ;
		int tYear = Integer.parseInt(tYearS) ;
	
		boolean tCorrectDate = checkDate(tDay, tMonth, tYear) ;
		
		if(tCorrectDate)
		{
			iDay = tDay ;
			iMonth = tMonth ;
			iYear = tYear ;
		}
		else
		{
			iDay = -1 ;
			iMonth = -1 ;
			iYear = -1 ;
		}// end if
	
	}// end constructor

	
	
	private boolean checkDate(final int pDay, final int pMonth, final int pYear)
	{
		boolean tDayMonthTest = false ;
		
		if((pMonth >=1 && pMonth<= 12) && (pDay >= 1 && pDay <=31))
		{	
			// 30 days has Sept 9, April 4, June 6, Nov 11
			if((pMonth == 4 || pMonth == 6 || pMonth == 9 || 
					 pMonth == 11) && pDay <= 30)
			{
				tDayMonthTest = true ;
			}
			else if ((pMonth == 1 || pMonth == 3 || pMonth == 5 || pMonth == 7 || pMonth == 8
					|| pMonth == 10 || pMonth == 12) && pDay <= 31)
			{
				tDayMonthTest = true ;
			}
			
			else if(pMonth == 2 && pDay <= 29)
			{
				//29 in leap
				if(pYear%4 == 0 && pDay == 29)
				{
					tDayMonthTest = true ;
				}
				// Feb 28 
				else  if(pDay <= 28)
				{
					tDayMonthTest = true ;
				}	
			}// end if	
		}// end if
		
		// TODO: need test for == to or less than current year
		if(pYear < 1900)
		{
			 tDayMonthTest = false ;
		}
		
		return tDayMonthTest ;

	}// end method
	
	
	
	public int getDay() 
	{
		return iDay;
	}// end method
	
	
	
	public boolean setDay(int pDay) 
	{
		boolean tCorrectDate = checkDate(pDay, iMonth, iYear) ;
		
		if(tCorrectDate)
		{
			iDay = pDay ;
		}
		return tCorrectDate ;
	}// end method


	
	public int getMonth() 
	{
		return iMonth;
	}// end method


	
	public boolean setMonth(int pMonth) 
	{
		boolean tCorrectDate = checkDate(iDay, pMonth, iYear) ;
		
		if(tCorrectDate)
		{
			iMonth = pMonth ;
		}
		return tCorrectDate ;
	}// end method

	

	public int getYear() 
	{
		return iYear;
	}// end method

	
	
	public boolean setYear(int pYear) 
	{
		boolean tCorrectDate = checkDate(iDay, iMonth, pYear) ;
		
		if(tCorrectDate)
		{
			iYear = pYear ;
		}
		return tCorrectDate ;
	}// end method
	
	
	
	
	
	
	public String toString()
	{
    	String tReturn = null ;
    	
    	if(iDay > 0 && iMonth > 0 && iYear > 0)
    	{
    		tReturn = Integer.toString(iDay) + iDeliminator + iMonth + iDeliminator + iYear ;
    	}
    	return tReturn ;
	}// end method
	

	
}// end class
