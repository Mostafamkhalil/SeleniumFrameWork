package theInternetPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropdownPage extends BasePage {

    private By dropdownLocator = By.xpath("//select[@id='dropdown']");
    public DropdownPage(WebDriver driver){
        super(driver);
    }

    public void selectFromDropdown(String option){
        elementActions.selectOptionFromDropdown(dropdownLocator,option);
    }

    public String getSelectedOptionFromDropdown(){
        return elementActions.getSelectedOptionFromDropdown(dropdownLocator);
    }

}
