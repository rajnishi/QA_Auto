package TS;

import BasePage.BaseTest;
import PO.AlertFrameWindowPO;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertFrameWindowTC extends BaseTest {


    @Test

    public void verifyAlert() {
        AlertFrameWindowPO alertFrameWindowPOObj = new AlertFrameWindowPO(driver);

        /*Assert.assertTrue(alertFrameWindowPOObj.clickOnOkAlertLinkBtn(alertFrameWindowPOObj.SimpleAlert_xpath), "unable to click");
        Assert.assertTrue(alertFrameWindowPOObj.clickOnCancelConfirmAlertBtn(alertFrameWindowPOObj.ConfirmAlert_xpath), "unable to click on confirm alert");
        Assert.assertTrue(alertFrameWindowPOObj.insertTextOnPromptAlertBtn(alertFrameWindowPOObj.Prompt_xpath), "unable to click on prompt alert");
        Assert.assertTrue(alertFrameWindowPOObj.clickOnSwitchWindow1(alertFrameWindowPOObj.Window1_xpath), "unable to click on prompt alert");*/
       // Assert.assertTrue(alertFrameWindowPOObj.clickOnNewWindow2(alertFrameWindowPOObj.Window2_xpath), "unable to click on new window");

       // Assert.assertTrue(alertFrameWindowPOObj.clickOnDragDropLink(alertFrameWindowPOObj.SendKeys_xpath, alertFrameWindowPOObj.Click_xpath), "unable to drag");



    }
}
