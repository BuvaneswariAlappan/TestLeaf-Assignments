package week3.Week3Day3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Classroom1RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num={3,5,7,2,5,7,9,2,1,54,8,4,6,4,8};
		//i. declare a set
		//ii. hint (i need random order)
		Set<Integer> dupSet = new HashSet<Integer>();
		Set<Integer> unique = new TreeSet<Integer>();
		
		//iii.Iterate through a loop and add data
		for(int i=0;i<num.length;i++) {
			if(unique.add(num[i])) {
				dupSet.add(num[i]);
			}			
		}
		//iv.print values in random order
		System.out.println(dupSet);
	}
}
