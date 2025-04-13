import Base.BaseLibrary;
import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MainPage extends BaseTest {

    @Step("Hesap bilgisi kontrol edilir")
    public MainPage accountControl(){
       String  text = driver.findElements(By.cssSelector("[class='user']")).get(0).getText();
        Assert.assertEquals(text,"ŞF");
        screenshot();
        return this;
    }
}
