package week2.day1.Assignment_Arrays;

public class IntersectionBetweenTwoArrays {

	public static void main(String args[]) {
		int myArray1[] = {1,2,3,4,5,6,7,8};
		int myArray2[] = {1,6,8,9,10,11,12};
		System.out.println("Intersection between two arrays :");

		for(int i = 0; i<myArray1.length; i++ ) {
			for(int j = 0; j<myArray2.length; j++) {
				if(myArray1[i]==myArray2[j]) {
					System.out.print(myArray2[j]+"  ");
				}
			}
		}
	}

}
