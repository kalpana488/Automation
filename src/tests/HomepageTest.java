package tests;


import base.BaseTest;
import pages.Homepage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomepageTest extends BaseTest {
    private Homepage homePage;

    @BeforeMethod
    public void setUpTest() {
        setup();

  
        driver.get("https://syncsunenergy.digious.in"); // Change to your actual website
        homePage = new Homepage(driver);
    }

    @Test(priority=1)
    public void testProjectsLink() {
        System.out.println("Projects Link Text: " + homePage.getProjectsText());
        homePage.clickProjects();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);"); // Scroll down by 500 pixels
    }
    
   // @Test(priority=2)
    private void scrollPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500);"); // Scroll down by 500 pixels
    }
//    @AfterMethod
//    public void tearDownTest() {
//        tearDown();
//    }
}
