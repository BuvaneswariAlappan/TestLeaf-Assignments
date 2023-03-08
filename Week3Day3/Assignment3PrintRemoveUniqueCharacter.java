package week3.Week3Day3;

import java.util.HashSet;
import java.util.Set;

public class Assignment3PrintRemoveUniqueCharacter {

	public static void main(String[] args) {
		String str = "babu";
		
		Set<Character> dup = new HashSet<Character>();
		char[] charArray = str.toCharArray();
		for(Character ch:charArray) {
			if(!dup.add(ch)) {
				dup.remove(ch);
			}
		}
		System.out.println(dup);
		
	}

}
