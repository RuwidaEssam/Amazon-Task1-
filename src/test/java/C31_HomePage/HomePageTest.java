package C31_HomePage;

import C1_BaseDriver.Getdriver;
import C2_Captcha.CaptchaTest;
import Pages.HomePage;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {
    public WebDriver driver;
    HomePage search;
    @BeforeMethod
    public void setup() throws TesseractException {
        driver=new Getdriver().getDriver();
        CaptchaTest CaptchaPage=new CaptchaTest();
        CaptchaPage.setup();
        CaptchaPage.Valid_Characters();
        CaptchaPage.inValid_Characters();
    }
    @Test
    public void SerachItemWithValid() throws InterruptedException {
        driver= Getdriver.getDriver();
        search=new HomePage(driver);
        Thread.sleep(1000);
        search.EnterSearchValue("car accessories");
    }

    @AfterMethod
    public void AftersearchTest(){
        new Getdriver().quitDriver();
    }
}