package selenium.seleniumEasyPO;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePickerPO extends PageObject {

    private WebDriver driver;

    public DatePickerPO(WebDriver driver) {
        this.driver = driver;
    }

    public By dateExampleField = By.xpath("//div[@class='input-group date']/input");

    public void inputDateByHand(String date){
               driver.findElement(dateExampleField).sendKeys(date);
    }

    private By dateExampleButton = By.xpath("//div[@class='input-group date']/span/i");

    public void clickOnDateExampleButton() {
        driver.findElement(dateExampleButton).click();
    }

    private By today = By.xpath("//div[1]/table/tfoot/tr/th[@class='today']");

    public void clickToday(){
        driver.findElement(today).click();
    }

    private By tableDateExample = By.xpath("//div[1]/table");

    public String currentDate(){
        Date currentDate = new Date();
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd/MM/yyyy");
        String today = simpleDateFormat.format(currentDate);
        return today;
    }

}

