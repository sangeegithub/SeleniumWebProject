package searchmodule.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import searchmodule.pages.SearchPage;

public class SearchTest {

    private WebDriver driver;

    @BeforeTest
    public void setupDriver(){
        System.setProperty("webdriver.chrome.driver","D:\\Softwares\\latestchrome\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    @Test
    @Parameters({"keyword"})
    public void search(String keyword){
        SearchPage searchpage = new SearchPage(driver);
        searchpage.goTo();
        searchpage.doSearch(keyword);
        searchpage.goToVideos();
        int size = searchpage.printResult();
        Assert.assertTrue(size>0);
        searchpage.printResult();
    }

    @AfterTest
    public void quitDriver(){
        this.driver.quit();
    }
}
