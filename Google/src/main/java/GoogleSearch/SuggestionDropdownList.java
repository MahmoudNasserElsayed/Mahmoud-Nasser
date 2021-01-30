package GoogleSearch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SuggestionDropdownList extends BaseDriver{
	
	@Test(priority = 4)
	public void SuggestionDropDownList() throws InterruptedException
	{
		initDriver();
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);

		List <WebElement > list = driver.findElements(By.className("sbl1"));
		for (int i=0; i<list.size();i++)
		{
			String Listitem = list.get(i).getText();
			if(Listitem.contains("javascript"))
			{
				list.get(i).click();
				break;
			}
		}
	}

}
