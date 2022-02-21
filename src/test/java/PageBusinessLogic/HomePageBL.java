package PageBusinessLogic;

import org.openqa.selenium.WebDriver;

import Common.PageRepofactory;

public class HomePageBL 
{

	
	public void selectInventory(WebDriver driver)
	{
		PageRepofactory.homePageRepo(driver).getInventory().click();	
	}
}
