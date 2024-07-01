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
        driver.get("https://blossomzones.com");
    }

    public void loginUsingEmailAndPassword(String email, String password) {
        driver.findElement(By.xpath("//a[contains(text(),'Login / Register')]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='user_login']")).clear();
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='user_pass']")).clear();
        driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();

    }

    public void verifyUserCanSeeLoginFailed() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//body/div[@id='login']/div[@id='login_error']/p[1]")).isDisplayed();
    }

    public void verifyUserCanSeeLoginIsSuccess() {
    }
}
