import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardOpr {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Browser stuff\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		WebElement maction = driver.findElement(By.cssSelector("input[name='userName']"));
	//	maction.sendKeys("venkat").
	}

}
