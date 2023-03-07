package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment2FindSecondLargest {

	public static void main(String[] args) {
		// int[] data = {3,2,11,4,6,7};
		int temp = 0;
		List<Integer> data = new ArrayList<Integer>();
		
		data.add(3);
		data.add(2);
		data.add(11);
		data.add(4);
		data.add(6);
		data.add(7);
		
		Collections.sort(data);
		System.out.println(data);
		
		 temp=data.get(data.size()-2);
	     System.out.println("Second highest number");
	     System.out.println(temp);
	}

}
