package C51_CartPage;

import C1_BaseDriver.Getdriver;
import Pages.CartPage;
import Pages.SelectItemPage;
import C41_SelectItem.SelectItemTest;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CartPageTest {
    public WebDriver driver;
    CartPage cart;
    SelectItemPage select;
    @BeforeTest
    public void setup() throws TesseractException, InterruptedException {
        driver=new Getdriver().getDriver();
        SelectItemTest select =new SelectItemTest();
        select.setup();
        select.SelectItemWithValid();
    }
    @Test
    public void SelectItemOfCart(){
        driver=new Getdriver().getDriver();
        cart.gotocart();
        WebElement itemincart=driver.findElement(By.xpath("//*[@id=\"a-autoid-8-announce\"]/span[2]"));
        String actualtext=itemincart.getText();
        Assert.assertEquals(actualtext,"1");
    }
    @AfterMethod
    public void AfterSearchTest(){
        new Getdriver().quitDriver();
    }

}
