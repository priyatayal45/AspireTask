package PageRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageRepo
{

	@FindBy(xpath="//div[text()='Inventory']//parent :: a")
	private WebElement inventory;
	
	
	public WebElement getInventory()
	{
		
		return this.inventory;
	}
	
	
	
}
