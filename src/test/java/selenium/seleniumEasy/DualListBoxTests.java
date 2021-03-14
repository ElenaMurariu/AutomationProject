package selenium.seleniumEasy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.seleniumEasyPO.DualListBoxPO;
import selenium.seleniumEasyPO.HomeSeleniumEasyPO;
import selenium.seleniumEasyPO.TestDemoPO;

import java.util.List;

public class DualListBoxTests extends SeleniumEasyBaseTest{



    @Before
    public void goToListBox() throws InterruptedException {
        HomeSeleniumEasyPO homeSeleniumEasyPO = new HomeSeleniumEasyPO(driver);
        homeSeleniumEasyPO.clickOnDemoWebsiteButton();
        Thread.sleep(3000);
        TestDemoPO testDemoPO = new TestDemoPO(driver);
        if(testDemoPO.popUp.findElement(driver).isDisplayed()){
            testDemoPO.closePopUp();
        };
        testDemoPO.openListBoxDropdown();
        Thread.sleep(3000);
        Assert.assertTrue(testDemoPO.bootstrapListBoxButton.findElement(driver).getText().contains("Bootstrap List Box"));
        testDemoPO.clickOnBootstraoListBoxButton();
        Thread.sleep(3000);
    }

    @Test
//  "Test that the text is searched in the left option list"
    public void leftSearch() throws InterruptedException {
        DualListBoxPO dualListBoxPO = new DualListBoxPO(driver);
        dualListBoxPO.leftSearch.findElement(driver).click();
        dualListBoxPO.leftSearch.findElement(driver).sendKeys("bootstrap");
        Thread.sleep(3000);
    }


    @Test
    //  "Test that the text is searched in the right option list"
    public void rightSearch() throws InterruptedException {
        DualListBoxPO dualListBoxPO = new DualListBoxPO(driver);
        dualListBoxPO.eraseRightSearch();
        Thread.sleep(3000);
        dualListBoxPO.textRightSearch("porta");
        Thread.sleep(3000);
    }

    @Test
//  "Check how many options were found in the left option list"
    public void nrOfLeftfounds(){
        DualListBoxPO dualListBoxPO = new DualListBoxPO(driver);
        dualListBoxPO.textLeftSearch("bootstrap");
        List<WebElement> nrleft = driver.findElements(By.xpath("//div[@class='well text-right']/div/following-sibling::ul/li[not(contains(@style,'none'))]"));
        dualListBoxPO.noOfLeftSearches("bootstrap");
        int a = dualListBoxPO.noOfLeftSearches("bootstrap");
        Assert.assertEquals(nrleft.size(), a);
        System.out.println(nrleft.size());
        dualListBoxPO.eraseLeftSearch();
    }

    @Test
 // "Check how many options were found in the right option list"
    public void nrOfRightfounds() throws InterruptedException {
        DualListBoxPO dualListBoxPO = new DualListBoxPO(driver);
        dualListBoxPO.textRightSearch("p");
        Thread.sleep(2000);
        List<WebElement> nrRight = driver.findElements(By.xpath("//div[@class='well']/div/following-sibling::ul/li[not(contains(@style,'none'))]"));
        dualListBoxPO.noOfRightSearches("p");
        int b = dualListBoxPO.noOfRightSearches("p");
        Assert.assertEquals(nrRight.size(), b);
        System.out.println(b);
        System.out.println(nrRight.size());
    }

    @Test
//  "Select and move 2 options form left options list to the right one"
    public void selectAndMoveLefttoRight() throws InterruptedException {
        DualListBoxPO dualListBoxPO = new DualListBoxPO(driver);
        dualListBoxPO.selectBootstrap();
        Thread.sleep(2000);
        dualListBoxPO.selectVestibulum();
        Thread.sleep(2000);
        dualListBoxPO.clickOnToRightButton();
        Thread.sleep(2000);
    }

    @Test
//  "Select and move all options from right options list to the left one"
    public void selectAllAndMoveRightToLeft() throws InterruptedException {
        DualListBoxPO dualListBoxPO = new DualListBoxPO(driver);
        dualListBoxPO.clickOnRightSelectAllButton();
        dualListBoxPO.clickOnToLeftButton();
        List<WebElement> nrRight = driver.findElements(By.xpath("//div[@class='well']/div/following-sibling::ul/li"));
        Assert.assertEquals(0, nrRight.size());
        List<WebElement> nrLeft = driver.findElements(By.xpath("//div[@class='well text-right']/div/following-sibling::ul/li"));
        Assert.assertEquals(dualListBoxPO.sumOfAllOptions(), nrLeft.size());
        Thread.sleep(2000);
    }


}
