import Base.BaseTest;
import Pages.LoginPage;

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
        loginPage.errorMessageController("E-posta adresi veya şifre hatalı, kontrol edebilir misin?");
    }
}
