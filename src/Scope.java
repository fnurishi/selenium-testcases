import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			System.setProperty("webdriver.chrome.driver", "C:\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		 //give the count of links on page
		System.out.println(driver.findElements(By.tagName("a")).size());
		// count of footer section
		WebElement footerdriver= driver.findElement(By.id("gf-BIG"));//limiting webdriver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//count of first coloumn link
		WebElement coloumndriver =footerdriver.findElement(By.xpath("//tr//td[1]//ul[1]"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		// click on each link and chk if they r opening
		for(int i=1; i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonTab);
		
		}// opens all the tabs and prints the title of child windows
				Set<String> abc = driver.getWindowHandles();
				Iterator<String> it = abc.iterator();
				while(it.hasNext())
				{
					driver.switchTo().window(it.next());
					System.out.println(driver.getTitle());
				}
			
			
		}
		
	}


