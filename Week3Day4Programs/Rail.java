package week3.day4.Week3Day4Programs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Rail {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver dr=new ChromeDriver(option);
		dr.manage().window().maximize();
		//		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		dr.get("https://erail.in/");
		dr.findElement(By.id("txtStationFrom")).clear();
		WebElement fromStation = dr.findElement(By.id("txtStationFrom"));
		fromStation.sendKeys("ms");
		Thread.sleep(500);
		fromStation.sendKeys(Keys.ENTER);

		Thread.sleep(200);

		dr.findElement(By.id("txtStationTo")).clear();
		WebElement toStation = dr.findElement(By.id("txtStationTo"));
		toStation.sendKeys("co");
		Thread.sleep(500);
		toStation.sendKeys(Keys.ENTER);

		dr.findElement(By.id("chkSelectDateOnly")).click();

		Thread.sleep(1000);

		List<WebElement> listOfTrains = dr.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2]/a"));
		List<String> trainNames = new ArrayList<String>();

		System.out.println(listOfTrains.size());

		for (WebElement eachEle : listOfTrains) {
			Thread.sleep(1000);

			String text = eachEle.getText();
			Thread.sleep(1000);

			trainNames.add(text);	
			System.out.println(text);
		}

	}
}
