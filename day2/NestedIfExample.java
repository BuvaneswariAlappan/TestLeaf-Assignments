package week1.day2;

public class NestedIfExample {

	public static void main(String[] args) {
		 double income = 110000;
		 float rate= 0.0f;
		 if(income<0) rate = (float) 0.00f;
		 else if(income<8925) rate = (float) 0.10;
		 else if(income<36250) rate = (float) 0.15;
		 else if(income<87850) rate = (float) 0.23;
		 else if(income<183250) rate = (float) 0.28;
		 else if(income<398350) rate = (float) 0.33;
		 else if(income<400000) rate = (float) 0.35;
		 else rate=(float) 0.396;
		 
		 System.out.println("Income : "+income+" Rate Of Interest: "+ rate);
		
	}

}
