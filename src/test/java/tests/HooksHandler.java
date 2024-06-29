package tests;


import driver.WebDriverSingleton;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import static driver.WebDriverSingleton.getScreenshotDriver;

public class HooksHandler extends BaseTest {

    @BeforeTest(alwaysRun = true)
    public void initialize() throws InterruptedException {
           webDriver.navigateTo("https://www.amazon.eg/");
    }


    @AfterMethod(alwaysRun = true)
    public void takeScreenshot(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            TakesScreenshot screenshotDriver = WebDriverSingleton.getScreenshotDriver();
            File screenshotFile = screenshotDriver.getScreenshotAs(OutputType.FILE);
            String screenshotDestination = "src/test/java/screenshots" + result.getName() + ".png";
            Files.copy(screenshotFile.toPath(), new File(screenshotDestination).toPath(), StandardCopyOption.REPLACE_EXISTING);
        }

    }

}
