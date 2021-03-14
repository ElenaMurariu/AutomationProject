package selenium.addressBookPO;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePagePO {

    private WebDriver driver;

    private By home = By.xpath("//a[@data-test='home']");
    private By address = By.xpath("//a[@data-test='addresses']");
    private By signOut = By.xpath("//a[@rel='nofollow']");
    private By currentuser = By.className("navbar-text");

    public WelcomePagePO(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHomeButton() {
        driver.findElement(home).click();
    }

    public void clickAddressButton() {
        driver.findElement(address).click();
    }

    public void clickSignOutButton() {
        driver.findElement(signOut).click();
    }

    public void verifiedDesiredEmailIsDisplayed(String desiredEmail) {
        String actualEmail = driver.findElement(currentuser).getText();
        Assert.assertEquals("Desired email is not displayed", desiredEmail, actualEmail);
    }
}
