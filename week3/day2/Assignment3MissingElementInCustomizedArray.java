package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class Assignment3MissingElementInCustomizedArray {
	
	 public static void main(String[] args){
	      List<Integer> list1 = new ArrayList<Integer>();
	      List<Integer> list2 = new ArrayList<Integer>();
	      list1.add(1);
	      list1.add(2);
	      list1.add(3);
	      list2.add(1);
	      list2.add(3);
	      list2.add(4);
	      for(int i = 0; i < list1.size(); i++){
	         if (list2.contains(list1.get(i)))
	         continue;
	            else
	         System.out.println("The missing element is : "+list1.get(i));
	      }

	   }

}
