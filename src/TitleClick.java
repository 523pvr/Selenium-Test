import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\Browser stuff\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.office.com/?WT.mc_id=O16_BingHP");
		System.out.println(driver.getTitle());

		driver.findElement(By.cssSelector("img[class='c-image']")).click();

		if (driver.getTitle().equals("Online Courses - Learn Anything, On Your Schedule | Udemy")) {
			System.out.println(" we are on Udemy home page");
		}

		else {

			System.out.println(" we are on Wrong Udemy home page");
		}
	}

}
