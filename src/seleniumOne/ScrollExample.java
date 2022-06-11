package seleniumOne;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//WebElement conua=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		js.executeScript("arguments[0].value = 'hello@abc.com';", driver.findElement(By.xpath("(//input[@type='text'])[2]")));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500)");
		
		Dimension d=new Dimension(500,500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(1000,-500)");
		Point p=new Point(100,360);
		driver.manage().window().setPosition(p);
		System.out.println("Completed : scrollBy() ");
		driver.manage().window().maximize();
		WebElement con=driver.findElement(By.xpath("//a[text()='Contact Us']"));
		
		js.executeScript("arguments[0].scrollIntoView(true);",con);
		Thread.sleep(2000);
		con.click();
		
		con=driver.findElement(By.xpath("//a[text()='Login']"));
		
		js.executeScript("arguments[0].click();",con);
		Thread.sleep(4000);
		
		js.executeScript("arguments[0].value='hello@abc.com'", driver.findElement(By.xpath("(//input[@type='text'])[1]")));
		
		System.out.println("Javascript");
		
	
		
		
		
		
		
	}

}
