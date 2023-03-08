package week3.Week3Day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment6RemoveDuplicates {

	public static void main(String[] args) {
		String str = "PayPalIndia";
		
		 Set<Character> set = new LinkedHashSet<Character>();   
       
        for(int i=0;i<str.length();i++)   
            set.add(str.charAt(i));   
            
       
        for(Character ch : set)   
            System.out.print(ch);   
		
		

	}

}
