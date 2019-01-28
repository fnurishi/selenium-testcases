import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//css=== tagname[attribute='value']
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-workspace\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://login.salesforce.com");
		 driver.findElement(By.cssSelector("input[id='username']")).sendKeys("csspath");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("pafdggg");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
}
