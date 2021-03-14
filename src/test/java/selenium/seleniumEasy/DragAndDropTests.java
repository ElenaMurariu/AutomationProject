package selenium.seleniumEasy;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import selenium.seleniumEasyPO.DragAndDropPO;
import selenium.seleniumEasyPO.HomeSeleniumEasyPO;
import selenium.seleniumEasyPO.TestDemoPO;


public class DragAndDropTests extends SeleniumEasyBaseTest {


    @Test
    public void dragAllOptions() throws InterruptedException {
        HomeSeleniumEasyPO homeSeleniumEasyPO = new HomeSeleniumEasyPO(driver);
        homeSeleniumEasyPO.clickOnDemoWebsiteButton();
        Thread.sleep(3000);
        TestDemoPO testDemoPO = new TestDemoPO(driver);
        if (testDemoPO.popUp.findElement(driver).isDisplayed()) {
            testDemoPO.closePopUp();
        }

        testDemoPO.openOthersDropdown();
        Assert.assertTrue(testDemoPO.dragAndDropOption.findElement(driver).getText().contains("Drag and Drop"));
        testDemoPO.clickOnDragAndDropOption();

        DragAndDropPO dragAndDropPO = new DragAndDropPO(driver);
        for (int i = 0; i < dragAndDropPO.DraggableListSize(); i++) {
            Actions action = new Actions(driver);
            WebElement source = dragAndDropPO.firstDraggableOption.findElement(driver);
            WebElement destination = dragAndDropPO.dropzone.findElement(driver);
            action.dragAndDrop(source, destination).build().perform();
            Thread.sleep(3000);
        }
    }
}
