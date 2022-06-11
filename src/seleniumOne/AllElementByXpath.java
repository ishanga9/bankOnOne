package seleniumOne;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllElementByXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Sada_Jan29012022\\selenium\\chromedriver.exe");
		
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
List<WebElement> list=driver.findElements(By.xpath("//a"));
//foreach(WebElement wl:list)
Iterator<WebElement> it =list.iterator();
while(it.hasNext())
	System.out.println(it.next().getText());

	}

}
