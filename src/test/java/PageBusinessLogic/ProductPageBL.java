package PageBusinessLogic;

import org.openqa.selenium.WebDriver;

import Common.PageRepofactory;

public class ProductPageBL 
{

	
	public void createProduct(WebDriver driver,String productname)
	{
	  
		PageRepofactory.ProductPageRepo(driver).getProducts().click();
		PageRepofactory.ProductPageRepo(driver).getListProducts().click();
		PageRepofactory.ProductPageRepo(driver).getCreate().click();
		PageRepofactory.ProductPageRepo(driver).getproductName().sendKeys(productname);
		PageRepofactory.ProductPageRepo(driver).getupdateQuantity().click();
		PageRepofactory.ProductPageRepo(driver).getcreateQuantity().click();
		PageRepofactory.ProductPageRepo(driver).getinvntQuantity().clear();
		PageRepofactory.ProductPageRepo(driver).getinvntQuantity().sendKeys("12");
		PageRepofactory.ProductPageRepo(driver).getsaveBtn().click();	
	}
}
