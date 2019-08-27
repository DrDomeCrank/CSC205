/**************************************
 * Program Name:      RoomDimension.java
 * @Author:           Cameron
 * Class:             CSC205
 * Date:              26 August 2019
 * Brief Description: Class that takes the length and width measurements
 *                    of a room and determines the total area.
 *************************************/

package project3;

public class RoomDimension  {
	
	private double length;  // Length measurement of a room
	private double width;   // Width measurement of a room
	
/***
 * RoomDimension Constructor
 * @param l: Describes the length
 * @param w: Describes the width
 * 
 * Initializes both the length and width to chosen measurements
***/
	
	public RoomDimension(double l, double w)  {
		
		this.length = l;
		this.width = w;
		
	}
	
	
/***
 * getArea Method
 * @return: Returns the length and width multiplied together
 * 
 * Gets the area of the room
***/
	
	public double getArea()  {
		
		return length * width;
		
	}
	
	
/***
 * toString Method
 * @return: Returns a string with the length, width, and area of the room
 * 
 * String representation of the RoomDimension object
***/
	
	public String toString()  {
		
		return "Room Dimensions:\nLength: " + length + " feet \nWidth: "
			  + width + " feet \nArea: " + getArea() + " square feet";
		
	}

}
