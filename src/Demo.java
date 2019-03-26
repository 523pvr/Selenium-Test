import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	private static final String TakeScreenShot = null;

	public static void main(String[] args) throws SQLException, FileNotFoundException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Browser stuff\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		// Select for Drop downs
		/*We have three options in Select method one by index, another by name,another one by visible text.
		 *   
	
		*/
		Select sel = new Select(driver.findElement(By.xpath("abad")));
		sel.selectByIndex(1);
		sel.selectByValue("hyd");
		sel.selectByVisibleText("123");
		List<WebElement> lsize = sel.getOptions();
		int isize = lsize.size();
		for (int i =0;i<isize;i++) {
			System.out.println(lsize.get(i).getText());
		}
	
		
		/*
		 * Print all links We need to get the size of all links first then can keep in for loop we can Text of each link resides in that page
		 */
	
	List<WebElement> getlinks = driver.findElements(By.tagName("a"));
	for (int i =0;i<getlinks.size();i++) {
		System.out.println(getlinks.get(i).getText());
	}
	
	
	// actions are used to mimic the mouse actions.
	
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("xxxxxx"))).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.BACK_SPACE)).build().perform();
	
	/*
	 * Take Screen Shot
	 */
			
	
	//File src= ((TakesScreenshot)driver).getScreenshotAs("scr.png");
	//FileUtils.copyfiles(src,location of a file name )

	
	//DB connection
	String host = null;
	String port = null;
	Connection con = DriverManager.getConnection("JDBC:mysqa://"+host+":"+port+":"+"uesrname"+"password");
	Statement stmt = con.createStatement();
	ResultSet reslt = stmt.executeQuery("select *from tabel where table=9");
	
	
	//Exel data
	
	FileInputStream  inpfile = new FileInputStream("lcation of a file name");
 
//Assert.asert
// implicit wait

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}



}
	