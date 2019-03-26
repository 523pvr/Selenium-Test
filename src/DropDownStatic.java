import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownStatic {

	public static void main(String[] args) throws InterruptedException {

		
			
		System.setProperty("webdriver.chrome.driver", "D:\\Browser stuff\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Select scountry =  new Select (driver.findElement(By.cssSelector("select[name='country']")));
		scountry.selectByVisibleText("ANGUILLA");
		Thread.sleep(5000L);
		driver.get("http://output.jsbin.com/osebed/2");
		Select fruitsinWeb = new Select(driver.findElement(By.name("fruits")));
		fruitsinWeb.selectByVisibleText("orange");
		fruitsinWeb.selectByValue("grape");
		
	}

}
