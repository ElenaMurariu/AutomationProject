package selenium.seleniumEasy;

import org.junit.Assert;
import org.junit.Test;
import selenium.seleniumEasyPO.DatePickerPO;
import selenium.seleniumEasyPO.HomeSeleniumEasyPO;
import selenium.seleniumEasyPO.TestDemoPO;
import static org.openqa.selenium.Keys.ENTER;

public class DatePickerTests extends SeleniumEasyBaseTest {


    @Test
    //  Verify today date
    public void dateByHand() throws InterruptedException {
        HomeSeleniumEasyPO homeSeleniumEasyPO = new HomeSeleniumEasyPO(driver);
        homeSeleniumEasyPO.clickOnDemoWebsiteButton();
        Thread.sleep(3000);
        TestDemoPO testDemoPO = new TestDemoPO(driver);
        if (testDemoPO.popUp.findElement(driver).isDisplayed()) {
            testDemoPO.closePopUp();
        }

        testDemoPO.openDatePickersDropdown();
        Assert.assertTrue(testDemoPO.BootstrapDatePicker.findElement(driver).getText().contains("Bootstrap Date Picker"));
        testDemoPO.clickBootstrapDatePickerOption();
        //       testDemoSteps.goToDatePickerPage();
        Thread.sleep(3000);
        DatePickerPO datePickerPO = new DatePickerPO(driver);
        datePickerPO.clickOnDateExampleButton();
        Thread.sleep(3000);
        datePickerPO.clickToday();
        //       datePickerSteps.openCalendar();
        Thread.sleep(3000);
        String today = datePickerPO.currentDate();
        System.out.println(today);


    }

    @Test
    //  Verify you can add by hand any date
    public void dateParamByHand() throws InterruptedException {
        HomeSeleniumEasyPO homeSeleniumEasyPO = new HomeSeleniumEasyPO(driver);
        homeSeleniumEasyPO.clickOnDemoWebsiteButton();
        Thread.sleep(3000);
        TestDemoPO testDemoPO = new TestDemoPO(driver);
        if (testDemoPO.popUp.findElement(driver).isDisplayed()) {
            testDemoPO.closePopUp();
        }
        testDemoPO.openDatePickersDropdown();
        testDemoPO.clickBootstrapDatePickerOption();
        Thread.sleep(3000);
        DatePickerPO datePickerPO = new DatePickerPO(driver);
        datePickerPO.inputDateByHand("12/02/2017");
        Thread.sleep(2000);
        datePickerPO.dateExampleField.findElement(driver).sendKeys(ENTER);
        Thread.sleep(2000);
    }
}
