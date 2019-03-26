import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCheck {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Browser stuff\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/login.html");
		WebElement mail = driver.findElement(By.cssSelector("input[id='email']"));
		mail.sendKeys("Venkat@523");
		
	
		WebElement pass = driver.findElement(By.cssSelector("input[id='passwd']"));
		pass.sendKeys("Venkat@523");
		
		mail.clear();
		pass.clear();
		
		
	}

}
