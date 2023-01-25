package theInternetPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlerts extends BasePage {

    private By firstAlert = By.xpath("//button[@onclick='jsAlert()']");
    private By secondAlert = By.xpath("//button[@onclick='jsConfirm()']");
    private By resultText = By.id("result");

    public JavaScriptAlerts(WebDriver driver){
        super(driver);
    }

    public void clickOnTheFirstAlert(){
        elementActions.clickOnElement(firstAlert);
    }

    public void clickOnTheSecondAlert(){
        elementActions.clickOnElement(secondAlert);
    }

    public void acceptAlert(){
        elementActions.acceptAlert();
    }

    public void dismissAlert(){
        elementActions.dismissAlert();
    }

    public String getResultMessage(){
        return elementActions.getTextFromElement(resultText);
    }
}
