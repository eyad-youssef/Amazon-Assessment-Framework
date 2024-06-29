package tests;

import driver.WebDriverSingleton;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDefinition extends BaseTest {

    @Given("user open signIn page")
    public void userOpenSignInPage() throws Exception {
        amazon.home.clickOnSignInButton();
        amazon.signIn = amazon.home.goToSigninPage();
        Thread.sleep(5000);

    }

    @When("enter valid email {string}")
    public void enterValidEmail(String email) {
        amazon.signIn.enterEmail(email);

    }

    @Then("click on continue button")
    public void clickOnSingInButton() {
        amazon.signIn.clickOnContinueButton();
    }

    @And("get the result message{string}")
    public void getTheResultMessage(String expectedMessage) throws Exception {
        String actualMessage = amazon.signIn.getErrorMessage();
        Assert.assertEquals(actualMessage, expectedMessage);


    }


    @Given("user click on all products tab")
    public void userClickOnAllProductsTab() throws InterruptedException {

        amazon.home.clickOnAllProductsTab();
    }

    @And("choose today's deals")
    public void chooseTodaySDeals() {
        amazon.home.clickOnTodaysDealsItem();
    }

    @When("choose the second category")
    public void chooseTheSecondCategory() throws InterruptedException {
        amazon.product = amazon.home.goToProductsPage();
        amazon.product.chooseCategory();
    }

    @And("take the first product")
    public void takeTheFirstProduct() {
        amazon.product.chooseProduct();
    }

    @And("add quantity{string}")
    public void addQuantity(String quantity) throws InterruptedException {
        amazon.product.addProductQuantity(quantity);
        Thread.sleep(3000);
    }

    @And("click on add to cart button")
    public void clickOnAddToCartButton() throws InterruptedException {
        amazon.product.clickOnAddToCartButton();
        Assert.assertTrue(amazon.product.getResultMessage());
        amazon.product.clickOnGoToBasketButton();


    }

    @Then("go to cart page")
    public void goToCartPage() {
        amazon.cart = amazon.product.goToCartPage();
    }

    @And("check items name{string} and price{string} and total price{string}")
    public void checkItemsNameAndPriceAndQuantity(String name, String price, String total) throws InterruptedException {
        Assert.assertEquals(amazon.cart.getProductName(), name);
        Assert.assertEquals(amazon.cart.getProductPrice(), price);
        Assert.assertEquals(amazon.cart.getProductSubTotal(), total);

    }

    @Given("user hover over Hello, sign in Account & Lists tab")
    public void userHoverOverHelloSignInAccountListsTab() throws InterruptedException {

        amazon.home.hoverOverSignInAccountAndLists();
    }

    @When("select your orders option")
    public void selectYourOrdersOption() throws InterruptedException {
        amazon.home.goToOrdersPage();

    }

    @Then("user go to sign in  page")
    public void userGoToSignInPage() {
        Assert.assertTrue(amazon.home.getEmailTextField());
        Assert.assertTrue(amazon.home.getSignInHeader());
        Assert.assertTrue(amazon.home.getSignInButtonConfirm());

    }

    @When("select your address option")
    public void selectYourAddressOption() throws InterruptedException {
        amazon.home.goToAddressPage();
    }

    @When("select your lists option")
    public void selectYourListsOption() throws InterruptedException {
        amazon.home.goToListsPage();
    }

    @Then("user go to lists page")
    public void userGoToListsPage() {
        Assert.assertTrue(amazon.home.getListsBanner());
    }
}
