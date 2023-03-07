package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListLearningInSelenium {	
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://leafground.com/dashboard.xhtml");

		List<WebElement> selectAllLinks = driver.findElements(By.tagName("a"));
		
//		List<Integer> ipl = new ArrayList<Integer>();
		
		int sizeOfAllLinks = selectAllLinks.size();
		
		System.out.println("size Of All Links"+sizeOfAllLinks);
		
		for(int i=0;i<selectAllLinks.size();i++) {
			WebElement nameOfText = selectAllLinks.get(i);
			String text = nameOfText.getText();
			System.out.println("text : "+text);
		}
	}
	
}
