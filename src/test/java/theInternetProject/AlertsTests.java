package theInternetProject;

import org.testng.Assert;
import org.testng.annotations.Test;
import theInternetPages.JavaScriptAlerts;

public class AlertsTests extends BaseTest {

    private JavaScriptAlerts javaScriptAlerts;

    @Test
    public void alertsTests(){
        javaScriptAlerts = homePage.navigateToJavaScriptPage();
        javaScriptAlerts.clickOnTheFirstAlert();
        javaScriptAlerts.acceptAlert();
        Assert.assertEquals(
                javaScriptAlerts.getResultMessage(),"You successfully clicked an alert","Message isn't correct"
        );

        javaScriptAlerts.clickOnTheSecondAlert();
        javaScriptAlerts.dismissAlert();
        Assert.assertEquals(
                javaScriptAlerts.getResultMessage(),"You clicked: Cancel","Message isn't correct for second Alert"
        );
    }
}
