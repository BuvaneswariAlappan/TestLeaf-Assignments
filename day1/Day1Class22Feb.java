package week1.day1;

public class Day1Class22Feb {
	
	public void method1() {
		System.out.println("Example of Println");
		System.out.println("------------------");
		
	}
	
	public void method2() {
		// TODO Auto-generated method stub
		System.out.print("Example of print :");
		System.out.print(" Second Print details concordinate with before print system out print line and NOTE ln is missing in print");
	}
	
	public void method3PassingParameters(int a, int b) {
		// TODO Auto-generated method stub
		
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		
		System.out.println(" Addition of two numbers "+ a +" and "+ b +" is "+ add);
		System.out.println(" Subtraction of two numbers "+ a +" and "+ b +" is "+ sub);
		System.out.println(" Multiplication of two numbers "+ a +" and "+ b +" is "+ mul);
		System.out.println(" Division of two numbers "+ a +" and "+ b +" is "+ div);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day1Class22Feb obj = new Day1Class22Feb();
		obj.method1();
		obj.method2();
		obj.method3PassingParameters(6, 10);
	}

}
