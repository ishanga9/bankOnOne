package seleniumOne;

import java.time.Duration;
//import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DateExmplae {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
////input[@id='datePickerMonthYearInput']
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/date-picker");	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).click();
		
		Thread.sleep(2000);
		
		Select se=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		
			System.out.println(se.getFirstSelectedOption());
			se.selectByIndex(0);
			
		Select year=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
		year.selectByValue("2020");
		
		//=new ArrayList<>();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		List<WebElement> week=wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//div[@class='react-datepicker__week']/div"))));
		for(WebElement k:week)
		{
			try
			{
			if(k.getText().equals("9"))
			{
				k.click();
			}}
			catch(Exception d)
			{}
		}
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demoqa.com/slider");
		
		WebElement sli=driver.findElement(By.xpath("//input[@type='range']"));
		Actions act=new Actions(driver);
		act.moveToElement(sli, -10, 0).click().build().perform();
		//act.clickAndHold().
		////input[@type='range']
		
		
	}

}
