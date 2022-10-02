package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_login_id {

	public static void main(String[] args) {

//
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Visionfolder\\Demo_Selenium\\Drivers\\chromedriver_win32 (6)\\chromedriver.exe");
	//WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	// WebElement ---locator Id
	
	String title=driver.getTitle();
	System.out.println(title);
	
	String url=driver.getCurrentUrl();
	System.out.println(url);

	WebElement txt_email=driver.findElement(By.id("email"));
	txt_email.sendKeys("123456789");
	
	
	WebElement txt_password=driver.findElement(By.id("pass"));
	txt_password.sendKeys("abc123@%");
	
	WebElement btn_login=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
	btn_login.click();
	
	}

}
