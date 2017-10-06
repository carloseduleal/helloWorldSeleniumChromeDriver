import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class ChromeHeadless {

    WebDriver driver;

    @Test
    public void openBrowserAndDoSomething(){
        System.setProperty("webdriver.chrome.driver","/usr/bin/chromium-browser");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu");

        driver = new ChromeDriver(options);

        driver.get("http://www.google.com");
    }

}
