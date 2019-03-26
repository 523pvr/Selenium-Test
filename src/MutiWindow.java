import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutiWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser stuff\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		Set <String> gwin = driver.getWindowHandles();
		
		Iterator<String> iwin = gwin.iterator();
		String cwind = iwin.next();
					
		driver.switchTo().window(cwind);
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Venkat@gmail.com");
	
	}

}
