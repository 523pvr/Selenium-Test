import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSocialIcon {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Browser stuff\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/tooltip.html");
		Thread.sleep(5000L);
		System.out.println(driver.findElement(By.xpath("//a[@title='Github']")).getAttribute("title"));
		
		
		
		
	}

}
