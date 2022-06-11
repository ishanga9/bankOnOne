package seleniumOne;

import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenum {
public static void main(String[] args) throws InterruptedException {
//	System.setProperty("webdriver.chrome.driver","F:\\Sada_Jan29012022\\selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com");
String source=driver.getCurrentUrl();
System.out.println(driver.getTitle());
System.out.println(source);
//<input id="input" type="search" autocomplete="off" spellcheck="false" role="combobox" placeholder="Search Google or type a URL" aria-live="polite">
String abd="/html/body/div[2]/div/div/div/div/div[2]/div/form/*";
//List<WebElement> ele=driver.findElements(By.xpath(abd));
//System.out.println(ele);

//foreach(WebElement k: ele.forEach(null))
 String un="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input";
String pw ="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input";
String submit="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button";
WebElement ele=driver.findElement(By.xpath(un));
ele.sendKeys("Hello23@abc.com");
ele=driver.findElement(By.xpath(pw));
ele.sendKeys("Abc@123e");
ele=driver.findElement(By.xpath(submit));
Thread.sleep(3000);
ele.submit();
//ele.submit();
//<input autocomplete="off" type="text" class="_2IX_2- _2LYh3d VJZDxU" value="">

}
}
