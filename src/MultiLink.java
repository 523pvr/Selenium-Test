import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Browser stuff\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement ftooter = driver.findElement(By.id("gf-BIG"));
		System.out.println(ftooter.findElements(By.tagName("a")).size());
		
		WebElement Cftooter = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		System.out.println(Cftooter.findElements(By.tagName("a")).size());
		
		for (int i =1;i<Cftooter.findElements(By.tagName("a")).size();i++) {
			
			String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			Cftooter.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(5000);
		}
			Set <String> wintitle = driver.getWindowHandles();
			Iterator <String> wintitleIt = wintitle.iterator();
		
			while(wintitleIt.hasNext()) {
				
				driver.switchTo().window(wintitleIt.next());
				System.out.println(driver.getTitle());
			}
			
		
		
		
	}

}
