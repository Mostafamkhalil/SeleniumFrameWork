package theInternetProject;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import theInternetPages.DropdownPage;

public class DropdownTests extends BaseTest {

    private DropdownPage dropdownPage;

    @Test
    public void dropdownTest(){
        dropdownPage = homePage.navigateToDropdownPage();

        dropdownPage.selectFromDropdown("Option 2");

        String actualSelected = dropdownPage.getSelectedOptionFromDropdown();
        Assert.assertEquals(actualSelected,"Option 2","Selected Option isn't correct");
    }

    @AfterMethod
    public void afterMethod(){
        dropdownPage.navigateToBaseURL();
    }
}
