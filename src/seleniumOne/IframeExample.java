package seleniumOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//WebElement we =driver.findElement(By.id("frame1"));
		driver.switchTo().frame("frame1");
		WebElement we =driver.findElement(By.xpath("//body[contains(text(),'Parent frame')]"));
		System.out.println(we.getText());
		
		WebElement childFrame=driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(childFrame);

		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Child')]")).getText());
		driver.switchTo().parentFrame();
		System.out.println("Switched to parent frame using parent frame method.");
		System.out.println(we.getText());
		driver.switchTo().defaultContent();
		WebElement stext=driver.findElement(By.xpath("//div[contains(text(),'Sample Nested')]"));
		System.out.println(stext.getText());
	}

}
