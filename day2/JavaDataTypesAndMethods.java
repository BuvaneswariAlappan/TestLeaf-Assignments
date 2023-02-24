package week1.day2;

public class JavaDataTypesAndMethods {

	public String concordinateTwoString(String s1, String s2) {

		String s3 = s1+s2;

		return s3;
	}

	public int addTwoNumbers(int a, int b) {
		int c = a+b;

		return c;
	}

	public double subOfTwoNumbers(double n1, double n2) {
		double n3=0 ;
		if(n1>n2)
			n3=n1-n2;
		else
			n3=n2-n1;

		return n3;
	}

	public  float multiplicationOfTwoNo(float f1, float f2) {

		return  f1*f2;		 
	}

	public boolean booleanMethodDataType() {	

		return true;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaDataTypesAndMethods dObj = new JavaDataTypesAndMethods();
		System.out.println(" Concordination of two Strings :"+ dObj.concordinateTwoString("Buvi", "Alappan"));
		System.out.println(" Addition of Two Numbers : "+ dObj.addTwoNumbers(13, 12));

		double subtractionOfNo = dObj.subOfTwoNumbers(5000, 3000);
		System.out.println(" Subtraction of Two Numbers : "+subtractionOfNo);

		System.out.println(" Multiplkication of Two Numbers :"+ dObj.multiplicationOfTwoNo(2.5f, 10.6f));
		
		System.out.println(" Boolean Method Result : "+dObj.booleanMethodDataType());
		
	}

}
