package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_2 {

	public static void main(String[] args) throws Exception {

// Browser Open
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		
		// Need to identify WebElement ---> Locators ---> Name
		
		WebElement txt_email=driver.findElement(By.name("email"));
		txt_email.sendKeys("Test@gmail.com");
		
		
		WebElement txt_password=driver.findElement(By.name("pass"));
		txt_password.sendKeys("123456789");
		
		WebElement btn_login=driver.findElement(By.name("login"));
		btn_login.click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		
//		driver.navigate().to("https://mvnrepository.com/");
//		
//		Thread.sleep(3000);// 3 sec
//		driver.navigate().back();
//		
//		Thread.sleep(3000);// 3 sec
//		driver.navigate().forward();
//		
//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		
		//driver.close(); // Current window 

	}

}
