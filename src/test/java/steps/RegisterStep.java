package steps;

import dto.AccountDto;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utils.DataUtils;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

@AllArgsConstructor
public class RegisterStep {
    public static WebDriver driver;
    private AccountDto accountDto;

    public void accessRegisterAccountPage() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://blossomzones.com/my-account/");
    }

    public void registerUsingValidEmail() {
        driver.findElement(By.xpath("//input[@id='reg_email']")).clear();
        accountDto.setEmail(DataUtils.getRandomEmail().toLowerCase(Locale.ROOT));
        driver.findElement(By.xpath("//input[@id='reg_email']")).sendKeys(accountDto.getEmail());
        driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
    }

    public void navigateToMyAccountPage() {
        driver.findElement(By.xpath("//p[contains(text(),'Hello')]")).isDisplayed();
    }

    public void registerUsingExistingEmail() {
        registerUsingValidEmail();
        driver.findElement(By.xpath("//*[contains(@class,'MyAccount-navigation-link--customer-logout')]")).click();
        driver.findElement(By.xpath("//input[@id='reg_email']")).clear();
        driver.findElement(By.xpath("//input[@id='reg_email']")).sendKeys(accountDto.getEmail());
        driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
    }

    public void displayRegisterAccountFailed() {
        driver.findElement(By.xpath("//strong[contains(text(),'Error:')]")).isDisplayed();
    }
}
