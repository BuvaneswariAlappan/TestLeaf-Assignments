package week3.Week3Day3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Assignment2MissingNumber {

	public static void main(String[] args) {
		int[] nums = {10,2,3,8,5,7,4,1,9};
		
        int sum =0, dup=0;
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums){
          if(set.contains(i)){
            dup = i;
            break;
          }
          set.add(i);
        }
       
        Arrays.sort(nums);
        System.out.println("Given Sorted array is : "+set);
        int x=1;
        for(int i=0;i<nums.length;i++){
          if(nums[i] == x){
            x++;
          }
          else{
            sum = dup + x;
            break;
          }
        }
    
        System.out.println("Missing number is :"+sum);
		
	}	
		
}


