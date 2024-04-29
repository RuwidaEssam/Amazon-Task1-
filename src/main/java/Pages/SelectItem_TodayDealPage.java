package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectItem_TodayDealPage {
    WebDriver w;
    public SelectItem_TodayDealPage(WebDriver W){this.w=W;}
    By item_insale = By.xpath("//*[@id=\"grid-main-container\"]/div[3]/div/div[1]/div/div/a/div/div/img");
    By cart=By.xpath("//*[@id=\"add-to-cart-button\"]");
    public void select_item_insale(){
        w.findElement(item_insale).click();
    }
    public void addtocart(){
        w.findElement(cart).click();
    }
}
