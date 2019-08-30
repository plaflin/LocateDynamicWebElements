import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocateDynamicWebElements {	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/shaan/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");

		driver.findElement(By.cssSelector("a[title='Google apps']")).click();
		driver.findElement(By.cssSelector("a[href*='play.google.com']")).click();
		
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();
		driver.findElement(By.xpath("//a[contains(@href,'play.google.com')]")).click();
	}
}

