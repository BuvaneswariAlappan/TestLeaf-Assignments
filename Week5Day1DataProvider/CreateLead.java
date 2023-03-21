package week5.Day1.Week5Day1DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass{


	@Test(dataProvider="create")

	public  void createdata(String cn,String fn,String ln) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cn);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fn);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(ln);
		driver.findElement(By.name("submitButton")).click();

	}

	@DataProvider(name="create")
	public String[][] fetchData() {

		String[][] data=new String[3][3];
		//row count,column count

		//1st set of data
		data[0][0]="TestLeaf";
		data[0][1]="Buvaneswari";
		data[0][2]="Alappan";

		//2st set of data
		data[1][0]="Schendier";
		data[1][1]="Arivazhgan";
		data[1][2]="Alappan";

		//3rd set of data
		data[2][0]="MOL";
		data[2][1]="Karthikeyn";
		data[2][2]="Alappan";
		return data;
	}






}






