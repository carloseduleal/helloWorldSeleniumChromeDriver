import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;

public class ChromeHeadless {

    WebDriver driver;

    @Test
    public void openBrowserAndDoSomething(){
        System.setProperty("webdriver.chrome.driver", "/drivers/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        driver = new ChromeDriver(options);
        driver.get("http://www.google.com");
        driver.getPageSource();
        driver.getTitle();
        driver.findElement(By.id("lst-ib")).sendKeys("Just another test");
        assertEquals("Google", driver.getTitle());
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
