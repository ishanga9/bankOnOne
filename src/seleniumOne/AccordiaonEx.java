package seleniumOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AccordiaonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//id="section2Heading"
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/accordian");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//id="section2Heading"
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@id='section2Heading']"))).click().build().perform();
		
	}

}
