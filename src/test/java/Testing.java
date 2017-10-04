import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;

public class Testing {

    WebDriver driver;

    @Test
    public void openBrowserAndDoSomething(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");

        driver = new ChromeDriver(options);
        driver.get("http://www.google.com");
        driver.getPageSource();
        driver.getTitle();
        driver.findElement(By.id("lst-ib")).sendKeys("la la la");
        assertEquals("Google", driver.getTitle());
    }
}
