package theInternetProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import theInternetPages.HomePage;

public class BaseTest {
    private static WebDriver driver;
    protected static HomePage homePage;


    @Parameters({"browser"})
    @BeforeTest
    public void Setup(@Optional("chrome") String browserName){
        if (browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        homePage = new HomePage(driver);
        homePage.navigateToBaseURL();
        homePage.maximizeWindow();
    }


    @AfterTest
    public void clear(){
        driver.quit();
    }
}
