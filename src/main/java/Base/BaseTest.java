package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Data{

    public WebDriver driver = new ChromeDriver();
    @BeforeMethod
    public void openBrowser (){

        driver.manage().window().maximize();
        driver.get("https://www.trendyol.com/giris");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
