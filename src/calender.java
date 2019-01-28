import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-workspace\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://spicejet.com");
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			driver.findElement(By.xpath("//a[@value='BLR']")).click();
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA'][contains(text(),'Chennai (MAA)')]")).click();
			
			//System.out.println(driver.findElement(By.id("#ctl00_mainContent_view_date2")).isEnabled());
			//driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
			//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
			//System.out.println(driver.findElement(By.id("#ctl00_mainContent_view_date2")).isEnabled());
			//driver.findElement(By.id("#ctl00_mainContent_view_date2")).isEnabled();
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));//before clicking value 
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));//after clicking round trip btn value
			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			{
				System.out.print("It Is enabled");
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
	}
	}


