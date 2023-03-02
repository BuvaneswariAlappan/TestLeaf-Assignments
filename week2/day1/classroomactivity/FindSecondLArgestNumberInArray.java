package week2.day1.classroomactivity;

import java.util.Arrays;

public class FindSecondLArgestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,2,9,6,8,1,6,3,7,6,4,2};

		Arrays.sort(arr);

		System.out.println("Sorted Array List");

		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

//		System.out.println("\nFind Second Largest Number In Array ");
//		for(int i=arr.length;i<0;i++) {
//			//System.out.println(arr.length-2);
//		}
//		System.out.println(arr.length-2);
	}

}
