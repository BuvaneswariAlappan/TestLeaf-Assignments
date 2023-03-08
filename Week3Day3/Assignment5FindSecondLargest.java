package week3.Week3Day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assignment5FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
			  Set<Integer> sortedSet = new TreeSet<Integer>();
			  
			  for (int i = 0; i < data.length; i++) {
				  sortedSet.add(data[i]);
			}
			  System.out.println("Sorted List");
			  System.out.println(sortedSet);
			  
			  List<Integer> arr = new ArrayList<Integer>(sortedSet);
			  
			  Integer remove = arr.remove(arr.size()-2);
			  System.out.print("\nRemove 2nd Largest Number is : ");
			  System.out.print(remove);
		


	}

}
