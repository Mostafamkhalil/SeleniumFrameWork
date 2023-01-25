package theInternetProject;

import org.testng.annotations.Test;
import theInternetPages.FramesPage;

public class frameTests extends BaseTest {

    private FramesPage framesPage;

    @Test
    public void frameTests(){
        framesPage = homePage.navigateToFramesPage();

        framesPage.clearFrameTextField();
        framesPage.typeInFrameTextField("Thank you for attending the course");
    }
}
