package week3.Week3Day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment7AjioBagsSearch {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver dr=new ChromeDriver(option);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		dr.get("https://www.ajio.com/");
		
		dr.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		WebElement chooseGender = dr.findElement(By.xpath("(//div[@class='facet-linkhead']/label)[1]"));
		chooseGender.click();
		try {
			chooseGender.click();
			}catch(StaleElementReferenceException ex) {
				chooseGender = dr.findElement(By.xpath("(//div[@class='facet-linkhead']/label)[1]"));
				chooseGender.click();
			}
		dr.findElement(By.xpath("(//div[@class='facet-linkhead']/label)[1]")).click();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		WebElement chooseSelection = dr.findElement(By.xpath("(//div[@class='facet-body'])[2]//li[2]"));
		try {
		chooseSelection.click();
		}catch(StaleElementReferenceException ex) {
			chooseSelection = dr.findElement(By.xpath("(//div[@class='facet-body'])[2]//li[2]"));
			chooseSelection.click();
		}

		System.out.println("Items Found: "+chooseSelection.getText());
		

		List<WebElement> allPopupBags = dr.findElements(By.className("brand"));		
		int sizeOfallPriceValues = allPopupBags.size();
		
		for(int i=0;i<=sizeOfallPriceValues-1;i++) {
			WebElement setAllPrice = allPopupBags.get(i);
			String textOfsetAllPrice = setAllPrice.getText();
						
			System.out.println("All Display for brand class : "+textOfsetAllPrice);
		}
		
	}

}
