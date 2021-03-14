package selenium.seleniumEasyPO;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DualListBoxPO extends PageObject {

    private WebDriver driver;

    public DualListBoxPO(WebDriver driver) {
        this.driver = driver;
    }

    public By leftSearch = By.xpath("//div/span/following-sibling::input");
    public void textLeftSearch(String leftText) {
        driver.findElement(leftSearch).click();
        driver.findElement(leftSearch).sendKeys(leftText);
    }
 //   @FindBy(xpath = "//div/span/following-sibling::input")
 //   private WebElement leftSearch;

    public By rightSearch = By.xpath("//div/span/preceding-sibling::input");
    public void textRightSearch(String rightText) {
        driver.findElement(rightSearch).sendKeys(rightText);
    }
 //   @FindBy(xpath = "//div/span/preceding-sibling::input")
 //   private WebElement rightSearch;


    public void eraseLeftSearch (){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(leftSearch)).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
    }

    public void eraseRightSearch (){
        Actions action = new Actions(driver);
        action.click(rightSearch.findElement(driver)).sendKeys("a").sendKeys(Keys.BACK_SPACE).build().perform();
    }


    private By leftoptions = By.xpath("//div[@class='well text-right']/div/following-sibling::ul/li");
//    @FindBy(xpath = "//div[@class='well text-right']/div/following-sibling::ul/li")
//    private List<WebElement> leftoptions;


    public int noOfLeftSearches(String leftText) {
        int leftCounter = 0;
        for (int i = 0; i < driver.findElements(leftoptions).size(); i++) {
            if (driver.findElements(leftoptions).get(i).getText().toLowerCase().contains(leftText)) leftCounter++;
        }
        return leftCounter;
    }


    private By rightoptions = By.xpath("//div[@class='well']/div/following-sibling::ul/li[not(contains(@style,'none'))]");
//    @FindBy (xpath = "//div[@class='well']/div/following-sibling::ul/li[not(contains(@style,'none'))]")
//    private List<WebElement> rightoptions;

    public int sumOfAllOptions(){
        int sum = driver.findElements(leftoptions).size()+driver.findElements(rightoptions).size();
        return sum;
    }

    public int noOfRightSearches(String rightText) {
        int rightCounter = 0;
        for (int j = 0; j < driver.findElements(rightoptions).size(); j++) {
            if (driver.findElements(rightoptions).get(j).getText().toLowerCase().contains(rightText)) rightCounter++;
        }
        return rightCounter;
    }

    private By bootstrap = By.xpath("//div[@class='well text-right']/div/following-sibling::ul/li[contains(text(),'bootstrap')]");
//    @FindBy (xpath = "//div[@class='well text-right']/div/following-sibling::ul/li[contains(text(),'bootstrap')]")
 //   private WebElement bootstrap;

    public void selectBootstrap(){
        driver.findElement(bootstrap).click();
    }

    private By vestibulum = By.xpath("//div[@class='well text-right']/div/following-sibling::ul/li[contains(text(),'Vestibulum')]");
//    @FindBy (xpath = "//div[@class='well text-right']/div/following-sibling::ul/li[contains(text(),'Vestibulum')]")
 //   private WebElement vestibulum;

    public void selectVestibulum(){
        driver.findElement(vestibulum).click();
    }

    private By toRightButton = By.xpath("//span[@class='glyphicon glyphicon-chevron-right']");
//    @FindBy (xpath = "//span[@class='glyphicon glyphicon-chevron-right']")
//    private WebElement toRightButton;

    public void clickOnToRightButton(){
        driver.findElement(toRightButton).click();
    }


    private By toLeftButton = By.xpath("//span[@class='glyphicon glyphicon-chevron-left']");
//    @FindBy (xpath = "//span[@class='glyphicon glyphicon-chevron-left']")
 //   private WebElement toLeftButton;

    public void clickOnToLeftButton(){
        toLeftButton.findElement(driver).click();
    }

    private By rightSelectAllButton = By.xpath("//div[@class='well']/div/div/div/a[@class='btn btn-default selector']");
//    @FindBy (xpath = "//div[@class='well']/div/div/div/a[@class='btn btn-default selector']")
 //   private WebElement rightSelectAllButton;

    public void clickOnRightSelectAllButton(){
        rightSelectAllButton.findElement(driver).click();
    }

}
