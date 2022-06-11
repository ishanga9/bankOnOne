package seleniumOne;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseMethodExample {
public static int i;
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
//		DesiredCapabilities dc = new DesiredCapabilities();
//		dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);

		//@SuppressWarnings("deprecation")
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
//		//screenShot(driver);//1
//////div[text()='24x7 Customer Care']
//		
		//driver.
		Actions act=new Actions(driver);
//		Thread.sleep(3000);
//		act.moveToElement(driver.findElement(By.xpath("//div[text()='More']"))).perform();
//		//screenShot(driver);//2
//		Thread.sleep(3000);
//		act.moveToElement(driver.findElement(By.xpath("//div[text()='24x7 Customer Care']"))).click().build().perform();
//		Thread.sleep(3000);
//		System.out.println("Before screen shot 3");
//		screenShot(driver);//3
//		System.out.println("after screen shot 3");
//		driver.switchTo().newWindow(WindowType.TAB);
//		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		//driver.s
		 act=new Actions(driver);
		//double click
		////button[contains(text(),'Double-Click Me To See Alert')]
		
		WebElement wdc=driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
try {
	    System.out.println(" in start double click");
		act.doubleClick(wdc).click().build().perform();
		//System.out.println(" in after double click");
		Thread.sleep(1000);
		//screenShot(driver);//4
		System.out.println(" in double click");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1200));
	    wait.until(ExpectedConditions.alertIsPresent());
	    Thread.sleep(3000);
	    
		Alert al=driver.switchTo().alert();
		
		System.out.println("Double click alert "+al.getText());
		screenshotReomte();
		al.accept();
		
		//Thread.sleep(1000);
		//5
		
}
catch(Exception f)
	{
	
	f.printStackTrace();
	}
		Thread.sleep(3000);

	//right click -context click method of mouse
		
		
		//
		WebElement we=driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(we).perform();
		screenShot(driver);//4
		Thread.sleep(3000);
		String tw=driver.getWindowHandle();
		WebElement w1=driver.findElement(By.xpath("//span[text()='Cut']"));
	
		try
		{
			act.moveToElement(w1).click().build().perform();
			
			Alert al=driver.switchTo().alert();
			System.out.println("Alert text for Cut"+al.getText());
			
			
			screenshotReomte();//5
			al.accept();
		
		}catch(Exception f)
		{
			//System.out.println(f);
			f.printStackTrace();
		}
		Thread.sleep(3000);
		driver=driver.switchTo().window(tw);
		//5
		Thread.sleep(3000);
		
		System.out.println("Completed ");
		
		
	}
	public static void screenShot(WebDriver driver) throws Exception
		{
			System.out.println(" in screen shot ");
		Date d =new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss");
		String cdate=sdf.format(d);
		
		try {
		//System.out.println(" in screen shot start ");
		File sr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//System.out.println(" in screen shot sou ");
		File dest=new File("F:\\Sada_Jan29012022\\ScreenShots\\MouseMethod_"+cdate+".jpg");
		//System.out.println(" in screen shot  des");
		FileHandler.copy(sr, dest);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		System.out.println(" in screen shot copy ");
		
	
}
	public static void screenshotReomte()
	{
		Date d =new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss");
		String cdate=sdf.format(d);
	
		try {Thread.sleep(2000);
			BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		    ImageIO.write(image, "jpg", new File("F:\\Sada_Jan29012022\\ScreenShots\\MouseMethod_"+cdate+".jpg"));
		  System.out.println("In remote");
		}
		catch(Exception f)
		{
			f.printStackTrace();
		}
	}
}









