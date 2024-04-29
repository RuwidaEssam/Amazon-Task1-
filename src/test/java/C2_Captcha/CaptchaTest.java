package C2_Captcha;

import C1_BaseDriver.Getdriver;
import Pages.CaptchaPage;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Collections;
import java.util.Set;

public class CaptchaTest {
    WebDriver driver;
    CaptchaPage capatcha;
    String captchaText;

    @BeforeMethod
    public void setup() throws TesseractException {
        driver=new Getdriver().getDriver();
        capatcha = new CaptchaPage(driver);
        WebElement Getimage = driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/form/div[1]/div/div/div[1]/img"));
        File screenshot = Getimage.getScreenshotAs(OutputType.FILE);
        ITesseract img = new Tesseract();
        img.setDatapath("C:\\Users\\Ruwaida\\Amazon_Project\\tessdata");
        try {
            captchaText = img.doOCR(screenshot);
            System.out.println("Captcha Text: " + captchaText);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void Valid_Characters() {
        capatcha.EnterCharacters(captchaText);
        System.out.println("Captcha Text: " + captchaText);
        Set<String> windows = Collections.singleton(driver.getWindowHandle());
        System.out.println("windows" + windows);
        WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
        String Logo = logo.getAttribute("aria-label");
        Assert.assertEquals(Logo, "Amazon");
    }

    @Test
    public void inValid_Characters() {
        capatcha.EnterCharacters("worngtext");
        System.out.println("Captcha Text: " + captchaText);
        Set<String> windows = Collections.singleton(driver.getWindowHandle());
        System.out.println("windows" + windows);
        WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
        String Logo = logo.getAttribute("aria-label");
        Assert.assertEquals(Logo, "Amazon");
    }

    @AfterMethod
    public void Aftercapatchatest() {
        new Getdriver().quitDriver();
    }
}
