package GoogleSearch;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchByVoice extends BaseDriver{
	
	@Test(priority = 8)
	public void SearchByVoice() throws InterruptedException
	{
		initDriver();
		boolean SearchByVoiceButton = driver.findElement(By.cssSelector("svg.HPVvwb")).isDisplayed();
		if(SearchByVoiceButton)
		{
			System.out.println("SearchByVoiceButton dispalyed");
			driver.findElement(By.cssSelector("svg.HPVvwb")).click();
		}
		else
		{
			System.out.println("SearchByVoiceButton is not dispalyed");
		}
		Thread.sleep(2000);

		try {

			driver.findElement(By.id("spchb"));
			System.out.println("Search by voice is verified");
		}
		catch (Exception exp)
		{
			System.out.println("Cause is : "+ exp.getCause());
			System.out.println("Message is :"+ exp.getMessage());
			exp.printStackTrace();

		}
	}

}
