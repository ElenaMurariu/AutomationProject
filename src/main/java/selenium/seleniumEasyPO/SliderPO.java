package selenium.seleniumEasyPO;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SliderPO extends PageObject {

    private WebDriver driver;

    public SliderPO(WebDriver driver) {
        this.driver = driver;
    }

    public By firstinput = By.xpath("//input[@value='10']");
 //   @FindBy(xpath = "//input[@value='10']")
 //   public WebElement firstinput;


    public By firstOutput = By.xpath("//output[@id='range']");
 //   @FindBy(xpath = "//output[@id='range']")
 //   public WebElement firstOutput;

    public void moveInput(int x){
        Dimension dimension = driver.findElement(firstinput).getSize();
        int length = dimension.getWidth();
        Actions actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(firstinput)).moveByOffset((-length/100*50)+length/100*x, 0).release().build().perform();
    }
}
