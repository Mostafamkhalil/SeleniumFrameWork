package theInternetProject;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import theInternetPages.KeyPressesPage;

public class KeyPressesTests extends BaseTest {

    private KeyPressesPage keyPressesPage;

    @Test
    public void keyPressesTests(){
        keyPressesPage = homePage.navigateToKeyPressesPage();

        keyPressesPage.enterCharacters(Keys.BACK_SPACE);
        Assert.assertEquals(keyPressesPage.getResultText(),"You entered: BACK_SPACE","Result Msg isn't correct");
        keyPressesPage.typeSpecialCharachters();
    }
}
