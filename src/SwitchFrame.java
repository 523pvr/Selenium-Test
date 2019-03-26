import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser stuff\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		Select scountry =  new Select (driver.findElement(By.cssSelector("select[name='country']")));
		scountry.selectByVisibleText("ANGUILLA");
		
	
	

	
	}

}
