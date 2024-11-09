package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage 
{

	 @FindBy(xpath ="//span[.='Leather']")
     private WebElement bandType;
     
     @FindBy(xpath ="(//span[.='Fastrack'])[1]")
     private WebElement brandName;
     
     @FindBy(xpath ="//a[.='2']")
     private WebElement secondPage;
     
     @FindBy(xpath ="(//span[.='Add to Cart'])[1]")
     private WebElement AddToCart;
     
     @FindBy(id ="sw-gtc")
     private WebElement GoToCart;
     
     
     public SearchResultPage(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     
     public WebElement clickLeather()
     {
    	 return bandType;
     }
     public WebElement searchbutton()
     {
    	 return brandName;
    	 
     }
     public WebElement pageSecond()
     {
    	 return secondPage;
    	 
     }
     public WebElement AddToCart()
     {
    	 return AddToCart;
    	 
     }
     
     public WebElement GoToCart()
     {
    	 return GoToCart;
    	 
     }
     
     
     
     
     
     
}
