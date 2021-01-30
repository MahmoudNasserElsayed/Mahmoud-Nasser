package GoogleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class PaginationVerification extends BaseDriver{

	@Test(priority = 7)
	public void Pagination() throws InterruptedException
	{
		initDriver();
		je = (JavascriptExecutor) driver;
		driver.findElement(By.name("q")).sendKeys("youtube");
		driver.findElement(By.id("tsf")).submit();
		Thread.sleep(2500);
		je.executeScript("window.scrollBy(0,1200)", "");  //Scroll down
		Thread.sleep(4000);
		try {

			driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[9]/div[2]/div/div[5]/div[2]/span[1]/div/table/tbody/tr/td[10]/a/span[2]"));
			System.out.println("Pagination verified and second page dispalyed");
		}
		catch (Exception exp)
		{
			System.out.println("Cause is : "+ exp.getCause());
			System.out.println("Message is :"+ exp.getMessage());
			exp.printStackTrace();

		}
	}

}
