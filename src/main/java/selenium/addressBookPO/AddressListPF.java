package selenium.addressBookPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddressListPF {

    private WebDriver driver;

    public AddressListPF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//tbody/tr/td/a[@data-method='delete']")
    public List<WebElement> deletebuttons;


    public List<WebElement> getDeletebuttons() {
        return deletebuttons;
    }

    public void deleteAllEntries(){
        try {
            for (WebElement element : this.getDeletebuttons()) {
                element.click();
                driver.switchTo().alert().accept();
            }
        }
        catch (WebDriverException e){
            deleteAllEntries();
        }
    }

}
