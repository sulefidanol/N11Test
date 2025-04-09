import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void basariliGiris() throws InterruptedException {
        driver.findElement(By.id("login-email")).sendKeys(email);
        driver.findElement(By.name("login-password")).sendKeys(password);
        driver.findElement(By.cssSelector("[class = 'q-primary q-fluid q-button-medium q-button submit']")).click();
        Thread.sleep(3000);

        String  text = driver.findElements(By.cssSelector("[class='link-text']")).get(0).getText();
        System.out.println(text);
        Assert.assertEquals(text,"Hesabımm");
    }

    @Test
    public void basarisizGiris() throws InterruptedException {
        driver.findElement(By.id("login-email")).sendKeys(email);
        driver.findElement(By.name("login-password")).sendKeys("Test1234567890.");
        driver.findElement(By.cssSelector("[class = 'q-primary q-fluid q-button-medium q-button submit']")).click();
        Thread.sleep(3000);

        String  text = driver.findElements(By.cssSelector("[class='message']")).get(0).getText();
        System.out.println(text);
        Assert.assertEquals(text,"E-posta adresiniz ve/veya şifreniz hatalı.");

    }
}
