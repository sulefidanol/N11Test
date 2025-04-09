import Base.BaseTest;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Test(description = "Başarılı Kullanıcı Girişi")
    public void basariliGiris(){
       loginPage.fillEmail(email)
                .fillPasword(password)
                .clickLogin();
        sleep(3000);

        mainPage.accountControl();

    }

    @Test(description = "Başarısız kullanıcı girişi")
    public void basarisizGiris()  {
        loginPage.fillEmail(email)
                .fillPasword("12393849838")
                .clickLogin();

        sleep(3000);
        loginPage.errorMessageController("E-posta adresiniz ve/veya şifreniz hatalı.");
    }
}
