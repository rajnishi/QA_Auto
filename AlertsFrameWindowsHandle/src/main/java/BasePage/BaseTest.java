package BasePage;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;


    @BeforeClass

    public void beforeClass() throws FileNotFoundException {
        ReadFromFileProp readFromFilePropObj = new ReadFromFileProp("config.properties");

        launchBroswer();
        driver.get(readFromFilePropObj.geturl());
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);

    }
@AfterClass
public void afterclass(){

        driver.quit();
}

    public void launchBroswer() throws FileNotFoundException {
        ReadFromFileProp readFromFilePropObj = new ReadFromFileProp("config.properties");

        String broswerName = readFromFilePropObj.getbroswer();
        System.out.println(broswerName);
        if(broswerName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", readFromFilePropObj.getloadDriverPath());
            driver = new ChromeDriver();

        }

}
}
