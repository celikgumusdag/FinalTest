package Base;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Çelik on 7.6.2016.
 */
public abstract class Base {

    protected static Logger logger = Logger.getLogger(Base.class.getName());
    protected static WebDriver driver;

    public Base(WebDriver driver) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        PageFactory.initElements(driver, this);
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        this.driver = driver;
    }

}
