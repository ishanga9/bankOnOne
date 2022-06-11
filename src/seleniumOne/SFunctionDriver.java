package seleniumOne;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SFunctionDriver {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		try
		{
		System.setProperty("webdriver.chrome.driver","F:\\Sada_Jan29012022\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		System.out.println(driver.manage().window().getSize());
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		//driver.findElement(By.linkText("new window")).click();
	//Set se=driver.manage().getCookies();
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.google.com");
	
//	Iterator k=se.iterator();
//	while(k.hasNext())
//	{
//		System.out.println(k.next().toString());
//	}
	
	driver.manage().window().maximize();
	System.out.println(driver.manage().window().getSize());
	driver.navigate().back();
	
	Thread.sleep(3000);
//driver.close();
	
driver.quit();
		}
		catch(Exception e)
		{e.printStackTrace();
		}
	
}}
