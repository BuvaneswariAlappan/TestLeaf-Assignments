package week2.day1.Assignment_String;

public class ChangeOddIndexIntoUpperCase {

	public static void main(String[] args) { 
		
		String sampleString = "changeme"; 
	
		StringBuffer updatedString = new StringBuffer(); 
		
		char[] characters = sampleString.toCharArray(); 
		
		for (int i = 0; i < characters.length; i++) { 			
			char c = characters[i]; 			
			if (i % 2 == 0) { 				
				c = Character.toUpperCase(c); 
			} 			
			updatedString.append(c); 
		} 
		System.out.println("Odd Index string is in Upper Case : " + updatedString.toString()); 
	} 

}
