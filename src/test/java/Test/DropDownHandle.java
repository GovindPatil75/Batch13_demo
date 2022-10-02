package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) {


		// Browser Open
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		// drop Handle ---> WebElement ---> identify 
		
		WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));

		Select sel=new Select(drp_country);
		
		// select --3 methods 
		
//		sel.selectByIndex(3);
//		
//		sel.selectByValue("ARUBA");
//		
//		sel.selectByVisibleText("AUSTRALIA");
//		
		
		// drop down handle without using select class methods 
		
		List<WebElement> list=sel.getOptions();
		
		// print count of drop down option
		
		System.out.println(list.size()); // 264 
		
//		for(int i=0;i<list.size();i++) {
//		
//		System.out.println(list.get(i).getText());
//		
//		if(list.get(i).getText().equals("INDIA")) {
//			list.get(i).click();
//			break;
//		}
//		
//		}
		
		
		System.out.println(sel.getFirstSelectedOption().getText());
		
		handleDropdown(drp_country,"INDIA");
		handleDropdown(drp_country,"BAHAMAS");
		
		//WebElement drp_city;
		
		//handleDropdown(drp_city,"Pune");
		
		
	}

	// genric methods 
	public static void handleDropdown(WebElement element,String text) {
		
		Select select=new Select(element);
		select.selectByVisibleText(text);
		
	}
	
	
	
}
