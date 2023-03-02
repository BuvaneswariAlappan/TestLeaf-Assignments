package week2.day1.classroomactivity;

import java.util.Arrays;

public class FindDuplicateNumbersInGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,2,9,6,8,1,6,3,7,6,4,2};
		
		Arrays.sort(arr);
		
		System.out.println("Sorted Array List");
		
		for(int i=0;i<arr.length-1;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println("\nDuplicated numbers in this array ");
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.print(arr[i]+"  ");
			}
		}
	}

}
