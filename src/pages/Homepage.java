package pages;
//my name is kalpana vasantrao kadam 

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Homepage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locator for "Projects" link
    private By projectsLink = By.linkText("Projects");

    // Constructor
    public Homepage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Method to get the text of "Projects" link
    public String getProjectsText() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(projectsLink));
        return element.getText();
    }

    // Method to click the "Projects" link
    public void clickProjects() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(projectsLink));
        element.click();
    }
    public void clickProjectsAndScroll() {  
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(projectsLink));  
        element.click();  

        // Wait for the page to load completely
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));

        // Scroll down the page smoothly using JavaScriptExecutor  
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");  
    }
}

