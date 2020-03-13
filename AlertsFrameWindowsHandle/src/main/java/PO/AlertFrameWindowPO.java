package PO;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertFrameWindowPO extends BasePage {
    public AlertFrameWindowPO(WebDriver driver) {
        super(driver);
    }

    public By SimpleAlert_xpath = By.xpath("//button[@onclick = 'simpleAlert()']");
    public By ConfirmAlert_xpath = By.xpath("//button[@id = 'confirmBox']");
    public By Prompt_xpath =By.xpath("//button[@id = 'promptBox']");
    public By Window1_xpath =By.xpath("//button[@id = 'win1']");
    public By Window2_xpath =By.xpath("//button[@id = 'win2']");

    // Drag & drop list rearranging the list
    public By SendKeys_xpath =By.xpath("//li[@id = 'sendKeys']");
    public By Findelement_xpath =By.xpath("//li[@id = 'findElement']");
    public By Click_xpath =By.xpath("//li[@id = 'click']");
    public By ClickonHold_xpath =By.xpath("//li[@id = 'clickAndHold']");





}
