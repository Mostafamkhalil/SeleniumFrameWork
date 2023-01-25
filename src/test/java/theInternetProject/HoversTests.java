package theInternetProject;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import theInternetPages.HoversPage;

public class HoversTests extends BaseTest {

    HoversPage hoversPage;

    @Test
    public void hoversTests(){
        hoversPage = homePage.navigateToHoversPage();
        hoversPage.hoverOverImageByIndex(1);
        Assert.assertTrue(hoversPage.isImageCaptionDisplayedOrNotByIndex(1));
    }

    @AfterMethod
    public void afterMethod(){
        hoversPage.navigateToBaseURL();
    }

}
