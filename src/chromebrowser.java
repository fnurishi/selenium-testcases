

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {
	 static WebDriver driver = new ChromeDriver();

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\eclipse-workspace\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://facebook.com");
		 /*driver.findElement(By.id("email")).sendKeys("this is my first code.");
		 driver.findElement(By.name("pass")).sendKeys("123456");
		 driver.findElement(By.linkText("Forgot account?")).click();*/
		 //driver.findElement(By.className("inputtext")).sendKeys("hello");
		 driver.findElement(By.className("inputtext")).sendKeys("helloworld");
		 
		 //driver.getCurrentUrl();

	}

}
