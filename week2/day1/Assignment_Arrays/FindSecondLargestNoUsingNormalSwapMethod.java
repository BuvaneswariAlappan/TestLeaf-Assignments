package week2.day1.Assignment_Arrays;

public class FindSecondLargestNoUsingNormalSwapMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {40,20,60,10,50,30};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp= arr[i];
					arr[i] = arr[j];
					arr[j] = temp;				
				}
			}
		}

		System.out.println("Sorting the array using swap");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

		System.out.println("\nSecond Largest Number in the array is "+arr[arr.length-2]);
	}

}
