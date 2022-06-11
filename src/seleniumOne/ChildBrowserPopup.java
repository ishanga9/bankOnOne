package seleniumOne;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChildBrowserPopup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//eg.waitForLoad(driver);
		Thread.sleep(4000);
		driver.manage().window().maximize();
		//driver.manage().timeouts().wait(6000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7887688039");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Himank@yoga");
		driver.findElement(By.xpath("(//span[text()= 'Login' ])[2]")).submit();
			Thread.sleep(4000);
		//eg.waitForLoad(driver);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 12");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		System.out.println("Completed ");
		//Thread.sleep(7000);
		//eg.waitForLoad(driver);
		//driver=addCookies(driver);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		////div[@class='_2kHMtA'] list of webelement
		//Thread.sleep(7000);
		WebElement wd=new WebDriverWait(driver,Duration.ofSeconds(120)).until((driverc) -> driver.findElement(By.xpath("//a[@class='_1fQZEK']")));
		List<WebElement> webEleList=driver.findElements(By.xpath("//div[@class='_2kHMtA']"));
		Thread.sleep(2000);
		
		///
		webEleList.get(2).click();
		Thread.sleep(3000);
		webEleList.get(3).click();
		
		//get Window Handles
		Thread.sleep(2000);
		List<String> windowAddress=new ArrayList<>(driver.getWindowHandles());
		
	
	//switch to window 2 and add that Web Element to cart 	
		
		driver.switchTo().window(windowAddress.get(2));
		
		
		
		// add to cart WEle //button[contains(text(),'ADD TO CART')]
		Thread.sleep(7000);
		try {
		driver.findElement(By.xpath("//button[contains(text(),'GO TO CART')]")).click();
		}
		catch(Exception e)
		{
			try {
				
				////button[contains(text(),'ADD TO CART')]
				////         button[text()='ADD TO CART']
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			}
			catch(Exception f)
			{
				f.printStackTrace();
			}
			
			
		}
		System.out.println("Element added to cart");
	
	
	}

}
