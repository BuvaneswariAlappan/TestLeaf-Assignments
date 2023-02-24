package week1.day2;

public class TwoWheeler {
	
	public  int noOfWheeles(int noOfWheels) {
		return noOfWheels;
		// TODO Auto-generated method stub

	}
	
	public short noOfMirrors(short mirrors) {
		return mirrors;
		// TODO Auto-generated method stub

	}
	
	public long chassisNumber(long chassisNo) {
		return chassisNo;
		// TODO Auto-generated method stub

	}
	
	public boolean isPunctured(boolean punctured) {
		return punctured;
		// TODO Auto-generated method stub

	}
	
	public String bikeName(String bname) {
		return bname;
		// TODO Auto-generated method stub

	}
	
	public double runningKMs(double totalrunningkms) {
		return totalrunningkms;
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler twoWheeler = new TwoWheeler();		 
		
		System.out.println("Number Of Wheels " + twoWheeler.noOfWheeles(2)); 	
		System.out.println("Number of Mirrors  "+twoWheeler.noOfMirrors( (short) 2));
		System.out.println("chassisNumber "+ twoWheeler.chassisNumber(1453454534));
		System.out.println("Is the car is punctured "+twoWheeler.isPunctured(true));
		System.out.println("Bike Name "+twoWheeler.bikeName("Bullet 500CC"));		
		System.out.println("Running KMs "+twoWheeler.runningKMs(16000));

	}

}
