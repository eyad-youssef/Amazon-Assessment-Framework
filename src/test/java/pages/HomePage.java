package pages;

import driver.WebDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.subpages.ProductsPage;

public class HomePage extends BasePage {

    private final By allProductsList = By.xpath("//a[@id='nav-hamburger-menu']");
    private final By todaysDealsOption = By.xpath("//a[@href='/-/en/gp/goldbox/?ref_=nav_em_navm_deals_0_1_1_24']");
    private final By signInAccountAndListsHover = By.xpath("//span[@class='nav-line-2 ']");

private  final By emailTextField = By.xpath("//input[@id='ap_email']");
    private final By signInHeader = By.xpath("//h1[@class='a-spacing-small']");
    private final By confirmSignInButton=By.xpath("//input[@id='signInSubmit']");
    private final By orders = By.id("nav_prefetch_yourorders");
    private final By address = By.id("nav_prefetch_youraddresses");
    private final By lists = By.xpath("//a[@href='/-/en/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_top_flyout_wishlist']");

    private final By listsBanner = By.xpath("//span[@class='al-intro-banner-header']");
    private final By signInButton = By.id("nav-link-accountList");


    public void hoverOverSignInAccountAndLists() throws InterruptedException {
        new Actions(WebDriverSingleton.getWebDriver())
                .moveToElement(waitUntilElementIsPresent(signInAccountAndListsHover))
                .perform();
        Thread.sleep(3000);
    }


    public  Boolean getEmailTextField(){
        return waitUntilElementIsPresent(emailTextField).isSelected();
    }
    public boolean getSignInHeader() {
        return  waitUntilElementIsPresent(signInHeader).isDisplayed();

    }
    public boolean getSignInButtonConfirm(){
        return waitUntilElementIsClickable(confirmSignInButton).isEnabled();
    }

    public void goToOrdersPage() throws InterruptedException {
        hoverOverSignInAccountAndLists();
        waitUntilElementIsClickable(orders).click();
    }

    public void goToAddressPage() throws InterruptedException {
        hoverOverSignInAccountAndLists();
        waitUntilElementIsClickable(address).click();

    }

    public void goToListsPage() throws InterruptedException {
        hoverOverSignInAccountAndLists();
        waitUntilElementIsClickable(lists).click();
        Assert.assertTrue(waitUntilElementIsPresent(signInButton).isDisplayed());
    }
    public Boolean getListsBanner(){
        return  waitUntilElementIsPresent(listsBanner).isDisplayed();
    }


    public void clickOnAllProductsTab() {
        waitUntilElementIsClickable(allProductsList).click();
    }

    public void clickOnTodaysDealsItem() {
        waitUntilElementIsClickable(todaysDealsOption).click();
    }

    public ProductsPage goToProductsPage() {return new ProductsPage();}

    public void clickOnSignInButton() {
        waitUntilElementIsClickable(signInButton).click();
    }

    public SignInPage goToSigninPage() {
        return new SignInPage();
    }
}
