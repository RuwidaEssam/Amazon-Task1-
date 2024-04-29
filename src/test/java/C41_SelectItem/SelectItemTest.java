package C41_SelectItem;

import C1_BaseDriver.Getdriver;
import C31_HomePage.HomePageTest;
import Pages.SelectItemPage;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectItemTest {
    WebDriver driver;
    SelectItemPage selectitem;
    @BeforeMethod
    public void setup() throws InterruptedException, TesseractException {
        driver= Getdriver.getDriver();
        HomePageTest search =new HomePageTest();
        search.setup();
        search.SerachItemWithValid();
    }

    @Test
    public void SelectItemWithValid(){
        driver=new Getdriver().getDriver();
        selectitem=new SelectItemPage(driver);
        selectitem.SelectItems();
        selectitem.addtocart();
    }
    @AfterMethod
    public void AfterSelectTest(){
        new Getdriver().quitDriver();
    }

}
