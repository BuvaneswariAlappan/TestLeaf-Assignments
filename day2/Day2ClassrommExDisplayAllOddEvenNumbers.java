package week1.day2;

public class Day2ClassrommExDisplayAllOddEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=20;
		System.out.println("Even numbers below "+count);
		for(int i=1;i<count;i++) {
			
			if(i%2==0)
				System.out.print(i+" ");
		}
		
		System.out.println("\n\nOdd numbers below "+count);
		for(int i=0;i<count;i++) {
			
			if(i%2!=0)
				System.out.print(i+" ");
		}
	}

}
