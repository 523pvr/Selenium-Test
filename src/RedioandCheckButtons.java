import javax.swing.SortingFocusTraversalPolicy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedioandCheckButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Browser stuff\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");

		int cnt = driver.findElements(By.cssSelector("input[type='radio]")).size();
			System.out.println(cnt);	
		for (int i=0; i<cnt; i++)
		
		{
	
			driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
			
		}	
		
	}

}
