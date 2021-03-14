package selenium.seleniumEasy;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import selenium.seleniumEasyPO.HomeSeleniumEasyPO;
import selenium.seleniumEasyPO.SliderPO;
import selenium.seleniumEasyPO.TestDemoPO;

public class SliderTests extends SeleniumEasyBaseTest{


    @Test
    // Check the initial output
    public void initialOutputTest() throws InterruptedException {
        HomeSeleniumEasyPO homeSeleniumEasyPO = new HomeSeleniumEasyPO(driver);
        homeSeleniumEasyPO.clickOnDemoWebsiteButton();
        Thread.sleep(3000);
        TestDemoPO testDemoPO = new TestDemoPO(driver);
        if(testDemoPO.popUp.findElement(driver).isDisplayed()){
            testDemoPO.closePopUp();
        };

        Thread.sleep(3000);
        testDemoPO.openProgressBarDropdown();
        Thread.sleep(2000);
        Assert.assertTrue(testDemoPO.sliderOption.findElement(driver).getText().contains("Drag & Drop Sliders"));
        testDemoPO.clickSliderOption();
        Thread.sleep(2000);
        SliderPO sliderPO = new SliderPO(driver);
        Assert.assertTrue(sliderPO.firstinput.findElement(driver).getAttribute("value").contains(sliderPO.firstOutput.findElement(driver).getText()));
    }

    @Test
    // Move the slider to a certain input
    public void moveFirstSliderTest() throws InterruptedException {
        HomeSeleniumEasyPO homeSeleniumEasyPO = new HomeSeleniumEasyPO(driver);
        homeSeleniumEasyPO.clickOnDemoWebsiteButton();
        Thread.sleep(3000);
        TestDemoPO testDemoPO = new TestDemoPO(driver);
        if(testDemoPO.popUp.findElement(driver).isDisplayed()){
            testDemoPO.closePopUp();
        }
        Thread.sleep(3000);
        testDemoPO.openProgressBarDropdown();
        Thread.sleep(2000);
        testDemoPO.clickSliderOption();
        Thread.sleep(2000);

        SliderPO sliderPO = new SliderPO(driver);
        Dimension dimension = sliderPO.firstinput.findElement(driver).getSize();
        int length = dimension.getWidth();
        Actions actions = new Actions(driver);
        actions.clickAndHold(sliderPO.firstinput.findElement(driver)).moveByOffset(-length/100*50, 0).release().build().perform();

        WebElement output1 = driver.findElement(By.xpath("//output[@id='range']"));
        int intoutput1 = Integer.valueOf(output1.getText());
        Assert.assertEquals(1, intoutput1);

        sliderPO.moveInput(20);
        Thread.sleep(2000);
        WebElement output2 = driver.findElement(By.xpath("//output[@id='range']"));
        int intoutput2 = Integer.valueOf(output2.getText());
        Assert.assertEquals(20, intoutput2-1);
    }

}
