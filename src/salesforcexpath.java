import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforcexpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://login.salesforce.com");

		// //tagname[@attribute='value'] ==== syntax for custmoising xpath
		// driver.findElement(By.xpath("//*[@type='email']")).sendKeys("My own Xpath");
		// driver.findElement(By.xpath("//*[@name='pw']")).sendKeys("234367");
		// driver.findElement(By.xpath("//*[@value='Log In']")).click();

		// tagname[attribute='value']= syntax for customising css tagname can be skipped
		// in css. no need of * too
		// tagName#id ====== another syntax for css only if you have id
		// tagname.classname====== another syntax for css only if you have classname
		driver.findElement(By.cssSelector("*[type='email']")).sendKeys("my own css selector");
		driver.findElement(By.cssSelector("*[name='pw']")).sendKeys("73674593");
		driver.findElement(By.cssSelector("[value='Log In']")).click();

	}

}
