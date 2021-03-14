package selenium.seleniumEasyPO;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestDemoPO extends PageObject {

    private WebDriver driver;

    public TestDemoPO(WebDriver driver) {
        this.driver = driver;
    }

    private By listBoxDropdown = By.xpath("//ul[2]/li[3]");

    public void openListBoxDropdown() {
        driver.findElement(listBoxDropdown).click();
    }

    public By bootstrapListBoxButton = By.xpath("//ul[@class='dropdown-menu']/li/a[@href='./bootstrap-dual-list-box-demo.html']");

    public void clickOnBootstraoListBoxButton() {
        driver.findElement(bootstrapListBoxButton).click();
    }

    /*    @FindBy(xpath = "//ul[2]/li[3]")
        public WebElement listBoxDropdown;

        public void openListBoxDropdown(){
            listBoxDropdown.click();
        }

        @FindBy(xpath = "//ul[@class='dropdown-menu']/li/a[@href='./bootstrap-dual-list-box-demo.html']")
        public WebElement bootstrapListBoxButton;

        public void clickOnBootstraoListBoxButton(){
            bootstrapListBoxButton.click();
        }
    */
    private By othersDropdown = By.xpath("//ul[2]/li[last()]/a");

    public void openOthersDropdown() {
        driver.findElement(othersDropdown).click();
    }

    public By dragAndDropOption = By.xpath("//ul[2]/li[last()]/a/following-sibling::ul/li[1]");

    public void clickOnDragAndDropOption() {
        driver.findElement(dragAndDropOption).click();
    }

/*    @FindBy(xpath = "//ul[2]/li[last()]/a")
    private WebElement othersDropdown;

    public void openOthersDropdown(){
        othersDropdown.click();
    }

    @FindBy(xpath = "//ul[2]/li[last()]/a/following-sibling::ul/li[1]")
    public WebElement dragAndDropOption;

    public void clickOnDragAndDropOption(){
        dragAndDropOption.click();
    }
*/

    private By progressBarDropdown = By.xpath("//ul[2]/li[1]/a");

    public void openProgressBarDropdown() {
        driver.findElement(progressBarDropdown).click();
    }

    public By sliderOption = By.xpath("//ul[2]/li[1]/a/following-sibling::ul/li[3]");

    public void clickSliderOption() {
        driver.findElement(sliderOption).click();
    }


    /*    @FindBy(xpath = "//ul[2]/li[1]/a")
        private WebElement progressBarDropdown;

        public void openProgressBarDropdown(){
            progressBarDropdown.click();
        }

        @FindBy(xpath = "//ul[2]/li[1]/a/following-sibling::ul/li[3]")
        public WebElement sliderOption;

        public void clickSliderOption() {
            sliderOption.click();
        }
    */

    private By datePickersDropdown = By.xpath("//div/ul[1]/li[2]/a[@href='#']");

    public void openDatePickersDropdown() {
        driver.findElement(datePickersDropdown).click();
    }

    public By BootstrapDatePicker = By.xpath("//div/ul[1]/li[2]/a[@href='#']/following-sibling::ul/li[1]/a");

    public void clickBootstrapDatePickerOption() {
        driver.findElement(BootstrapDatePicker).click();
    }

 /*   @FindBy(xpath = "//div/ul[1]/li[2]/a[@href='#']")
    private WebElement datePickersDropdown;

    public void openDatePickersDropdown() {
        datePickersDropdown.click();
    }

    @FindBy(xpath = "//div/ul[1]/li[2]/a[@href='#']/following-sibling::ul/li[1]/a")
    public WebElement BootstrapDatePicker;

    public void clickBootstrapDatePickerOption() {
        BootstrapDatePicker.click();
    }
*/

    public By popUp = By.xpath("//div[@class='at4win-header']");
    private By closeButton = By.xpath("//div/a[@title='Close']");
    public void closePopUp(){
        driver.findElement(closeButton).click();
    }
}
