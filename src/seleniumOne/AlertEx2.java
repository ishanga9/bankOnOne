package seleniumOne;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertEx2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//button[@id='alertButton']
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		Alert alt=driver.switchTo().alert();
		
		alt.accept();
		Thread.sleep(7000);
		//button[@id='timerAlertButton']
		WebElement el=waitMethod(driver,"//button[@id='timerAlertButton']");
		el.click();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		alt=driver.switchTo().alert();
		alt.accept();
		//Confirm alert
		//button[@id='confirmButton']
		el=waitMethod(driver,"//button[@id='confirmButton']");
		Thread.sleep(7000);
		el.click();
		alt=driver.switchTo().alert();
		alt.dismiss();
		//alt.accept();
		//message //button[@id='promtButton']
		el=waitMethod(driver,"//button[@id='promtButton']");
		//el.sendKeys(args)
		el.click();
		alt=driver.switchTo().alert();
		Thread.sleep(7000);
		alt.sendKeys("Hello my alert");
		//Thread.sleep(5000);
		alt.accept();
		
	}

	
static	WebElement waitMethod(WebDriver driver,String abc)
{
	WebElement ele=null;

	try
	{
	
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(abc)));
		
		
		
	}
	catch(Exception e)
	{}
	
	return ele;
}







}
