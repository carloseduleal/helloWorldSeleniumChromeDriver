import com.google.common.collect.ImmutableMap;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class FirefoxHeadless {

    WebDriver driver;

    @Test
    public void openBrowserAndDoSomething() throws IOException {
        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("drivers/chromedriver"))
                .usingAnyFreePort()
                .withEnvironment(ImmutableMap.of("DISPLAY",":99"))
                .build();

        driver = new ChromeDriver(service);
        driver.get("http://www.google.com");
        driver.getTitle();
        assertEquals("Google", driver.getTitle());
    }
}
