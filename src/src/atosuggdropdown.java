package src;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class atosuggdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web");
		driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys("BENG");
		driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.xpath("//*[@id='fromPlaceName']")).getText());
		
		//javascripit DOM can Exatract hidden elemnets
		//because selenium canaot identify hidden elements--(AJAX implementation )
		//investigate the properties of object if it had any  hidden text
		//javascripit executer
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script ="return document.getElementById(\"fromPlaceName\").value";
		String text= (String) js.executeScript(script);
		System.out.println(text);
		int i =0;
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT"))
				{
			i++;
				driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
				//script =" return document.getElementById(\"fromPlaceName\").value";
				 text=(String) js.executeScript(script);
				 System.out.println(text);
			if (i>10)
			{
				break;
			}
			if (i>10)
			{
				System.out.println("ELement not found");
			}
			else
			{
				System.out.println("element found");
			}
				}
		
		
		

		
	}	

}
