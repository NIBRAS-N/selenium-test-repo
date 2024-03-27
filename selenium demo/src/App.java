import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.setProperty("webdriver.chrome.driver","C:\\selenium-webdriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        System.out.println("lol "+driver.getTitle());
        Thread.sleep(1000);
        driver.quit();
    }
}
