import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chrome {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cyram.io");

        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0, 1000)");
        driver.findElement(By.tagName("footer"));
        for (int i = 0; i < 50; i++) {
            js.executeScript("window.scrollBy(0, 100)");
            Thread.sleep(100);
        }
        Actions actions = new Actions(driver);

        Thread.sleep(2000);
        driver.quit();
    }


}