/**************************************
 * Program Name:      Month.java
 * @Author:      	    Cameron Murrill
 * Class:             CSC205
 * Date:              26 August 2019
 * Brief Description: Class that creates Month objects using three different constructors
 * 					  for three different ways of initializing the object and compares
 * 					  them to determine which month is greater, less than, or equal to
 * 					  a specified month. 
 *************************************/

package project2;

public class Month  {
	
	private int monthNumber;  // The chronological number of a month in a year 

/***
 * Month Constructor #1
 *
 * Initializes monthNumber to 1
***/

	public Month()  {
		
		this.monthNumber = 1;
		
	}
	

/***
 * Month Constructor #2
 * @param m: Describes the monthNumber
 * 
 * Initializes monthNumber to user chosen number. If the number is outside
 * the range, it defaults to 1.
***/
	
	public Month(int m)  {
		
		if (m >= 1 && m <= 12)  {
			
			this.monthNumber = m;
			
		} else {
				
			this.monthNumber = 1;
				
		}
		
	}
	
	
/***
 * Month Constructor #3
 * @param monthName: Describes the name of the month
 * 	
 * Initializes monthNumber to a user chosen name. If an invalid name is 
 * chosen, the number defualts to 1.
***/
	
	public Month(String monthName)  {
		
		switch (monthName)  {
		
			case "January":
				
				monthNumber = 1;
				break;
				
			case "February":
				
				monthNumber = 2;
				break;
				
			case "March":
				
				monthNumber = 3;
				break;
			
			case "April":
				
				monthNumber = 4;
				break;
				
			case "May":
				
				monthNumber = 5;
				break;
			
			case "June":
				
				monthNumber = 6;
				break;
				
			case "July":
				
				monthNumber = 7;
				break;
				
			case "August":
				
				monthNumber = 8;
				break;
				
			case "September":
				
				monthNumber = 9;
				break;
				
			case "October":
				
				monthNumber = 10;
				break;
				
			case "November":
				
				monthNumber = 11;
				break;
				
			case "December":
				
				monthNumber = 12;
				break;
				
			default:
				
				monthNumber = 1;
		
		}
		
	}
	
	
/***
 * getMonthName Method
 * @return: Returns the name of the month depending on the number evaluated
***/

	public String getMonthName()  {
		
		switch (monthNumber)  {
		
			case 1:
				
				return "January";
				
			case 2:
				
				return "February";
				
			case 3:
				
				return "March";
				
			case 4:
				
				return "April";
				
			case 5:
				
				return "May";
				
			case 6:
				
				return "June";
				
			case 7:
				
				return "July";
				
			case 8:
				
				return "August";
				
			case 9:
				
				return "September";
				
			case 10:
				
				return "October";
				
			case 11:
				
				return "November";
				
			case 12:
				
				return "December";
				
		}
		
		return "This shouldn't display. How did you do that?";
		
	}
	
	
/***
 * getMonthNumber Method
 * @return: Returns the monthNumber
***/
	
	public int getMonthNumber()  {
		
		return this.monthNumber;
		
	}
	

/***
 * setMonthNumber Method
 * @param m: Describes the the chosen month number
 * 
 * Mutates the month number to the one given in the parameter. If the number
 * is out of range, it defaults to 1.
***/

	public void setMonthNumber(int m)  {
		
		if (m >= 1 && m <= 12)  {
		
			this.monthNumber = m;
		
		} else {
			
			this.monthNumber = 1;
			
		}
		
	}
	
	
/***
 * greaterThan Method
 * @param month2: Describes the month being called to the method
 * @return: Returns true if the current month is greater than the one called.
 * 			Returns false if it's less.
***/

	public boolean greaterThan(Month month2)  {
		
		if (monthNumber > month2.monthNumber) {
			
			return true;
			
		} else {
		
			return false;
		
		}
		
	}
	
	
/***
 * lessThan Method
 * @param month2: Describes the month being called to the method
 * @return: Returns true if the current month is less than the one called.
 * 			Returns false if it's greater.
***/

	public boolean lessThan(Month month2)  {
		
		if (monthNumber < month2.monthNumber)  {
			
			return true;
			
		} else {
		
			return false;
		
		}
		
	}
	

/***
 * equals Method
 * @param month2: Describes the month being called to the method
 * @return: Returns true if the current month is equal to the one called.
 * 			Returns false if they're not equal to each other.
***/

	public boolean equals(Month month2)  {
		
		if (monthNumber == month2.monthNumber)  {
			
			return true;
			
		} else {
		
			return false;
		
		}
		
	}
	
	
/***
 * toString Method
 * 
 * String representation of the Month object
***/

	public String toString()  {
		
		return getMonthName();
		
	}

}

/*******************************************
Program Output:
 
Month 1 is January
Month 1 is January
Month 1 is January
Month 2 is February
Month 3 is March
Month 4 is April
Month 5 is May
Month 6 is June
Month 7 is July
Month 8 is August
Month 9 is September
Month 10 is October
Month 11 is November
Month 12 is December
Month 10 is October
Month 5 is May
October and May are NOT equal.
October is greater than May
October is NOT less than May
Month 3 is March
Month 12 is December
Month 1 is January

*******************************************/
