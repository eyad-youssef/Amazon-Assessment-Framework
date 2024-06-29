package pages;


import driver.WebDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Waits;

public class BasePage extends Waits {
    protected  WebDriver driver = WebDriverSingleton.getWebDriver();
}
