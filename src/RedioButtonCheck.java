import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedioButtonCheck {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Browser stuff\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/ajax.html");
		driver.findElement(By.xpath("//input[@value='Yes']")).click();
		//System.out.println (driver.findElement(By.name("name")));
		int cnt = driver.findElements(By.xpath("//input[@type='radio']")).size();
		System.out.println (cnt);
		/*for (int i=1;i<cnt;i++)
		{
			
			driver.findElements(By.xpath("//input[@type='radio']")).get(2).click();
			
		}	
		*/
		
	}

}
