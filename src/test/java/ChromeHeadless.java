import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class ChromeHeadless {

    WebDriver driver;

    @Test
    public void openBrowserAndDoSomething(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_linux");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--port=9515");

        driver = new ChromeDriver(options);

        driver.get("http://www.google.com");
    }

}
