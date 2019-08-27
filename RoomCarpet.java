/**************************************
 * Program Name:      RoomCarpet.java
 * @Author:           Cameron
 * Class:             CSC205
 * Date:              26 August 2019
 * Brief Description: Class that takes the dimensions of the room and
 *                    the cost per square foot of carpet and determines
 *                    the total price.
 *************************************/

package project3;

import java.text.DecimalFormat;  //DecimalFormat imported to show currency correctly

public class RoomCarpet  {
	
	private RoomDimension size;  //The area of a room
	private double carpetCost;   //The cost per square foot of carpet
	
	DecimalFormat df = new DecimalFormat("#.00");
	

/***
 * RoomCarpet Constructor
 * @param dim: Describes the dimensions of the room
 * @param cost: Describes the cost/ft of carpet
 * 
 * Initializes the area and cost with user chosen measurements
***/
	
	public RoomCarpet(RoomDimension dim, double cost)  {
		
		this.size = dim;
		this.carpetCost = cost;
		
	}
	
	
/***
 * getTotalCost Method
 * @return: Returns the area multiplied by the carpet cost
***/
	
	public double getTotalCost()  {
		
		return size.getArea() * carpetCost;
		
	}
	
	
/***
 * toString Method
 * @return: Returns a string with the cost per square foot and total cost of the carpet
 * 
 * String representation of the RoomCarpet object
 */
	
	public String toString()  {
		
		return "\nThe cost of carpet is $" + df.format(carpetCost) + " per square foot.\n" +
			   "The total cost to fill a " + size.getArea() + 
			   " square foot room is: $" + df.format(getTotalCost());
		
	}

}
