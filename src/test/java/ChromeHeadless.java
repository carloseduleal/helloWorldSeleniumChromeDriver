import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class ChromeHeadless {

    WebDriver driver;

    @Test
    public void openBrowserAndDoSomething(){
        System.setProperty("phantomjs.binary.path","drivers/phantomjs");


//        ChromeOptions options = new PhantomJs();
//        options.addArguments("headless");
//        options.addArguments("window-size=1200x600");

        driver = new PhantomJSDriver();
        driver.get("http://www.google.com");
    }

}
