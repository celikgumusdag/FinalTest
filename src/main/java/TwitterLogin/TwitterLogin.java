package TwitterLogin;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Çelik on 8.6.2016.
 */
public class TwitterLogin extends Base {

    public TwitterLogin(WebDriver driver) {
        super(driver);
    }

    public void loginingPage(){
        WebElement login = driver.findElement(By.cssSelector(".username>input"));
        login.sendKeys("sadsad");
        WebElement password = driver.findElement(By.cssSelector(".password>input"));
        password.sendKeys("adadssda");
        WebElement buton = driver.findElement(By.cssSelector("#sb_ifc0>#gs_lc0>input:nth-of-type(1)"));
        buton.click();
    }
}
