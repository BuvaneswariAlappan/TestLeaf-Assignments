package week3.day2;

public class Automation extends MultipleLangauge implements Language {

	public static void main(String[] args) {
		MultipleLangauge ml = new Automation();
		ml.python();
		ml.selenium();
		ml.ruby();
		((Automation) ml).java();

	}

	@Override
	public  void selenium() {
		System.out.println("Automation Class - selenium method override");
		
	}
	

	@Override
	void ruby() {
		System.out.println("Automation Class - ruby method override");
		
	}

	
	public void java() {
		System.out.println("Automation Class - java method ");
		
	}

	

}
