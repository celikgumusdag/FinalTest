package TwitterOpen;

import Base.Base;
import org.openqa.selenium.WebDriver;

/**
 * Created by Çelik on 7.6.2016.
 */
public class PageOpen extends Base {

    public PageOpen(WebDriver driver) {
        super(driver);
    }

    public void openingPage(){
        driver.get("http://www.twitter.com/");
        logger.info("Sayfa Açıldı");
    }

}
