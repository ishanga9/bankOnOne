package seleniumOne;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExaGoogleSearch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
////input[@type='text']
		ExaGoogleSearch eg=	new ExaGoogleSearch();//
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//input[@name='q']"));
		ele.sendKeys("Selenium FAQs");
		// submit (//input[@type='submit'])[3]
		driver.findElement(By.xpath("(//input[@type='submit'])[3]")).submit();
	///html/body/div[1]/div[4]/div[1]/div/a	
		
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.manage().deleteAllCookies();
		//flipkart -(//input[@type='text'])[2]
		driver.get("https://www.flipkart.com/");
		eg.waitForLoad(driver);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("7887688039");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Himank@yoga");
		driver.findElement(By.xpath("(//span[text()= 'Login' ])[2]")).submit();
		////*[@id="container"]/div/div[2]/div/div/div[3]/a/div[2]
		////div[text()='Mobiles']
		//Search Mobiles.
		//driver=addCookies(driver);
		Thread.sleep(4000);
		eg.waitForLoad(driver);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Samsung Mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		System.out.println("Completed ");
		Thread.sleep(4000);
		eg.waitForLoad(driver);
		//driver=addCookies(driver);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		WebElement ifr=driver.findElement(By.xpath("(//div[contains(text(),'SAMSUNG Galaxy F22')])[1]"));
		Thread.sleep(4000);
		ifr.click();
		eg.waitForLoad(driver);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println("(//div[contains(text(),'SAMSUNG Galaxy F22')])[1]");
		//driver=addCookies(driver);
		driver.manage().timeouts().pageLoadTimeout(1200, TimeUnit.SECONDS);
		//Thread.sleep(4000);
		//Set<String> windowhandle=driver.getWindowHandles();
		//System.out.println(windowhandle.toString());
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		wait.until(driver -> "complete".equals(((JavascriptExecutor) driver).executeScript("return document.readyState")));
//		wait.until(driver -> "complete".equals(((JavascriptExecutor) driver).executeScript("return document.readyState")));
	ArrayList<String> ab= new ArrayList<>(driver.getWindowHandles());
//		for(String k : ab) {
//			try {
			driver.switchTo().window(ab.get(1).toString());
	new ExaGoogleSearch().waitForLoad(driver);
	System.out.println(driver.getTitle());
	
		List<WebElement>	li=	driver.findElements(By.xpath("//div/ul/li"));
for(WebElement el: li)
{
	System.out.println(el.getTagName() +" :: "+el.getText());
	if(el.getText().contains("TO CART"))
	{
		el.click();
		break;
	}
}
//			}catch(Exception e)
//			{
//				e.printStackTrace();
//			}
//		}
//		
				}
	static WebDriver addCookies( WebDriver driver)
	{
		Set<Cookie> id=driver.manage().getCookies();
		driver.manage().deleteAllCookies();
		System.out.println(" Cookies");
		//driver.manage().
		//@SuppressWarnings("unchecked")
		//Iterator<Cookie> ite=id.iterator();
		for(Cookie e: id)
		{
			//System.out.println(e.getName() + " :: "+e.getValue() +" :: "+e.getExpiry());
			driver.manage().addCookie(e);
		}
		
		return driver;
	}
	void waitForLoad(WebDriver driver) {
		try {
		System.out.println("In wait method");
	    new WebDriverWait(driver, Duration.ofSeconds(1200)).until((ExpectedCondition<Boolean>) wd ->
	            ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	  //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),'BUY NOW')]")));
	}catch (Exception e)
		{e.printStackTrace();}
	}
	
}
