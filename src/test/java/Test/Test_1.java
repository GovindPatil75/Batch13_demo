package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_1 {

	public static void main(String[] args) throws InterruptedException {
		
	// Chrome ---FB login Url
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000); // 3 sec
		driver.close();
		
	// Edge --FB login Url
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver1=new EdgeDriver();
		driver1.get("https://www.facebook.com/");
		driver1.manage().window().maximize();
		Thread.sleep(3000); 
		driver1.close();
		
		
		
		
	}

}
