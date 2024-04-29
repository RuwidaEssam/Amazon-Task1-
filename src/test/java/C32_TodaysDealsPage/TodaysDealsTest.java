package C32_TodaysDealsPage;

import C1_BaseDriver.Getdriver;
import C31_HomePage.HomePageTest;
import Pages.TodayDealsPage;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TodaysDealsTest {
    WebDriver driver;
    TodayDealsPage todaydeal;
    @BeforeMethod
    public void setup() throws InterruptedException, TesseractException {
        driver= Getdriver.getDriver();
        HomePageTest search =new HomePageTest();
        search.setup();
    }

    @Test
    public void Selectcategoryintodaysdeals(){
        driver=new Getdriver().getDriver();
        todaydeal=new TodayDealsPage(driver);
        todaydeal.pressonTodaydeals();
        todaydeal.grocerybutton();
        todaydeal.select_sale();
    }
    @AfterMethod
    public void AfterSelectTest(){
        new Getdriver().quitDriver();
    }
}
