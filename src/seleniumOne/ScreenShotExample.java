package seleniumOne;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenShotExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		Thread.sleep(2000);
		////input[@id='benzradio']
		WebElement rb=driver.findElement(By.id("benzradio"));
		
		System.out.println(rb.isSelected());
		rb.click();
		System.out.println(rb.isSelected());
		screenShot(driver);
		Thread.sleep(2000);
		
		System.out.println(rb.getAriaRole());
		//System.out.println(rb.getDomProperty("benzradio"));
		
		WebElement ch=driver.findElement(By.id("hondacheck"));
		System.out.println(" Before click of check box");
		System.out.println(ch.isSelected());
		System.out.println(ch.isEnabled());
		System.out.println(ch.isDisplayed());
		
		ch.click();
		screenShot(driver);

	}
	
	public static  void screenShot(WebDriver driver) throws Exception
	{
	Date d=new Date();
	SimpleDateFormat sf=new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss");
	String currentDate =sf.format(d);	
	
	File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("F:\\Sada_Jan29012022\\ScreenShots\\Image_"+currentDate+".jpg");
	FileHandler.copy(source, dest);
	
	}
 public static void wait(WebDriver driver)
 {
	// WebDriverWait ad=new WebDriverWait(driver, Duration.ofSeconds(15)).until((ExpectedCondition<Boolean>) wd -> ((JavaScriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
 }
 
 
 
 
 
 
 
 
}
