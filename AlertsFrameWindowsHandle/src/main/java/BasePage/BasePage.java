package BasePage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean clickOnOkAlertLinkBtn(By by) {
        try {

            WebElement webE = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            webE.click();
            Alert okAlert = driver.switchTo().alert();
            System.out.println("printing the text from alert " + okAlert.getText());
            Thread.sleep(5000);
            okAlert.accept();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    public boolean clickOnCancelConfirmAlertBtn(By by) {

        try {

            WebElement webE = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            webE.click();
            Alert cancelAlert = driver.switchTo().alert();
            Thread.sleep(5000);
            cancelAlert.dismiss();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean insertTextOnPromptAlertBtn(By by) {
        try {

            WebElement webE = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            webE.click();
            Alert enterAlert = driver.switchTo().alert();

            Robot rbObj = new Robot(); //using Robot class to enter the date in by using Ctrl-v
            StringSelection text = new StringSelection("Selenium RC");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(text, null);
            rbObj.keyPress(KeyEvent.VK_CONTROL);
            rbObj.keyPress(KeyEvent.VK_V);
            rbObj.keyRelease(KeyEvent.VK_V);
            rbObj.keyRelease(KeyEvent.VK_CONTROL);

            rbObj.keyPress(KeyEvent.VK_TAB);
            rbObj.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(8000);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    public boolean clickOnSwitchWindow1(By by) {
     try {

        WebElement webE = (new WebDriverWait(driver, 60))
                .until(ExpectedConditions.visibilityOfElementLocated(by));
        webE.click();
        //storing the current window handle

         String winHandleBefore = driver.getWindowHandle();
         System.out.println("Before Switching to window " + driver.getTitle());
         //switch to new window opened

         for(String winhandle:driver.getWindowHandles()){
             driver.switchTo().window(winhandle);
         }

        //perform the actions on new window
         driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']")).sendKeys("Maven Dependency");
         driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']")).sendKeys(Keys.ENTER);
         System.out.println("After Switching to window " + driver.getTitle());

         //switch back to original broswer(1st window)
         driver.switchTo().window(winHandleBefore);
         System.out.println("back to parent window " + driver.getTitle());
         //continue with original window
         System.out.println("parent window title is " + driver.getTitle());
        Thread.sleep(8000);
        return true;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}

    public boolean clickOnNewWindow2(By by) {
        try {

            WebElement webE = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            webE.click();
            Set<String> allhandles = driver.getWindowHandles();

            //count the window handles
            System.out.println("Count of windows "+ allhandles.size());

            //get current or default handle
            String currentWindowHandle = allhandles.iterator().next();
            System.out.println("Current window hanlde "+ currentWindowHandle);

            //Remove first or default handle
            allhandles.remove(allhandles.iterator().next());

            //get the last window handle
            String lastHandle = allhandles.iterator().next();
            System.out.println("last window handle "+ lastHandle);

            driver.switchTo().window(lastHandle);
            System.out.println("Title " + driver.getTitle());
            driver.close();



            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean clickOnDragDropLink(By by, By by1) {
        try {

            WebElement webE = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            webE.click();

            WebElement webE1 = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(by1));
            webE1.click();

                     Actions action = new Actions(driver);
            {

               action.clickAndHold(webE).moveToElement(webE1).release().build().perform();
                Thread.sleep(3000);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        }
    }






