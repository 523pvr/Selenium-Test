import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser stuff\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("TIR");
		Thread.sleep(4000L);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String jsc = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(jsc);
		System.out.println(text);
		int i=0;
		while (!text.equalsIgnoreCase("TIRUPATHI")) {
			i++;
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			 text = (String) js.executeScript(jsc);
			 System.out.println(text);
			
			 if(i>10) {
				 
				 break;
			 }
			 
		}
		
		if (i<10) {
			
			System.out.println("Elemnet not found");
		}
		else {
			System.out.println("Elemnet found");
		}
			
		
	}
}
