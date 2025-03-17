package syncsun;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenUrl {

	 public static void main(String[] args) {
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	        driver.get("https://syncsunenergy.digious.in/");
	        System.out.println("Test Successful: " + driver.getTitle());
	    WebElement Projects= driver.findElement(By.linkText("Projects"));
	        //driver.quit();
	  System.out.println(Projects.getText());       
	  Projects.click();
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0, 1500);");
	  
	    }
}
