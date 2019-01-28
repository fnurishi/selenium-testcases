import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		//selenium code
		
		//create driver object
		//invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());//validate if your page title is correct
		System.out.println(driver.getCurrentUrl());// valoidate if you are landed on current url(redirection)
		//System.out.println(driver.getPageSource());// print the page source code
		driver.get("http://yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();//closes the current browser
		driver.quit();//closes all teh browsers opened by selenium script
	}
	

}
