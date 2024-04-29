package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CaptchaPage {
    WebDriver w;
    public CaptchaPage(WebDriver W){this.w=W;}
    By image = By.xpath("/html/body/div/div[1]/div[3]/div/div/form/div[1]/div/div/div[1]/img");

    By captchaField = By.id("captchacharacters");
    By Amazon_Logo =By.id("nav-logo-sprites");
    public void EnterCharacters(String captchaText ){
        w.findElement(captchaField).sendKeys(captchaText);
    }

}
