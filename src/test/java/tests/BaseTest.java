package tests;


import driver.WebDriverSingleton;
import platform.Amazon;



public class BaseTest  {
    protected static WebDriverSingleton webDriver;
    protected static Amazon amazon = new Amazon();

    public BaseTest(){
        webDriver = WebDriverSingleton.getDriverSingleton();
    }

}
