package selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php#");
		//rows  
		List<WebElement> rowList=driver.findElements(By.xpath("//table/tbody/tr"));
		
		//columns  //table/thead/tr/th
	
		List<WebElement> colList=driver.findElements(By.xpath("//table/thead/tr/th"));
		
		System.out.println("Rows in dynamic table are    :"+rowList.size());
		System.out.println("Columns in dynamic table are :"+colList.size());
		
		System.out.println(rowList.get(0).getText());
		
		////table/tbody/tr/td/font[contains(text(),'+   2.7')]/parent::td/parent::tr
		
		
		//finding rowvalues depending upon %change
		for(int i=3;i<7;i++)
		{
			for(int j=0;j<9;j++)
			{
			try {
			//System.out.println(i);
	System.out.println(driver.findElement(By.xpath("//table/tbody/tr/td/font[contains(text(),'+   "+i+"."+j+"')]/parent::td/parent::tr")).getText());
		}
			catch(Exception e)
			{
			
			}
			}
		}
	}

}
