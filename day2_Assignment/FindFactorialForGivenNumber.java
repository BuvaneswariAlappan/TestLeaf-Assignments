package week1.day2_Assignment;

public class FindFactorialForGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5,fact=1;
		for(int i =1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}

}
