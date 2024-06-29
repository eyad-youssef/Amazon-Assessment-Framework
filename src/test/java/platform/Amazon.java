package platform;


import pages.subpages.CartPage;
import pages.HomePage;
import pages.SignInPage;

import pages.subpages.ProductsPage;

public class Amazon {
 public HomePage home;
 public SignInPage signIn;
 public ProductsPage product;
 public CartPage cart;


    public Amazon() {
        this.home=new HomePage();
    }
}
