package seleniumOne;

import java.awt.RenderingHints.Key;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExcelExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		login(driver);
		
		WebElement ele1=waitForLoad(driver,"//input[@type='text']");
		FileInputStream file =new FileInputStream("F:\\Sada_Jan29012022\\Notes\\Products.xlsx");
		
		
				
		//		WorkbookFactory.create(file2).getSheet("savesoil");
		Workbook wbook =WorkbookFactory.create(file);
		Sheet sheet=wbook.getSheet("savesoil");
		
		for(int i=0;i<4;i++)
		{
			//reading value from cell
			String data="";
			try
			{
		data=sheet.getRow(i).getCell(0).getStringCellValue();
			}
			catch(Exception e)
			{
				data=String.valueOf(sheet.getRow(i).getCell(0).getNumericCellValue());
				}
		ele1.sendKeys(data);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(5000);
		WebElement price;
		if(i<3)
		{
			price=waitForLoad(driver,"//div[@class='_30jeq3 _1_WHN1']");
		}
		else
		{////div[@class='_30jeq3']
			price=waitForLoad(driver,"//div[@class='_30jeq3']");
		}
		System.out.println(price.getText());
		//sheet.getRow
		//write in row .
		sheet.getRow(i).createCell(1).setCellValue(price.getText());
		for(int c=0;c<data.length();c++)
		{
			ele1.sendKeys(Keys.BACK_SPACE);
		}
		}
		file.close();
		FileOutputStream file2=new FileOutputStream("F:\\Sada_Jan29012022\\Notes\\Products.xlsx");
		wbook.write(file2);
		
		
		
	
		System.out.println("Completed ");
	
	}
	
	
	static WebElement waitForLoad(WebDriver driver,String abc) {
		WebElement ele = null;
		try {
		System.out.println("In wait method");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		 ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(abc)));
		}catch (Exception e)
		{e.printStackTrace();}
		return ele;
	}
	
	
	
	
static void login(WebDriver driver) throws Exception
{
		
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("akshaynarhare1541@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Akshay123");
	driver.findElement(By.xpath("(//span[text()= 'Login' ])[2]")).submit();
	
	Thread.sleep(4000);
	
}
}
