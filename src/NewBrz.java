import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewBrz {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driver =new ChromeDriver();
//driver.get("https://www.google.com");
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());
	}

}
