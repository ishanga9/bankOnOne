package seleniumOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WEMehtods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		Thread.sleep(2000);
		////input[@id='benzradio']
		WebElement rb=driver.findElement(By.id("benzradio"));
		
		System.out.println(rb.isSelected());
		rb.click();
		System.out.println(rb.isSelected());
		
		Thread.sleep(2000);
		
		System.out.println(rb.getAriaRole());
		//System.out.println(rb.getDomProperty("benzradio"));
		
		WebElement ch=driver.findElement(By.id("hondacheck"));
		System.out.println(" Befor click of check box");
		System.out.println(ch.isSelected());
		System.out.println(ch.isEnabled());
		System.out.println(ch.isDisplayed());
		
		ch.click();
		System.out.println("After clik on check box");
		System.out.println(ch.isSelected());
		
		// hide text box xpath
		////input[@id="hide-textbox"]
		
		System.out.println(" TO display method");
		//need to check for displayed
		WebElement htb=driver.findElement(By.id("hide-textbox"));
		//displayed-text
		WebElement htext=driver.findElement(By.id("displayed-text"));
		System.out.println(htext.isDisplayed());
		htb.click();
		Thread.sleep(2000);
		System.out.println(htext.isDisplayed());
		
		WebElement sbox=driver.findElement(By.id("show-textbox"));
		
		sbox.click();
		Thread.sleep(2000);
		System.out.println(htext.isDisplayed());
		
		
		System.out.println(" IS enabled test");
		
		WebElement eText=driver.findElement(By.id("enabled-example-input"));
		
		WebElement eb=driver.findElement(By.id("enabled-button"));
		WebElement db=driver.findElement(By.id("disabled-button"));
		Thread.sleep(2000);
		System.out.println(" First status "+eText.isEnabled());Thread.sleep(2000);
		db.click();
		System.out.println(" After click of disabled button "+eText.isEnabled());
		Thread.sleep(2000);
		eb.click();
		System.out.println(" After click of enabled button "+eText.isEnabled());
		
		Thread.sleep(2000);
		System.out.println(" Select list example");
		// 
		WebElement sel=driver.findElement(By.xpath("//select[@id='carselect']"));
		
		Select sele=new Select(sel);
		
		List<WebElement> li=sele.getOptions();
		
		for(WebElement w: li)
		{
			
			System.out.println(w.getTagName() + "  "+w.getText());
			Thread.sleep(2000);
			w.click();
		}
		
		try {
		
		Thread.sleep(2000);
		//driver.close();
		}
		catch(Throwable e)
		{}

	}

}
