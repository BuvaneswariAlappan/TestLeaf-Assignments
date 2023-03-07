package week3.day2;

public class OnePlus extends AndroidTV{

	public  void playVideo() {
		 System.out.println("OnePlus Class - playVideo method ");
		
	}
	public static void main(String[] args) {
		OnePlus op = new OnePlus();
		op.playVideo();
		op.openApp();
	}

}
