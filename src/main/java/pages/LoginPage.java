package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import lombok.Getter;

@Getter
public class LoginPage {

    @FindBy(name = "username")
    private WebElement inputUserNameField;

    @FindBy(name = "password")
    private WebElement inputPasswordField;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement buttonSubmit;
}
