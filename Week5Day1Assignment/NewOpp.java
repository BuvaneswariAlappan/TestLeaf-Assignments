package week5.Day1.Week5Day1Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class NewOpp extends BaseClass{
	@Test(dataProvider="create")
	public void opportune(String cn, String fn) throws InterruptedException {

		driver.findElement(By.xpath("(//div[@class='tooltipTrigger tooltip-trigger uiTooltip']/div)[2]")).click();
		driver.findElement(By.xpath("//lightning-button[@class='slds-button slds-p-horizontal--small']/button")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(800);
		WebElement j = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", j);

		driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
		WebElement opName = driver.findElement(By.xpath("(//input[@class='slds-input'])[4]"));
		Thread.sleep(8000);
		opName.sendKeys(cn);
		Thread.sleep(8000);
		
//		WebElement clickCloseDate = driver.findElement(By.xpath("//input[@name='CloseDate']"));
//		clickCloseDate.click();
//		//span[.='20']
//		//input[@name='CloseDate']
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys(fn);

		driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")).click();
		Thread.sleep(1200);

		driver.findElement(By.xpath("(//lightning-base-combobox-item[@class='slds-media slds-listbox__option slds-media_center slds-media_small slds-listbox__option_plain'])[4]")).click();

		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		WebElement n = driver.findElement(By.xpath("//slot[@class='slds-page-header__title slds-m-right--small slds-align-middle clip-text slds-line-clamp']/lightning-formatted-text"));
		String name = n.getText();

		SoftAssert sa = new SoftAssert();

		boolean bool = driver.findElement(By.xpath("//slot[@class='slds-page-header__title slds-m-right--small slds-align-middle clip-text slds-line-clamp']/lightning-formatted-text")).isDisplayed();
		sa.assertTrue(bool);
		sa.assertFalse(bool);
		System.out.println(name);

		if(n.isDisplayed()) {
			System.out.println("Verification: True");
		}else {
			System.out.println("Verification: False");
		}

		sa.assertAll();
		
	}

	@DataProvider(name="create")
	public String[][] create() {
		String[][] data= new String[1][2];

		data[0][0]="Buvi";
		data[0][1]="03/19/2023";


		data[1][0]="Ravi";
		data[1][1]="03/20/2023";


		return data;

	}

}
