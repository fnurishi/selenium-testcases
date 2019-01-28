import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncroniz {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.alaskaair.com/hotels/search?region=1&query=New%20York,%20NY,%20USA&latitude=40.7128&longitude=-74.0059&checkIn=02%2F13%2F2019&checkOut=02%2F14%2F2019&adults=2&rooms=1&currency=USD&program=mileageplan&mode=earn&searchId=549381a5-3257-4ebe-8dea-7885fb32156e&language=en");
		//driver.manage().timeouts().implicitlyWait(5, nano);
		driver.findElement(By.id("H-destination")).sendKeys("nyc");
		Thread.sleep(2000l);
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
		//WebDriverWait d = new WebDriverWait(driver,20);
		//d.until(d)
		driver.findElement(By.xpath("//div[@class='hotel-result-item.hotel-details']")).click();
		

	}

}
