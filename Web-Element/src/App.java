import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.setProperty("webdriver.chrome.driver","C:\\selenium-webdriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver()   ;
        driver.get("http://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pixel");
        Thread.sleep(4000);
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.linkText("Nokia")).click();
        driver.navigate().to("http://facebook.com");
        Thread.sleep(4000);
        driver.navigate().back();
        driver.quit();

    }
}
