package selenium.seleniumEasyPO;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DragAndDropPO extends PageObject {

    private WebDriver driver;

    public DragAndDropPO(WebDriver driver) {
        this.driver = driver;
    }

    private By listofdraggables = By.xpath("//span[@draggable='true']");
    public int DraggableListSize(){
        return driver.findElements(listofdraggables).size();
    }

//    @FindBy(xpath = "//span[@draggable='true']")
//    private List<WebElement> listofdraggables;

    public By firstDraggableOption = By.xpath("//h3/following-sibling::span[1]");
//    @FindBy(xpath = "//h3/following-sibling::span[1]")
//    public WebElement firstDraggableOption;


    public By dropzone = By.xpath("//h2[@class='text-center']/following-sibling::div");
//    @FindBy(xpath = "//h2[@class='text-center']/following-sibling::div")
//    public WebElement dropzone;


    public By DroppedList = By.xpath("//h3[@class='text-center']/following-sibling::div");
//    @FindBy(xpath = "//h3[@class='text-center']/following-sibling::div")
//    public List<WebElement> DroppedList;
}
