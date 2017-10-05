import com.google.common.collect.ImmutableMap;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class ChromeHeadless {

    WebDriver driver;

    @Test
    public void openBrowserAndDoSomething() throws IOException {
        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("/usr/bin/chromedriver"))
                .usingAnyFreePort()
                .withEnvironment(ImmutableMap.of("DISPLAY",":99"))
                .build();

        driver = new ChromeDriver(service);

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://www.google.com");
        driver.getTitle();
        assertEquals("Google", driver.getTitle());
    }
}
