public class Listing_4_16 {
	public static void main(String[] args) {
		// Call a method to generate a random number in the range of a character.
		int randomUpperCaseLetterNumber = makeRandomUpperLetter(); // call a method to generate a random number.
		testMakeRandomUpperLetter(); // calls the testing code.

		// Note that (char) in front of our variable recasts it as 
		System.out.println("The random upper case letter of the day is: " + (char)randomUpperCaseLetterNumber);
	}
	public static int makeRandomUpperLetter(){
		// Range of Character values, page 125, table 4.4
		//Characters ('A' to 'Z'), Code Value in Decimal (65 to 90)
		
		// How to use a random number Page 122, bottom of the page, 4.2.5 The random Method
		// Also use the example on page 87.
		
		int lowerLimit = 65; // Digit for 'A'
		int upperLimit = 90; // Digit for 'Z'
		int Range = upperLimit-lowerLimit + 1; // the range of numbers we 
		int randomUpperCaseLetterNumber = lowerLimit + (int)(Math.random()*Range);
		//System.out.println(randomUpperCaseLetterNumber); // debugging print statement.
		return randomUpperCaseLetterNumber; // returns a number representing a random uppercase letter.
	}
	
	public static void testMakeRandomUpperLetter(){
		//char startingLetter = 'A'; // Where we start our testing cases.
		//char endingLetter   = 'Z'; // Where we end our testing cases.
		System.out.println("Begin the search."); // notes inside our testing console output.
		for (int letterIndex = 65; letterIndex<= 90; letterIndex++){
			System.out.println("The current letter we are searching for is: " + (char)letterIndex);
			System.out.print("Attempting: "); // notes inside our testing console output.
			boolean isLetterFound = false; 	  // keep looking as long as letter is not found.
			while(!isLetterFound){
				int randomUpperCaseLetterNumber = makeRandomUpperLetter(); // call the tested code.
				if(randomUpperCaseLetterNumber==letterIndex){ // check if it is a match.
					System.out.println("\nWe have a match for: " + (char)letterIndex +" using " + letterIndex);
					isLetterFound = true;
				}else{
					System.out.print(" " +randomUpperCaseLetterNumber ); // keep track of what was tested.
				} // end of if else
			}// end of while loop
		}
	}
}