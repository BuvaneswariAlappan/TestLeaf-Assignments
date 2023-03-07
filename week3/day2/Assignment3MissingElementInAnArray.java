package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class Assignment3MissingElementInAnArray {

	private static int count;

	public static void find() {
	    
	    List<Integer> ints = new ArrayList<Integer>();
	    for (int i = 0; i < 100; i++) {
	        ints.add(i);
	    }
	    ints.remove(13);

	    //find the missing number
	    for (Integer i : ints) {
	        if (i != count) {
	            System.out.println("Missing Element in the array list is : "+count);
	            count++;
	        }
	        count++;
	    }
	}
    public static void main(String[] args)
    {
    	find();
    }

}
