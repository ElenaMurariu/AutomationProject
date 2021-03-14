package selenium.addressBookPO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AddressPagePO {

    public AddressPagePO(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;
    private By newAdress = By.xpath("//a[text()='New Address']");
    private By firstNameInput = By.id("address_first_name");
    private By lastNameInput = By.id("address_last_name");
    private By addressOne = By.name("address[address1]");


    public void clickOnNewAdressButton(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(newAdress.findElement(driver)));
        driver.findElement(newAdress).click();
    }

    private void setFirstName (String firstName){
        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    private void setLastName (String lastName){
        driver.findElement(lastNameInput).sendKeys(lastName);
    }
    private void setAdressOne (String addressOneString){
        driver.findElement(addressOne).sendKeys(addressOneString);
    }

    public void fillNewAdress(String firstName, String lastName, String addressOneSring){
        setFirstName(firstName);
        setLastName(lastName);
        setAdressOne(addressOneSring);
 //       clickOnNewAdressButton();
    }



    @FindBy(name = "address[address2]")
    private WebElement addressTwo;

    @FindBy(css = "input#address_city")
    private WebElement city;

    @FindBy(name = "address[state]")
    private WebElement state;

    @FindBy(name = "address[zip_code]")
    private WebElement zipCode;

    @FindBy(id = "address_country_true")
    private WebElement countryUnitedStates;

    @FindBy(id = "address_country_false")
    private WebElement countryCanada;

    @FindBy(name = "address[birthday]")
    private WebElement birthday;

    @FindBy(name = "address[age]")
    private WebElement age;

    @FindBy(name = "address[website]")
    private WebElement website;

    @FindBy(name = "address[picture]")
    private WebElement picture;

    @FindBy(name = "address[phone]")
    private WebElement phone;

    @FindBy(id = "address_interest_climb")
    private WebElement climbing;

    @FindBy(id = "address_interest_dance")
    private WebElement dancing;

    @FindBy(id = "address_interest_read")
    private WebElement read;

    @FindBy(name = "address[note]")
    private WebElement note;

    @FindBy(name = "commit")
    private WebElement createAdressButton;

    @FindBy(xpath = "//a[@data-test='list']")
    private WebElement list;

    @FindBy(xpath = "//a[@data-test='edit']")
    private WebElement Edit;



    private void setAdressTwo(String addressTwoString) {
        addressTwo.sendKeys(addressTwoString);
    }
    private void setCity(String cityString) {
        city.sendKeys(cityString);
    }
    private void setState(String stateString) {
        Select selectelem = new Select(state);
        selectelem.selectByVisibleText(stateString);
    }
    public void setZipCode(String zipCodeString) {
        zipCode.sendKeys(zipCodeString);
    }
    public void clickOnCountry() {
        countryUnitedStates.click();
    }
    private void setBirthday (String birthdayDate){
        birthday.sendKeys(birthdayDate);
    }



//    private void setBirthday (String birthdaySet){
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd,MM,yyyy");
//        Date date = new Date();
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);
//        Date birthdayDate = calendar.getTime();
//        birthdaySet = simpleDateFormat.format(birthdayDate);
//    }

    private void setAge (String AgeInt){
        age.sendKeys(AgeInt);
    }
    private void setPicture (String pictureUrl){
        picture.sendKeys(pictureUrl);
    }
    public void clickOnClimbing() {
        climbing.click();
    }
    public void clickOnRead() {
        read.click();
    }
    public void clickOnSubmit() {
        createAdressButton.click();
    }
    public void clickOnEdit() {
        Edit.click();
    }
    public void clickOnList() {
        list.click();
    }


    public void fillNewAdress(String firstName, String lastName, String addressOneSring, String addressTwoString, String cityString, String stateString, String zipCodeString, String birthdayDate,
                              String AgeInt, String pictureUrl) {
        setFirstName(firstName);
        setLastName(lastName);
        setAdressOne(addressOneSring);
        setAdressTwo(addressTwoString);
        setCity(cityString);
        this.setState(stateString);
        setZipCode(zipCodeString);
        clickOnCountry();
        setBirthday(birthdayDate);
        setAge(AgeInt);
        setPicture(pictureUrl);
        clickOnClimbing();
        clickOnRead();
        clickOnSubmit();
    }

    public void errorfillNewAdress(String firstName, String addressOneSring) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(firstNameInput.findElement(driver)));
        setFirstName(firstName);
        setAdressOne(addressOneSring);
        clickOnClimbing();
        clickOnRead();
        clickOnSubmit();
    }

    public void fillNewAdress(String firstName, String lastName, String addressOneSring, String cityString, String zipCodeString) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(firstNameInput.findElement(driver)));
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAdressOne(addressOneSring);
        this.setCity(cityString);
        this.setZipCode(zipCodeString);
    }

    @FindBy(xpath = "//tbody/tr[last()]/td[1]")
    public WebElement checkFirstName;

    @FindBy(xpath = "//tbody/tr[last()]/td[2]")
    public WebElement checkLastName;

    @FindBy(xpath = "//tbody/tr[last()]/td[3]")
    public WebElement checkCityName;

    @FindBy(xpath = "//h4")
    public WebElement errorMessage;

    @FindBy(xpath = "//h4/following-sibling::ul/li")
    public List<WebElement> nrOfErrors;
}
