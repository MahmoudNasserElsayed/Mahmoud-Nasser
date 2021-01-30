package GoogleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MisspelledKeyword extends BaseDriver{
	
	@Test(priority = 5)
	public void misspelledkeyword () throws InterruptedException 
	{
		initDriver();
		driver.findElement(By.name("q")).sendKeys("instabg");
		driver.findElement(By.id("tsf")).submit();
		Thread.sleep(1500);
		
		try {
			
			//WebElement item = driver.findElement(By.xpath("/html/body/div[7]/div[2]/div[9]/div[2]/div/div[1]/div[2]/p/span"));
			WebElement item2= driver.findElement(By.cssSelector(".d2IKib"));
			if(item2.getText().contains("Did you mean:")){
				System.out.println("Did you mean: dispalyed");
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
