import com.google.common.collect.ImmutableMap;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

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
        driver.getPageSource();
        driver.getTitle();
        driver.findElement(By.id("lst-ib")).sendKeys("Just another test");
        assertEquals("Google", driver.getTitle());
    }
}
