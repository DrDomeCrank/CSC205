/**************************************
 * Program Name:      CarpetCalculator.java
 * @Author:           Cameron
 * Class:             CSC205
 * Date:              26 August 2019
 * Brief Description: Driver class that uses the RoomDimension and RoomCarpet
 *                    objects to evaluate and display the total cost to install
 *                    carpet in a given room.
 *************************************/

package project3;

import java.util.Scanner;

public class CarpetCalculator {
	
/***
 * Main Method
 * @param args
 * 
 * Receives measurements and price of carpet/ft^2 and displays the total cost
 */

	public static void main(String[] args) {
		
		int length; //Length of the room (ft)
		int width;  //Width of the room (ft)
		int cost;   //Cost of carpet per foot

		System.out.println("This system will display the price to carpet a room.");
		System.out.println("You must input the room's dimension by feet.");
		
		// Scans for the length of the room
		
		System.out.print("Enter the length first: ");
		Scanner scan = new Scanner(System.in);
		length = scan.nextInt();
		
		//Scans for the width of the room
		
		System.out.print("Next, enter the width: ");
		width = scan.nextInt();
		
		//Scans for the cost per square foot of carpet
		
		System.out.print("Last, enter the cost per square foot of carpet: ");
		cost = scan.nextInt();
		
		//Uses RoomDimension object to find the area
		
		RoomDimension room1 = new RoomDimension(length, width);
		System.out.println();
		System.out.println(room1);
		
		//Uses RoomCarpet object to find the total cost
		
		RoomCarpet carpetCost = new RoomCarpet(room1, cost);
		System.out.println(carpetCost);
		
		scan.close();
		
	}

}
