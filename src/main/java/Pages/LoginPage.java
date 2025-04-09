package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BaseTest {


    @Step("e posta doldurma alanı")
    public LoginPage fillEmail(String email){
        driver.findElement(By.id("login-email")).sendKeys(email);
        return this;
    }

    @Step("şifre doldurma alanı")
    public LoginPage fillPasword(String password){
        driver.findElement(By.name("login-password")).sendKeys(password);
        return this;
    }

    @Step("Giriş alanına tıklanır")
    public LoginPage clickLogin(){
        driver.findElement(By.cssSelector("[class = 'q-primary q-fluid q-button-medium q-button submit']")).click();
        return this;
    }

    @Step("Hata mesajı kontrol edilir")
    public LoginPage errorMessageController(String value){
        String  text = driver.findElements(By.cssSelector("[class='message']")).get(0).getText();
        Assert.assertEquals(text,value);
        screenshot();
        return this;
    }
}
