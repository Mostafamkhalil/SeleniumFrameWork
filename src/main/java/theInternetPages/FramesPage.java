package theInternetPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage extends BasePage {

    private By frameLocator = By.id("mce_0_ifr");
    private By frameTextInputField = By.id("tinymce");

    public FramesPage(WebDriver driver){
        super(driver);
    }

    public void typeInFrameTextField(String string){
        elementActions.switchToFrame(frameLocator);
        elementActions.typeTextInField(frameTextInputField,string);
        elementActions.switchBackToParentFrame();
    }

    public void clearFrameTextField(){
        elementActions.switchToFrame(frameLocator);
        elementActions.clearTextInField(frameTextInputField);
        elementActions.switchBackToParentFrame();
    }
}
