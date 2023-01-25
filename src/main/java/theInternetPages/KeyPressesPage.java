package theInternetPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage extends BasePage {

    private By inputFieldLocator = By.xpath("//input[@id='target']");
    private By resultTextLocator = By.xpath("//p[@id='result']");

    public KeyPressesPage(WebDriver driver){
        super(driver);
    }

    public void enterCharacters(Keys characters){
        elementActions.retrieveElement(inputFieldLocator).sendKeys(characters);
    }

    public void typeSpecialCharachters(){
        elementActions.retrieveElement(inputFieldLocator).sendKeys(Keys.chord(Keys.SHIFT,"h") + Keys.SPACE + "mostafa");
    }

    public String getResultText(){
        return elementActions.getTextFromElement(resultTextLocator);
    }
}
