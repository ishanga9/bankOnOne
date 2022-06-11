package seleniumOne;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationPopup {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://redbus.in");
		//Thread.sleep(000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@id='signin-block']")).click();
		
		driver.findElement(By.xpath("//li[@id='signInLink']")).click();
		//Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='modalIframe']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'gsi')]")));
		
		
		/////span[@id='button-label']//span[@id='button-label']
		driver.findElement(By.xpath("//span[contains(text(),'Sign in with Google')]")).click();
		Thread.sleep(2000);
		List<String> add=new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(add.get(1));
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("akshaynarhare1541@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
		
		////input[@type='email']
	}

}
