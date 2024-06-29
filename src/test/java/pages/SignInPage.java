package pages;

import org.openqa.selenium.By;

public class SignInPage extends BasePage {


    private final By emailTextField = By.xpath("//input[@type='email']");
    private final By continueButton = By.id("continue");
    private final By errorMessage = By.xpath("//*[@id='auth-error-message-box']/div/div/ul/li/span");


    public void enterEmail(String email) {
        waitUntilElementIsPresent(emailTextField).sendKeys(email);

    }

    public void clickOnContinueButton() {
        waitUntilElementIsClickable(continueButton).click();
    }

    public String getErrorMessage() {
        String message = waitUntilElementIsPresent(errorMessage).getText();
        return message;
    }
}


