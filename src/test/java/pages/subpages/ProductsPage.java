package pages.subpages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

public class ProductsPage extends BasePage {
    private final By categoryCheckBox = By.xpath("//div[@aria-labelledby='departments']/child::span[3]");
    private final By firstProduct = By.xpath("//div[@data-test-index='0']/child::div[1][@data-csa-c-posx='1']");
    private final By quantityList = By.id("quantity");
    private final By addToCartButton = By.xpath("//input[@id='add-to-cart-button']");
    private final By resultMessage = By.xpath("//h1[contains(.,'Added to Cart')]");
    private final By goToBasketButton = By.xpath("//a[@href='/-/en/cart?ref_=sw_gtc'and contains(.,'Go to basket')]");


    public void chooseCategory() throws InterruptedException {
        waitUntilElementIsClickable(categoryCheckBox).click();
    }

    public void chooseProduct() {

        waitUntilElementIsClickable(firstProduct).click();

    }
    public void addProductQuantity(String quantity) {
        Select select = new Select(waitUntilElementIsPresent(quantityList));
        select.selectByValue(quantity);
    }

    public void clickOnAddToCartButton() throws InterruptedException {

        waitUntilElementIsClickable(addToCartButton).click();
        Thread.sleep(5000);
//        waitUntilElementIsClickable(popUp).click();
    }

    public Boolean getResultMessage(){
        return waitUntilElementIsPresent(resultMessage).isDisplayed();
    }
    public void clickOnGoToBasketButton(){
         waitUntilElementIsClickable(goToBasketButton).click();
    }



    public CartPage goToCartPage() {
        return new CartPage();
    }


}
