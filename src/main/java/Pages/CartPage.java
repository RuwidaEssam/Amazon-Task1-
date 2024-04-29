package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver w;
    public CartPage(WebDriver W){this.w=W;}
    By gotocart=By.id("sw-gtc_CONTENT");
    public void gotocart()
    {
        w.findElement(gotocart).click();
    }
}
