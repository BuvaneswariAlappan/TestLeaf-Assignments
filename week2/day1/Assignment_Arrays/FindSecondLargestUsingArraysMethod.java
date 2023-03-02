package week2.day1.Assignment_Arrays;

import java.util.Arrays;

public class FindSecondLargestUsingArraysMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {30,60,20,40,10,50};
		Arrays.sort(arr);
		for(int i =0;i<arr.length;i++) {
	    	  System.out.print(arr[i]+" ");
	      }
		
		System.out.println("\nSecond Largest Number Using ArraysMethod : "+arr[arr.length-2]);

	}

}
