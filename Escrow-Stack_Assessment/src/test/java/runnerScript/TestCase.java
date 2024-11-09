package runnerScript;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericScript.Base_Page;
import pageObject.Home_Page;
import pageObject.SearchResultPage;

public class TestCase extends Base_Page
{

	@Test
	public void Execution() throws InterruptedException 
	{
		Home_Page hp=new Home_Page(driver);
		hp.enterProductName().sendKeys("Wrist Watches");
		hp.searchbutton().click();
		SearchResultPage srp=new SearchResultPage(driver);
		srp.clickLeather().click();
		srp.searchbutton().click();
		srp.pageSecond().click();
		Thread.sleep(2000);
		List<WebElement> products = driver.findElements(By.xpath("//div[contains(@data-asin,\"B0\")]"));
		WebElement firstProduct = products.get(0);
		firstProduct.click();
		Set<String> wins = driver.getWindowHandles();
		String parentId = driver.getWindowHandle();
		wins.remove(parentId);
		for(String win:wins)
		{
		driver.switchTo().window(win);
		}
		srp.AddToCart().click();
		srp.GoToCart().click();
	}
}
