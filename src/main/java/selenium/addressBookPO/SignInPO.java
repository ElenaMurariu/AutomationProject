package selenium.addressBookPO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPO {

    private WebDriver driver;
    private By email = By.id("session_email");
    private By password = By.id("session_password");
    private By signInButton = By.name("commit");
    private By signUpButton = By.className("row");
    public By alert = By.xpath("//div[@class='alert alert-notice']");

    public SignInPO(WebDriver driver) {
        this.driver = driver;
    }

    private void setEmail(String emailAddress) {
        driver.findElement(email).sendKeys(emailAddress);
    }

    private void setPassword(String passwordString) {
        driver.findElement(password).sendKeys(passwordString);
    }

    private void clickOnSignInButton() {
        driver.findElement(signInButton).click();
    }

    private void clickOnSignUpButton() {
        driver.findElement(signUpButton).click();
    }

    public void signIn(String emailAddress, String passwordString) throws InterruptedException {
        setEmail(emailAddress);
        setPassword(passwordString);
        clickOnSignInButton();
        Thread.sleep(3000);
    //    WelcomePagePO welcomePagePO = new WelcomePagePO(driver);
      //  welcomePagePO.verifiedDesiredEmailIsDisplayed(emailAddress);
    }
    public void signUp(String emailAddress, String passwordString) throws InterruptedException {
        clickOnSignUpButton();
        setEmail(emailAddress);
        setPassword(passwordString);
        clickOnSignInButton();
        Thread.sleep(3000);
    }

}
