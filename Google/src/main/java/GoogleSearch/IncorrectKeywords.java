package GoogleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IncorrectKeywords extends BaseDriver{
	
	@Test(priority = 9)
	public void IncorrectKeywords() throws InterruptedException
	{
		initDriver();
		driver.findElement(By.linkText("English")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("dsmlkmcds654dcs\\");
		driver.findElement(By.id("tsf")).submit();
		Thread.sleep(2000);
		try {
			WebElement item = driver.findElement(By.cssSelector(".card-section > :nth-child(1)"));
			if(item.getText().contains("did not match any documents."))
			{
			System.out.println("Correct response");
			}
		}
		catch (Exception exp)
		{
			System.out.println("Cause is : "+ exp.getCause());
			System.out.println("Message is :"+ exp.getMessage());
			exp.printStackTrace();

		}
	}

}
