package PageRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPageRepo 

{

	@FindBy(xpath="//button[@title=\"Products\"]")
	private WebElement Products;
	

	@FindBy(xpath="//a[text()=\"Products\"]")
	private WebElement ListProducts;
	
	@FindBy(xpath="//button[@title=\"Create record\"]")
	private WebElement Create;
	
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement productName;
	
	@FindBy(xpath="//span[text()='Update Quantity']//parent :: button")
	private WebElement updateQuantity;

	@FindBy(xpath="//button[@data-original-title=\"Create record\"]")
	private WebElement createQuantity;
	
	@FindBy(xpath="//tbody/tr[1]/td/input[@name=\"inventory_quantity\"]")
	private WebElement invntQuantity;
	
	@FindBy(xpath="//button[@title=\"Save record\"]")
	private WebElement saveBtn;

	@FindBy(xpath="//a[@aria-label=\"Home menu\"]")
	private WebElement homebtn;
	
	
	public WebElement getProducts()
	{
		
		return this.Products;
	}
	
	public WebElement getListProducts()
	{
		
		return this.ListProducts;
	}
	
	public WebElement getCreate()
	{
		
		return this.Create;
	}
	public WebElement getproductName()
	{
		
		return this.productName;
	}
	
	public WebElement getupdateQuantity()
	{
		
		return this.updateQuantity;
	}
	
	
	public WebElement getcreateQuantity()
	{
		
		return this.createQuantity;
	}
	
	public WebElement  getinvntQuantity()
	{
		return this.invntQuantity;
		
	}
	
	public WebElement getsaveBtn ()
	{
		return this.saveBtn;
		
	}
	
	public WebElement gethomebtn()
	
	{
		return this.homebtn;
		
		
	}
}

