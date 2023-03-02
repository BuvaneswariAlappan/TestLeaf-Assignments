package week2.day1.Assignment_Arrays;

public class MissingElementInAnArrayAnotherEx {

	 public static void main(String[] args) {

		   int total_num;
		   int[] numbers = new int[]{1,8,3,4,5,2,7,9};
		   total_num = 9;
		   int expected_num_sum = total_num * ((total_num + 1) / 2);
		   int num_sum = 0;
		   for (int i: numbers) {
		    num_sum += i;
		   }
		   	   System.out.print("Missing Number is ");
		       System.out.print( expected_num_sum - num_sum);
			   System.out.print("\n");
		  }
	
}
