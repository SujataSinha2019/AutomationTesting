import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.salesforce.com");
		driver.findElement(By.cssSelector("a[class*='dropdown-toggle disabled']")).click();
		
		
		//Logging in
		WebDriverWait wait = new WebDriverWait(driver, 60);// 1 minute
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='username']")));
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("sujata");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='error']")));
		System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());
		
		
		//Forgot password
		driver.findElement(By.cssSelector("a[class*='fl small']")).click();
		driver.findElement(By.xpath("//*[@id='un']")).sendKeys("sujata");
		driver.findElement(By.id("continue")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='forgotPassForm']/div[1]/div")).getText());
		driver.findElement(By.xpath("//*[@id='forgotPassForm']/div[1]/a")).click();
		
		//Use custom domain
		driver.findElement(By.xpath("//*[@id='mydomainLink']")).click();
		driver.findElement(By.xpath("//*[@id='mydomain']")).sendKeys("sujata");
		driver.findElement(By.xpath("//*[@id='mydomainContinue']")).click();
		driver.findElement(By.xpath("//*[@id='hint_back_domain']")).click();
		
		System.out.println("At this point");
		
		driver.quit();
	}

}
