package GoogleSearch;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CalculatorService extends BaseDriver{
	
	@Test(priority = 3)
	public void CalculatorService()
	{
		initDriver();
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("2+1");
		driver.findElement(By.id("tsf")).submit();
		try {
			driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div"));
			System.out.println("Google calculator service verified");
		}
		catch (Exception exp)
		{
			System.out.println("Cause is : "+ exp.getCause());
			System.out.println("Message is :"+ exp.getMessage());
			exp.printStackTrace();

		}
	}

}
