package selenium.seleniumEasy;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectBaseTest {

    protected WebDriver driver;
    protected String driversPath = System.getProperty("user.dir") + "/src/test/resources/drivers/";

    @Before
    public void setUpTest() {
        System.setProperty("webdriver.chrome.driver", driversPath + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.manage().window().maximize();
    }

    @After
    public void tearDownTest(){
        driver.close();
        driver.quit();
    }
}
