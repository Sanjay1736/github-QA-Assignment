package UI;


import Pages.loginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import utils.extentManager;
public class loginTest {
    protected  static WebDriver driver;
    ExtentReports extent;
    ExtentTest test;
    @BeforeSuite
    public void setupReport() {
        extent = extentManager.getReportObject();
    }


    @BeforeMethod
    public void setup() {
        test = extent.createTest("GitHub Login Test");
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://github.com/login");
    }

    @Test
    public void testValidLogin() {
        loginPage loginpage=new loginPage(driver);
        loginpage.enterUsername("your_github_userName");
        loginpage.enterPassword("your_github_password");
        loginpage.clickLogin();
        boolean isLoggedIn = !driver.findElements(By.cssSelector("summary[aria-label='View profile and more']")).isEmpty();
        Assert.assertTrue(isLoggedIn, "Login failed: User icon not found");
        test.pass("Login successful");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
    @AfterSuite
    public void tearDownReport() {
        extent.flush();
    }
}
