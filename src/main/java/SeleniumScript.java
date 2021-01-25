import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumScript {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Softwares\\oldchrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(01, TimeUnit.MINUTES);
        driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
        driver.get("<a href = https://login.yahoo.com/> https://login.yahoo.com/</a>");
        //driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("edureka@yahoo.com");
    }
}
                                                                                                                   