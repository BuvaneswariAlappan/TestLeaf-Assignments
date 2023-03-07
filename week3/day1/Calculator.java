package week3.day1;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		add(5,6);
		add(5,6,10);
		
		sub(1000.00,500.00);
		sub(100, 50);
		
		mul(10,20.0);
		mul(20.0,30.0);
	}

	public static void mul(int i, double d) {
		System.out.println(i+" + "+d+ " = "+(i*d));
		
	}
	
	public static void mul(double i, double d) {
		System.out.println(i+" + "+d+ " = "+(i*d));
		
	}

	public static void sub(int d, int e) {
		System.out.println(d+" + "+e+ " = "+(d-e));
		
	}
	public static void sub(double d, double e) {
		System.out.println(d+" + "+e+ " = "+(d-e));
		
	}

	public static void add(int i, int j, int k) {
		System.out.println(i+" + "+j+" + "+k+ " = "+(i+j+k));
		
	}

	public static void add(int a, int b) {
		System.out.println(a+" + "+b+ " = "+(a+b));
		
	}

}
