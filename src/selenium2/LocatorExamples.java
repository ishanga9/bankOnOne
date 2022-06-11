package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver","path");
		
		WebDriver driver=new ChromeDriver();
		driver.get("F:\\Sada_Jan29012022\\html\\Locator.html");
		
	List<WebElement> ele=	driver.findElements(By.tagName("input"));//.sendKeys("hello I am here");
		//driver.findElement(By.tagName("(input)[2]")).sendKeys("Who am I");
	ele.get(0).sendKeys("I am out here");
	ele.get(1).sendKeys("Ohh I dont know I am the password");
	
	driver.findElement(By.linkText("facebook")).click();
		
		
	}

}
