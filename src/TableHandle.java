import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser stuff\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.espncricinfo.com/series/18879/scorecard/1157383/new-zealand-vs-pakistan-3rd-test-nz-in-uae-2018-19");
		
		WebElement ptable = driver.findElement(By.cssSelector("div[class='scorecard-section batsmen']"));
		int rocunt  = ptable.findElements(By.cssSelector("div[class='wrap batsmen']")).size();
		ptable.findElements(By.cssSelector("div[class='wrap batsmen'] div:nth-child(3)")).size();
		for(int i=0;i<rocunt;i++) {
			System.out.println(ptable.findElements(By.cssSelector("div[class='wrap batsmen'] div:nth-child(3)")).get(i).getText());
			
			
		}
		
		System.out.println(ptable.findElement(By.cssSelector("div[class='wrap extras'] div:nth-child(2)")).getText());
		System.out.println(ptable.findElement(By.cssSelector("div[class='wrap total'] div:nth-child(2)")).getText());
		
		
		
	}

}
