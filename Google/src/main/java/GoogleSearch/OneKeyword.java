package GoogleSearch;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OneKeyword extends BaseDriver{
	
	@Test(priority = 1)
	public void OneKeyword() throws InterruptedException
	{
		initDriver();
		driver.findElement(By.name("q")).sendKeys("java");
		driver.findElement(By.id("tsf")).submit();
		Thread.sleep(2000);
		try {

			driver.findElement(By.id("wp_thbn_19"));
			System.out.println("Correct result");
		}
		catch (Exception exp)
		{
			System.out.println("Cause is : "+ exp.getCause());
			System.out.println("Message is :"+ exp.getMessage());
			exp.printStackTrace();

		}
		
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("instabug");
		driver.findElement(By.id("tsf")).submit();
		try {

			driver.findElement(By.id("wp_thbn_13"));
			System.out.println("Correct result");
		}
		catch (Exception exp)
		{
			System.out.println("Cause is : "+ exp.getCause());
			System.out.println("Message is :"+ exp.getMessage());
			exp.printStackTrace();

		}
		
	}

}
