package selenium.addressBooks;

import org.junit.Test;
import selenium.addressBookPO.AddressPagePO;
import selenium.addressBookPO.SignInPO;
import selenium.addressBookPO.WelcomePagePO;

public class PageObjectTests extends selenium.seleniumEasy.PageObjectBaseTest {
    @Test
    public void pageObjectTest() throws InterruptedException {
        SignInPO signInPO = new SignInPO(driver);
        WelcomePagePO welcomePagePO = new WelcomePagePO(driver);
        AddressPagePO addressPagePO = new AddressPagePO(driver);

        signInPO.signIn("elena@elena.crom", "password");
        Thread.sleep(3000);
 //      if (signInPO.alert.findElement(driver).isDisplayed()){
 //           signInPO.signUp("elena@elena.crom", "password");
 //       }
 //       Thread.sleep(3000);
        welcomePagePO.verifiedDesiredEmailIsDisplayed("elena@elena.crom");
        welcomePagePO.clickAddressButton();
        Thread.sleep(3000);
        addressPagePO.clickOnNewAdressButton();
        Thread.sleep(3000);
        addressPagePO.fillNewAdress("Elena", "Mur","street");
        Thread.sleep(3000);
    }
}
