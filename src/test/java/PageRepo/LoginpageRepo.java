package PageRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginpageRepo 

{

	@FindBy(xpath="//input[@name ='login']")
	private WebElement Username ;
	
	@FindBy(xpath="//input[@name ='password']")
	private WebElement password ;
	
	
	@FindBy(xpath="//button[text()=\"Log in\"]")
	private WebElement lgnBtn ;
	
	public  WebElement getUsername ()
	{
		return this.Username;
	}
	
	public  WebElement getPassword ()
	{
		return this.password;	
	}
	public  WebElement getLgnBtn ()
	{
		return this.lgnBtn;	
	}
	
	
}
