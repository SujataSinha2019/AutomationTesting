import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhPTravels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Invoke the Chrome browser.exe file
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\workspace\\chromedriver.exe");
		
		//Create driver object and implement web driver interface 
		WebDriver driver = new ChromeDriver(); 
		
		
		
		//Invoke the Url
		driver.get("https://phptravels.com/demo");
		
		//Click the Login button
		driver.findElement(By.cssSelector("a[class*='sign-in']")).click();
		//driver.findElement(By.xpath("//a[contains(@class='log in')]")).click(); - error
		
		//Enter UserName and Password to login
		driver.findElement(By.xpath("//*[@id='inputEmail']")).sendKeys("sujata.sinha.26@gmail.com");
		driver.findElement(By.xpath("//*[@id='inputPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[1]")).click();
		driver.findElement(By.id("login")).click();
		
		
		
		//Close the URL window
		driver.quit();
		
	}

}
