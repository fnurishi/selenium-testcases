import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-workspace\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://makemytrip.com");
		 WebElement source = driver.findElement(By.id("hp-widget__sfrom"));
		 source.clear();
		 source.sendKeys("Mum");
		 Thread.sleep(2000);
		 source.sendKeys(Keys.ENTER);
		// driver.findElement(By.id("hp-widget__sfrom")).clear();
		 //driver.findElement(By.id("hp-widget__sfrom")).sendKeys("Mum");
		 //Thread.sleep(2000);
		 //driver.findElement(By.id("hp-widget__sfrom")).sendKeys(Keys.ENTER);
		 WebElement source1 = driver.findElement(By.id("hp-widget__sTo"));
		 source1.clear();
		 source1.sendKeys("DEL");
		 Thread.sleep(2000);
		 source1.sendKeys(Keys.ARROW_DOWN);
		 source1.sendKeys(Keys.ENTER);
		 

		 
	}

}
