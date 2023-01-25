package theInternetPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private By dropdownPageLocator = By.xpath("//a[@href='/dropdown']");
    private By hoversPageLocator = By.xpath("//a[@href='/hovers']");
    private By keyPressesPageLocator = By.xpath("//a[@href='/key_presses']");
    private By javaScriptAlertPageLocator = By.xpath("//a[@href='/javascript_alerts']");
    private By fileUploadPageLocator = By.xpath("//a[@href='/upload']");
    private By framesPageLocator = By.xpath("//a[@href='/tinymce']");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public DropdownPage navigateToDropdownPage(){
        elementActions.clickOnElement(dropdownPageLocator);
        return new DropdownPage(driver);
    }

    public HoversPage navigateToHoversPage(){
        elementActions.clickOnElement(hoversPageLocator);
        return new HoversPage(driver);
    }

    public KeyPressesPage navigateToKeyPressesPage(){
        elementActions.clickOnElement(keyPressesPageLocator);
        return new KeyPressesPage(driver);
    }

    public JavaScriptAlerts navigateToJavaScriptPage(){
        elementActions.clickOnElement(javaScriptAlertPageLocator);
        return new JavaScriptAlerts(driver);
    }

    public FileUploadPage navigateToFileUploadPage(){
        elementActions.clickOnElement(fileUploadPageLocator);
        return new FileUploadPage(driver);
    }

    public FramesPage navigateToFramesPage(){
        elementActions.clickOnElement(framesPageLocator);
        return new FramesPage(driver);
    }
}
