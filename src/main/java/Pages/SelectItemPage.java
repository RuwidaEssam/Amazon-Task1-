package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectItemPage {
    WebDriver w;
    public SelectItemPage(WebDriver W){this.w=W;}
    By firstitem=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div[1]/span/a/div/img");
    By selecteditem=By.xpath("//*[@id=\"productTitle\"]");
    By cart =By.xpath("//*[@id=\"add-to-cart-button\"]");

    public void SelectItems(){
        w.findElement(firstitem).click();
    }
    public void selecteditem()
    {
        w.findElement(selecteditem).getText();
    }
    public void addtocart()
    {
        w.findElement(cart).click();
    }
}
