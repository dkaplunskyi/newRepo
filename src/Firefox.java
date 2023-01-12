import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://cyram.io");
        Thread.sleep(2000);
        driver.quit();
    }

}
