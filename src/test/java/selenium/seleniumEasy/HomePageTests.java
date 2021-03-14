package selenium.seleniumEasy;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.seleniumEasyPO.HomeSeleniumEasyPO;
import selenium.seleniumEasyPO.TestDemoPO;


public class HomePageTests extends SeleniumEasyBaseTest{

    @Test
    public void fistTest() {
        HomeSeleniumEasyPO homeSeleniumEasyPO = new HomeSeleniumEasyPO(driver);
        homeSeleniumEasyPO.clickOnDemoWebsiteButton();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(homeSeleniumEasyPO.demoWebsiteButton.findElement(driver)));
        TestDemoPO testDemoPO = new TestDemoPO(driver);
        if(testDemoPO.popUp.findElement(driver).isDisplayed()){
            testDemoPO.closePopUp();
        };
    }
}
