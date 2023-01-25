package theInternetPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HoversPage extends BasePage {

    private By imagesLocator = By.xpath("//div[@class='figure'] //img");
    private By imagesCaptionsLocator = By.xpath("//div[@class='figcaption'] //h5");

    public HoversPage(WebDriver driver){
        super(driver);
    }

    public void hoverOverImageByIndex(int index){
        WebElement image = elementActions.retrieveElements(imagesLocator).get(index);
        elementActions.hoverOverWebElement(image);
    }

    public boolean isImageCaptionDisplayedOrNotByIndex(int index){
        WebElement image = elementActions.retrieveElements(imagesLocator).get(index);
        return elementActions.isElementDisplayed(image);
    }

}
