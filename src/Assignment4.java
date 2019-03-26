import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser stuff\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
// 1) Navigate to "http://www.qaclickacademy.com/practice.php".
		
		driver.get("http://www.qaclickacademy.com/practice.php");
/* 2) Need to Select the one check box and get the title of check of box which you clicked 
		i)	Need to keep in one variable.	  
*/		
		driver.findElement(By.id("checkBoxOption3")).click();
		String str = driver.findElement(By.xpath("//label[@for='honda']")).getText();
		System.out.println(str);
		Thread.sleep(5000L);
		
/*3) goto static drop down and select one you have selected before in check box	
	i) in 2.i take the variable and select for drop down.
*/
		driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).sendKeys(str);
 
// 4) Need to enter the step garbed text.
		
		driver.findElement(By.xpath("input[@id='name']")).sendKeys(str);
		
//	5) Need to click on alert and verify the entered text is present in the  alert message
		
		driver.findElement(By.xpath("input[@id='alertbtn']")).click();
		driver.switchTo().alert().accept();
		
		
		
		
	}

}


