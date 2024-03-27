import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.setProperty("webdriver.chrome.driver","C:\\selenium-webdriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.gmail.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("nibrasnib1526@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.className("VfPpkd-vQzf8d")).click();
        Thread.sleep(2000);
        String at = driver.getTitle();
        String et = "gmail";
        driver.close();
        if(at.equalsIgnoreCase(et)){
            System.err.println("Test successful");
        }
        else{
            System.err.println("test unsuccessful");
        }
    }
}
