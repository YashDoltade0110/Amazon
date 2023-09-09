import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonDemo {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:/Users/Admin/Downloads/chrome-win64 (1)/chrome-win64/chrome.exe");
        options.addArguments("--remote-allow-origin=*");
        System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.in");
        WebElement headphone = driver.findElement(By.className("_deals-shoveler-v2_style_dealImage__3nlqg"));
        headphone.click();
        Thread.sleep(3000);
        WebElement cart = driver.findElement(By.id("add-to-cart-button"));
        cart.click();
        Thread.sleep(3000);
        driver.close();
    }

}
