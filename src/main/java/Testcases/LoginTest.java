package Testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.LoginPom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {


		// Browser Open 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Implicit wait ---> apply all WebElement ---> gloabally applay
		// once 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		

		// 
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getEmail().sendKeys("Test");
		login.getPassword().sendKeys("1234567");
		login.getLoginbtn().click();
		

		// Explicit wait --> apply perticular webelement
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(login.getLoginbtn())).click();
		
		
		ApplyExplicitWait_elementToBeClickable(driver,5,login.getLoginbtn());
		
		ApplyExplicitWait_elementToBeClickable(driver,2,login.getLoginbtn());
		
		
	}
	
	public static void ApplyExplicitWait_elementToBeClickable(WebDriver driver,int time,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	
	

}
