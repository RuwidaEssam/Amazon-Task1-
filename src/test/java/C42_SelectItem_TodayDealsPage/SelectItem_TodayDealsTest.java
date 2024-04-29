package C42_SelectItem_TodayDealsPage;

import C1_BaseDriver.Getdriver;
import Pages.SelectItem_TodayDealPage;
import C32_TodaysDealsPage.TodaysDealsTest;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectItem_TodayDealsTest {
    WebDriver driver;
    SelectItem_TodayDealPage selectitem;
    @BeforeMethod
    public void setup() throws InterruptedException, TesseractException {
        driver= Getdriver.getDriver();
        TodaysDealsTest todaydeal =new TodaysDealsTest();
        todaydeal.setup();
        todaydeal.Selectcategoryintodaysdeals();
    }

    @Test
    public void SelectItemWithValid(){
        driver=new Getdriver().getDriver();
        selectitem=new SelectItem_TodayDealPage(driver);
        selectitem.select_item_insale();
        selectitem.addtocart();
    }
    @AfterMethod
    public void AfterSelectTest(){
        new Getdriver().quitDriver();
    }
}
