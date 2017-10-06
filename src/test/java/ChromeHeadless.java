import com.google.common.collect.ImmutableMap;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class ChromeHeadless {

    static WebDriver driver;

    @Test
    public void openBrowserAndDoSomething(){
        //System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");

        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("/usr/bin/chromedriver"))
                .usingAnyFreePort()
                .withEnvironment(ImmutableMap.of("DISPLAY",":99"))
                .build();

        driver = new ChromeDriver(service);
        driver.get("http://www.google.com");

        driver.quit();
    }

}
