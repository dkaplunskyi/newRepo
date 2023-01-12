import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.safari.driver", "dkaplunskyi/bin/safaridriver");
        WebDriver driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.get("https://cyram.io");
        Thread.sleep(2000);
        driver.quit();
    }
}
