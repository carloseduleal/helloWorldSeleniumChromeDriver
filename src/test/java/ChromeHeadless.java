import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class ChromeHeadless {

    WebDriver driver;

    @Test
    public void openBrowserAndDoSomething(){
        System.setProperty("phantomjs.binary.path","/usr/bin/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200x600");

        driver = new ChromeDriver(options);

        driver.get("http://www.google.com");
    }

}
