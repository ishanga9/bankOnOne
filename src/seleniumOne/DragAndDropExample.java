package seleniumOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) throws Exception {
		
		//System.setProperty("webdriver.chrome.driver", "chrome exe path in your system");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		Actions ds=new Actions(driver);
	//id gallery
		Thread.sleep(3000);
		////ul[@id='gallery']/li
		WebElement dest=driver.findElement(By.id("trash"));
		List<WebElement> li=driver.findElements(By.xpath("//ul[@id='gallery']/li"));
		for(WebElement k : li)
		{
			
			System.out.println(k.getText());
			ds.dragAndDrop(k, dest).perform();
			Thread.sleep(3000);
		}
	
	
	
	
	}

}
