package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class Assignment1FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);
		
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(7);
		
		System.out.println(list1);
		System.out.println(list2);
		
		list1.retainAll(list2);
		
		System.out.println("Intersection between list1 and List2 :"+list1);
	}

}
