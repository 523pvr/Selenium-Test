import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Browser stuff\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
// 1) Navigate to "http://www.qaclickacademy.com/practice.php"  
		
		driver.get("http://www.qaclickacademy.com/practice.php");

// 2) find the Auto suggestive box which we can enter "UNI"  (United Kingdom) 
		
		driver.findElement(By.xpath("//input[@placeholder='Select Countries']")).sendKeys("uni");
		driver.findElement(By.xpath("//input[@placeholder='Select Countries']")).sendKeys(Keys.DOWN);
		
		JavascriptExecutor jsc = (JavascriptExecutor) driver;
		String cstr =  "return document.getElementById(\"autocomplete\").value;";
		String ctext = (String) jsc.executeScript(cstr);
		System.out.println(ctext);
		int i=0;
		
		while(!ctext.equalsIgnoreCase("United States")) {
			i++;
			driver.findElement(By.xpath("//input[@placeholder='Select Countries']")).sendKeys(Keys.DOWN);
			 ctext = (String) jsc.executeScript(cstr);
			 System.out.println(ctext);
			
			 if(i>10) {
				 
				 break;
			 }
			 
		}
		
		if (i>10) {
			
			System.out.println("Elemnet not found");
		}
		else {
			System.out.println("Elemnet found");
		}
		
			
			
		}
		
		
		
	}


