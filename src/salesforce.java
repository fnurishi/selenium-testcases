
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {
	// static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("Hello");
		driver.findElement(By.id("password")).sendKeys("123456");
		// driver.findElement(By.className("button r4 wide primary")).click();//erorr
		// becoz classname attribute should not have spaces in name
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		// driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
		// driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("1543598");
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());

	}

}
