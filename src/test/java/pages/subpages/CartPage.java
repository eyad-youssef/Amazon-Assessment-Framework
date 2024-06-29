package pages.subpages;

import org.openqa.selenium.By;
import pages.BasePage;

public class CartPage extends BasePage {

    private final By productName = By.xpath("//span[@class='a-truncate-full a-offscreen']");
    private final By productPrice = By.xpath("//div[@class='sc-badge-price-to-pay']");
    private final By productSubTotal = By.id("sc-subtotal-amount-buybox");
    private final By productQYT = By.id("sc-subtotal-label-activecart");

    public String getProductName() throws InterruptedException {
        Thread.sleep(3000);
        String title = waitUntilElementIsPresent(productName).getText();

        return title;

    }


    public String getProductPrice() {
        String singleItemPrice = waitUntilElementIsPresent(productPrice).getText();

        return singleItemPrice;
    }


    public String getProductSubTotal() {
        String totalProductsPrice = waitUntilElementIsPresent(productSubTotal).getText();
//        System.out.println(totalProductsPrice);
        return totalProductsPrice;
    }

    public String getProductQyt() {
        return waitUntilElementIsPresent(productQYT).getText();


    }
}
