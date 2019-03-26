import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlert {

	private static Object string;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Browser stuff\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://output.jsbin.com/usidix/1");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		driver.switchTo().alert().getText();
		//String alertMessage; 
		//alertMessage  = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(driver.switchTo().alert().getText());
	}

}
