
package seleniumOne;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YoutubeExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		WebElement we=driver.findElement(By.xpath("//input[@id='search']"));
		we.sendKeys("sadgurur home coming");
		we.click();
		Thread.sleep(3000);
		WebElement wbutton=driver.findElement(By.xpath("//form[@id='search-form']"));
		System.out.println(wbutton.isEnabled());
		wbutton.submit();
		
		Thread.sleep(5000);
		wait(driver,"(//a[@id='thumbnail'])[2]");
		
		WebElement wt=driver.findElement(By.xpath("(//a[@id='thumbnail'])[2]"));
		//
		int i=0;
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click();", wt);
		//System.out.println(wt.getAttribute("href"));
		//wt.click();
		//Skip Ad   //div[@id='ad-text:1d']
		System.out.println("  //div[@id='ad-text:1d'] skip add");
		
		Thread.sleep(3000);
		try
		{
			//ytp-ad-text ytp-ad-skip-button-text
			//div[@id='ad-text:1d']
			//div[@class='ytp-ad-text ytp-ad-skip-button-text']
			WebElement wskipad= wait(driver,"//div[@class='ytp-ad-text ytp-ad-skip-button-text']");
			
			//
					//driver.findElement(By.xpath("//div[@id='ad-text:1d']"));
		Thread.sleep(6000);

		ex.executeScript("arguments[0].click();", wskipad);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//driver.close();
		System.out.println("At the end");
	}
public static WebElement wait(WebDriver driver,String abc)
{
	System.out.println("Start of "+abc);
	WebDriverWait dw=new WebDriverWait(driver,Duration.ofSeconds(120));
	WebElement ele =dw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(abc)));
	System.out.println("End of the "+abc);
	   return ele;
}




}
