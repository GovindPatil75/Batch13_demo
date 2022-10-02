package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo {

	public static void main(String[] args) {

// Browser Open
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Identify --WebElement ----> Absolute XPtah ---> Navigate parent to immidiate -- /
		
		WebElement txt_email=driver.findElement(By.xpath("/html/body/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		txt_email.sendKeys("Test");
		
		// Identify --> Relative ---> copy ---> 
		WebElement txt_password=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		txt_password.sendKeys("12345678");
		
		
		WebElement btn_login=driver.findElement(By.xpath("//*[@id=\"u_0_5_TX\"]"));
		btn_login.click();
		
		
		
	}

}
