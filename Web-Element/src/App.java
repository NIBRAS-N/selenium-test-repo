import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
// import org.openqa.selenium.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.setProperty("webdriver.chrome.driver","C:\\selenium-webdriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
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
        //By.cssSelector("#hello");
        //By.partialLinkText("partial-text");
        // xpath = //tagname[@Attribute="value"]

        //xpath-function

        //xpath = //tagname[contains(@attribute,'value')];
        //xpath = //*[contains(@attribute,'value')];

        //xpath = //tagname[starts-with(@attribute,'value')]

        //xpath = //tagname[text()="value"];


        //for alert
        
        Alert alert = driver.switchTo().alert();
        String alertMessage = driver.switchTo().alert().getText()
        ;
        alert.accept();

        //for pop-up

        Robot robot = new Robot();
        robot.mouseMove(400,5);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        driver.quit();

    }
}
