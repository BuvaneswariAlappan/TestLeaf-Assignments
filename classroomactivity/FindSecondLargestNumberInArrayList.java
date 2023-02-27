package week2.day1.classroomactivity;

import java.util.Arrays;

public class FindSecondLargestNumberInArrayList {

	public static void main(String[] args) {
		 int temp, size;
	      int array[] = {40, 60, 25, 63, 96, 57};
	      size = array.length;
	      System.out.println("Sorting the Array");
	      Arrays.sort(array);
	      for(int i =0;i<size;i++) {
	    	  System.out.print(array[i]+" ");
	      }
	      
	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;	                
	            }
	         }
	      }
	      System.out.println("\nSecond largest number in this array is:: "+array[size-2]);

	}

}
