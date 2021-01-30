package GoogleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FeelingLucky extends BaseDriver{


	@Test(priority = 2)
	public void Feelinglucky1()
	{
		initDriver();
		boolean FeelLuckyDisplayed = driver.findElement(By.xpath("(//input[@name='btnI'])[2]")).isDisplayed();
		if(FeelLuckyDisplayed)
		{
			System.out.println("I'm Feeling Lucking Button dispalyed");
			driver.findElement(By.xpath("(//input[@name='btnI'])[2]")).click();
		}
		else
		{
			System.out.println("I'm Feeling Lucking Button is not dispalyed");
		}

		try {

			driver.findElement(By.id("logo"));
			System.out.println("The functionality of “I’m feeling Lucky” search verified");
		}
		catch (Exception exp)
		{
			System.out.println("Cause is : "+ exp.getCause());
			System.out.println("Message is :"+ exp.getMessage());
			exp.printStackTrace();

		}
	}

}
