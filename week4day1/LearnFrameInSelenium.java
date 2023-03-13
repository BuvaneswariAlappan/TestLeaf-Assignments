package week4.day1.week4day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFrameInSelenium {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver dr=new ChromeDriver(option);
		dr.manage().window().maximize();
		//		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		dr.get("https://www.leafground.com/frame.xhtml");
		
		Thread.sleep(2000);
		dr.switchTo().frame(0);
		Thread.sleep(2000);
		dr.findElement(By.id("Click")).click();
	}

}
