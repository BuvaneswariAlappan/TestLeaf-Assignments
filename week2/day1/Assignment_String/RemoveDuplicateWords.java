package week2.day1.Assignment_String;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

				String sentence, result = "";
				String allWords[];
				
				sentence = "We learn java basics as part of java sessions in java week1";
				
				// Split the given sentence to get each word as String array
				allWords = sentence.split(" ");
				// Use for loop to remove duplicate words
				for(int i=0; i<allWords.length; i++) {
					for(int j=i+1; j<allWords.length; j++) {
						if(allWords[i].equals(allWords[j])) {
							allWords[j] = "remove";
						}
					}
				}
				
				// Convert to String
				for(String word: allWords) {
					if(word != "remove") {
						result = result + word + " ";
					}
				}
				
				// Display given String after removing duplicates
				System.out.println("\nSentence after removing duplicate words: " + result);
	}

}
