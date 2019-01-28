import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablesxercies {

	public static void main(String[] args) {
		int sum=0;
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20784/nz-vs-ind-2nd-odi-india-tour-of-new-zealand-2019");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));

		int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		 System.out.println(rowcount);
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		 System.out.println(count);
		for(int i=0;i<count-2;i++) {

			String value=(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
			int valueInteger= Integer.parseInt(value);
			sum= sum+valueInteger;
			
		}
		//System.out.println(sum);
		String Extras=(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		int extrasValue=Integer.parseInt(Extras);
		int totalSum = sum+extrasValue;
		System.out.println(totalSum);
		String actualTotal=(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
		int actualTotalValue=Integer.parseInt(actualTotal);
		if(actualTotalValue==totalSum)
		{
			System.out.println("Count Matches");
		}
		
	}

}	
