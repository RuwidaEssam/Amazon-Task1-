package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodayDealsPage {
    WebDriver w;
    public TodayDealsPage(WebDriver W){this.w=W;}
    By grocerybutton= By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[13]/label");
    By sale_ten_percent=By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[6]/ul/li[2]/div/a/span");
    By todaysdeals=By.xpath("//*[@id=\"nav-xshop\"]/a[1]");

    public void grocerybutton(){
        w.findElement(grocerybutton).click();
    }
    public void select_sale(){
        w.findElement(sale_ten_percent).click();
    }
    public  void pressonTodaydeals(){
        w.findElement(todaysdeals).click();
    }

}

