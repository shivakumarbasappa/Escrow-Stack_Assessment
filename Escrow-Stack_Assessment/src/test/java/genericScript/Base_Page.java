package genericScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Page 
{
	public WebDriver driver;
	@BeforeClass
	public void launch_Browser()
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
	}
	@BeforeMethod
	public void launch_application()
	{
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
//	@AfterMethod
//	public void close_application()
//	{
//		driver.quit();
//	}

}
