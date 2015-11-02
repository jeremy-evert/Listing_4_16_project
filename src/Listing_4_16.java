public class Listing_4_16 {
	public static void main(String[] args) {
		// Call a method to generate a random number in the range of a character.
		int randomUpperCaseLetterNumber = makeRandomUpperLetter();
		testMakeRandomUpperLetter();

		// Note that (char) in front of our variable recasts it as 
		System.out.println("The random upper case letter of the day is: " + (char)randomUpperCaseLetterNumber);
	}
	public static int makeRandomUpperLetter(){
		// Range of Character values, page 125, table 4.4
		//Characters ('A' to 'Z'), Code Value in Decimal (65 to 90)
		
		// How to use a random number Page 122, bottom of the page, 4.2.5 The random Method
		// Also use the example on page 87.
		
		int lowerLimit = 65;
		int upperLimit = 90;
		int Range = upperLimit-lowerLimit + 1;
		int randomUpperCaseLetterNumber = lowerLimit + (int)(Math.random()*Range);
		//System.out.println(randomUpperCaseLetterNumber);
		return randomUpperCaseLetterNumber;
	}
	
	public static void testMakeRandomUpperLetter(){
		// try to test the code I wrote.
		char startingLetter = 'A';
		char endingLetter = 'Z';
		
		 
		System.out.println("Begin the search.");
		for (int letterIndex = 65; letterIndex<= 90; letterIndex++){
			System.out.println("The current letter we are searching for is: " + (char)letterIndex);
			
			boolean isLetterFound = false;
			System.out.print("Attempting: ");
			while(!isLetterFound){
				
				int randomUpperCaseLetterNumber = makeRandomUpperLetter();
				if(randomUpperCaseLetterNumber==letterIndex){
					System.out.println("\nWe have a match for: " + (char)letterIndex +" using " + letterIndex);
					isLetterFound = true;
				}else{
					System.out.print(" " +randomUpperCaseLetterNumber );
				}
			}
		}
		
	}
}
