import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-workspace\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		 driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		 System.out.println(driver.switchTo().alert().getText());
		 Thread.sleep(3000);
		 driver.switchTo().alert().sendKeys("fydgfyge");//to enter text in edit box;
		 driver.switchTo().alert().accept();//to accept the alert
		// driver.switchTo().alert().dismiss();// to dismiss the alert
		 
	}

}
