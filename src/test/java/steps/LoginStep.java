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


    public void accessDashboardPage() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.get("https://www.tokopedia.com/");
        driver.get("https://blossomzones.com/wp-login.php");
    }

    public void loginUsingInvalidEmailAndPassword(String email, String password) {
        driver.findElement(By.xpath("//input[@id='user_login']")).clear();
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='user_pass']")).clear();
        driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
    }

    public void userLoginUsingEmailOrPhone(String email_phone) {
//        driver.findElement((By) loginPage.getButtonMasuk()).click();
//        driver.findElement((By) loginPage.getInputEmailPhoneField()).clear();
//        driver.findElement((By) loginPage.getInputEmailPhoneField()).sendKeys(email_phone);
//        driver.findElement((By) loginPage.getButtonSelanjutnya()).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//        driver.findElement((By) loginPage.getInputEmailPhoneField()).clear();
//        driver.findElement((By) loginPage.getInputEmailPhoneField()).sendKeys(email_phone);
//        driver.findElement((By) loginPage.getButtonSelanjutnya()).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
//        loginButton.click();
//        TypeUtils.sendKeys((WebElement) By.xpath("//input[@id='user_login']"),email_phone);
//        driver.findElement(By.xpath("//input[@id='user_login']")).clear();
        driver.findElement(By.xpath("//input[@id='user_login']")).clear();
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(email_phone);
    }

    public void verifyUserCanSeeLoginFailed() {
//        driver.findElement((By) loginPage.getEmailUnregisteredError()).isDisplayed();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//body/div[@id='login']/div[@id='login_error']/p[1]")).isDisplayed();
    }

    public void verifyUserCanSeeLoginIsSuccess() {
    }
}
