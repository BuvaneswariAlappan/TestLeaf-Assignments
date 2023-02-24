package week1.day2;

public class ProgramForSwitch {

	public static void main(String[] args) {
		
		int day = 5;
		
		switch(day) {
		case 1: System.out.println("Day : "+day+ " is Sunday"); break;
		case 2: System.out.println("Day : "+day+ " is Monday"); break;
		case 3: System.out.println("Day : "+day+ " is Tuesday"); break;
		case 4: System.out.println("Day : "+day+ " is Wednesday"); break;
		case 5: System.out.println("Day : "+day+ " is Thursday"); break;
		case 6: System.out.println("Day : "+day+ " is Friday"); break;
		case 7: System.out.println("Day : "+day+ " is Saturday"); break;
		}
		
		 
		String browser = "Safari";
		switch(browser) {
		case "Safari": System.out.println("Browser "+browser+ " is Apple"); break;
		case "Chrome": System.out.println("Browser "+browser+ " is Google"); break;
		case "Edge": System.out.println("Browser "+browser+ " is Microsoft"); break;
		case "Firefox": System.out.println("Browser "+browser+ " is Mozilla"); break;
		}
	}

}
