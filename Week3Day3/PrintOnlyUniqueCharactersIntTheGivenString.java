package week3.Week3Day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintOnlyUniqueCharactersIntTheGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="google";
		
		char[] charArray = name.toCharArray();
		
		Set<Character> uniqueString = new LinkedHashSet<Character>();
		
		for(Character ch:charArray) {
			if(uniqueString.add(ch)) {
				
			}
		}
		System.out.println(uniqueString);
	}

}
