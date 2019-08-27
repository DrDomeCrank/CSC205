/**

Program Name:      AuthoringAssistant.java
Author:            Cameron
Class:             CSC 205
Date Written:      22 August 2019
Brief Description: Takes a string and gives you several options how 
				   to alter or count characters

**/

package project1;

import java.util.Scanner;

public class AuthoringAssistant  {
	
		// Main Program Method //

	public static void main(String[] args)  {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Authoring Assistant. Please enter a string of text: ");
		
		String userInput = scan.nextLine();		// Scans for user defined string //
		
		System.out.println("You entered: " + userInput);
		
		char choice = printMenu(scan);		// Displays the menu options //

		while (choice != 'q')  {		// Choice options //	

			switch (choice)  {
			
				case 'c':		// Retrieves number of non-whitespace characters in the string //
					
					int charCount = getNumOfNonWSCharacters(userInput);
					System.out.println("Number of non-whitespace characters: "
									  + charCount + "\n");
					
					break;
					
				case 'w':		// Retrieves the number of words from the string //
					
					int wordCount = getNumOfWords(userInput);
					System.out.println("Number of words: " + wordCount + "\n");
					
					break;
					
				case 'f':		// Finds a specific word or substring in the string //
					
					System.out.println("Enter a word or phrase to be found: ");
					String toFind = scan.nextLine();

					System.out.println("\"" + toFind + "\" instances found: " + findText(userInput, toFind));
					
					break;
					
				case 'r':		// Replaces all exclamation points with periods //
					
					System.out.println("Edited text w/ !'s removed: \n" + replaceExclamation(userInput));
					
					break;
					
				case 's':		// Reduces all excessive white space to a single space //
					
					System.out.println("Edited text w/ spaces shortened: \n" + shortenSpace(userInput));
					
					break;
					
				default:		// Warning to input a valid character //
					
					System.out.println("Invalid option. Choose a valid option.");
				
			}

			choice = printMenu(scan);

		}
		
		
		if (choice == 'q')	{	// Quits the program //
			
			System.out.println("Goodbye!!");
			
		}
		
	}
	
	
	public static char printMenu(Scanner scan)	{	// Method to display the menu options //
		
		char choice = ' ';
		
		System.out.println("\n======== MENU ========\n" +			// Menu //
				   "c - Number of non-whitespace characters \n" + 
				   "w - Number of words \n" + 
				   "f - Find text \n" + 
				   "r - Replace all !'s \n" + 
				   "s - Shorten spaces \n" + 
			       "q - Quit \n");
		
		while (choice != 'c' && choice != 'w' && choice != 'f' && 
			   choice != 'r' && choice != 's' && choice != 'o' && 
			   choice != 'q')  {
		
			System.out.println("Choose an option: ");
		
			choice = scan.nextLine().charAt(0);
			
		}
		
		return choice;
	
	}

	
	public static int getNumOfNonWSCharacters(String userInput)	 {	// Method to get the # of non-whitespace chars //
		
		userInput = userInput.trim().replaceAll("\\s", "");
		
        return userInput.length();
		
	}
	
	
	public static int getNumOfWords(String userInput)  {		// Method to get the number of words //
		
		userInput = shortenSpace(userInput);		// Uses shortenSpace method to separate words easier //
		
		String[] wordCount = userInput.split(" ");
		return wordCount.length;
		
	}
	
	
	public static String replaceExclamation(String userInput)  {  // Replaces all !'s in the string //
	
		return userInput.trim().replaceAll("!",".");
		
	}
	
	
	public static String shortenSpace(String userInput)	 { 	// Shortens all spaces to 1 space length //

		return userInput.trim().replaceAll(" +"," ");
		
	}

	public static int findText(String userInput, String toFind)	 {	// Find a specific word in the string //
		
		int count = 0;
        int wordFind = 0;
        
        do  {
        	
        	wordFind = userInput.indexOf(toFind);		// searches number of times the word's in the string
        	
        	if (wordFind != -1)  {
        		
        		count++;
        		
        	}
        	
        	userInput = userInput.substring(wordFind + 1, userInput.length());
        	
        }  while (wordFind != -1);
        
        return count;
        
	}
	
	
}
