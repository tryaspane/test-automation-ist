package pages;

import lombok.AllArgsConstructor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import lombok.Getter;

@Getter
//@AllArgsConstructor
public class LoginPage {

    @FindBy(name = "username")
    private WebElement inputUserNameField;

    @FindBy(name = "//input[@id='user_login']")
    private WebElement inputUserLogin;

    @FindBy(name = "password")
    private WebElement inputPasswordField;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement buttonSubmit;

    @FindBy(xpath = "//p[text()='Invalid credentials']")
    private WebElement loginErrorAlert;

    @FindBy(xpath = "//button[contains(text(),'Masuk')]")
    private WebElement buttonMasuk;

    @FindBy(xpath = "//input[@id='email-phone']")
    private WebElement inputEmailPhoneField;

    @FindBy(xpath = "//span[contains(text(),'Selanjutnya')]")
    private WebElement buttonSelanjutnya;

    @FindBy(xpath = "//h5[contains(text(),'Email belum terdaftar')]")
    private WebElement emailUnregisteredError;
}
