package steps;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

@AllArgsConstructor
public class LoginStep {
    public static WebDriver driver;
    private LoginPage loginPage;


    public void loginPage() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void loginUsingInvalidEmailAndPassword(String email, String password) {
        driver.findElement((By) loginPage.getInputUserNameField()).clear();
        driver.findElement((By) loginPage.getInputUserNameField()).sendKeys(email);
        driver.findElement((By) loginPage.getInputPasswordField()).clear();
        driver.findElement((By) loginPage.getInputPasswordField()).sendKeys(password);
        driver.findElement((By) loginPage.getButtonSubmit()).click();
    }

    public void verifyUserCanSeeLoginFailed() {
    }

    public void verifyUserCanSeeLoginIsSuccess() {
    }
}
