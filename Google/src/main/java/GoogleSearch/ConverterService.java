package GoogleSearch;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ConverterService extends BaseDriver{

	@Test(priority = 6)
	public void ConverterService() throws InterruptedException
	{
		initDriver();
		driver.findElement(By.name("q")).sendKeys("10USD");
		driver.findElement(By.id("tsf")).submit();
		Thread.sleep(1500);
		try {

			driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[9]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div"));
			System.out.println("Google Converter service verified");
		}
		catch (Exception exp)
		{
			System.out.println("Cause is : "+ exp.getCause());
			System.out.println("Message is :"+ exp.getMessage());
			exp.printStackTrace();

		}
	}

}
