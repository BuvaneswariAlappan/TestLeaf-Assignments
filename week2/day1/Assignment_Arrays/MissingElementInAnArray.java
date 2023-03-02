package week2.day1.Assignment_Arrays;

public class MissingElementInAnArray {
	
	public  int getMissingNo(int[] nums, int n)
    {
        int sum = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++) {
        	System.out.print(nums[i]+" ");
            sum -= nums[i];
        }
        return sum;
    }
 
     public static void main(String[] args)
    {
    	 MissingElementInAnArray meiaObj = new MissingElementInAnArray();
        int[] arr = { 1,2,3,4,5,7,8,9,10 };
        int N = arr.length;
        System.out.println("Given Array ");
        System.out.println("\nMissing number in this array is " + meiaObj.getMissingNo(arr, N));
    }

}
