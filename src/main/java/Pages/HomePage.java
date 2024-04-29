package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver w;
    public HomePage(WebDriver W){this.w=W;}
    By search =By.xpath("//*[@id=\"twotabsearchtextbox\"]");


    public void EnterSearchValue(String item)
    {
        w.findElement(search).sendKeys(item);
    }



}
