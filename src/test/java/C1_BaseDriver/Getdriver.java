package C1_BaseDriver;
import net.sourceforge.tess4j.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.time.Duration;

public class Getdriver {
    private static WebDriver driver;


    public static WebDriver getDriver() {
        if (driver==null){
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            //Dimension dimension = new Dimension(1024, 768);
            driver.get("https://www.amazon.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    return driver;
}


    @AfterMethod
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
