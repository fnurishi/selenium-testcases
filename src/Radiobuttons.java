import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-workspace\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.echoecho.com/toolcustomforms.htm");
		 //driver.findElement(By.xpath("//input[@value='dotted']")).click();
		 
		 driver.findElements(By.xpath("//input[@name='bordertype']")).size();
		 System.out.println(driver.findElements(By.xpath("//input[@name='bordertype']")).size());
		 int count = driver.findElements(By.xpath("//input[@name='bordertype']")).size();
		 for (int i=0;i<count;i++)
		 {
			driver.findElements(By.xpath("//input[@name='bordertype']")).get(i);
		 }

	}
}
