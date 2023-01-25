package theInternetPages;

import org.openqa.selenium.WebDriver;
import utils.ElementActions;
import utils.waits;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {
    protected Properties config = new Properties();
    private String baseURL;
    protected waits wait;
    protected ElementActions elementActions;
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        try{
            config.load(new FileInputStream("config.properties"));
        }
        catch (Exception e){
            System.out.println(e);
        }
        baseURL = config.getProperty("baseURL");
        this.driver = driver;
        wait = new waits(driver);
        elementActions = new ElementActions(driver);
    }

    public void navigateToBaseURL(){
        driver.get(baseURL);
    }

    public void maximizeWindow(){
        driver.manage().window().maximize();
    }
}
