package selenium.seleniumEasy;
import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumEasyBaseTest {

    @Managed
    WebDriver driver;

    protected String url = "http://www.seleniumeasy.com/";
    protected String baseDriverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/";


    @Before
    public void setupTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", baseDriverPath + "chromedriver.exe");

        driver = new ChromeDriver();
        driver.get(url);
        Assert.assertEquals("Learn Selenium with Best Practices and Examples | Selenium Easy", driver.getTitle());
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }

    @After
    public void KillWebDriver() {
        driver.close();
        driver.quit();
    }
}
