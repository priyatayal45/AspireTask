package PageBusinessLogic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import Common.PageRepofactory;

public class LoginPageBL 
{

	public void login(WebDriver driver) throws IOException
	{
		PageRepofactory.loginpagerepo(driver).getUsername().sendKeys(BaseClass.configreader("Username"));
		PageRepofactory.loginpagerepo(driver).getPassword().sendKeys(BaseClass.configreader("Password"));
		PageRepofactory.loginpagerepo(driver).getLgnBtn().click();
	}
	
	
	
}
