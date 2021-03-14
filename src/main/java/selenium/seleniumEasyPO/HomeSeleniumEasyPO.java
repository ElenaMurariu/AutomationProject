package selenium.seleniumEasyPO;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;


public class HomeSeleniumEasyPO extends PageObject {
    private WebDriver driver;

    public HomeSeleniumEasyPO(WebDriver driver) {
        this.driver = driver;
    }

    public By demoWebsiteButton = By.xpath("//a[@href='http://www.seleniumeasy.com/test']");

    public void clickOnDemoWebsiteButton() {
        driver.findElement(demoWebsiteButton).click();
    }


}
