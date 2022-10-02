package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	
	// All WebElement login --> LoginPom
	
	@FindBy(how=How.XPATH,using="xpath expression")
	private WebElement email;

	@FindBy(how=How.XPATH,using="xpath expression")
	@CacheLookup
	private WebElement password;

	@FindBy(how=How.XPATH,using="xpath expression")
	private WebElement loginbtn;

	
	public WebElement getEmail() {
		return email;
	}

	
	public WebElement getPassword() {
		return password;
	}

	
	public WebElement getLoginbtn() {
		return loginbtn;
	}

	
	
	

}
