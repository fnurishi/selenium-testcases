import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesForceE2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\eclipse-workspace\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://rediff.com");
		 driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("welcome");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("34569878");
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
	}

}
