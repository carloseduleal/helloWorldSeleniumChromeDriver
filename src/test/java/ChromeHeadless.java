import com.google.common.collect.ImmutableMap;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import static org.junit.Assert.assertEquals;
import java.io.File;

public class ChromeHeadless {

    static WebDriver driver;

    @Test
    public void openBrowserAndDoSomething(){
//        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_linux");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");

//        ChromeDriverService service = new ChromeDriverService.Builder()
  //              .withEnvironment(ImmutableMap.of("DISPLAY",":99"))
    //            .build();

        driver = new ChromeDriver(options);

        driver.get("http://www.google.com");
	assertEquals(driver.getTitle(),"Google");
       
        driver.quit();
    }

}
