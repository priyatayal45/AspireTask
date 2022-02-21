package PageRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManufacturingPageRepo 
{

	
	@FindBy(xpath="//div[text()='Manufacturing']//parent :: a")
	private WebElement mftBtn;
	
	@FindBy(xpath="//button[@data-original-title=\"Create record\"]")
	private WebElement mftCreate;
	
	@FindBy(xpath="//tbody/tr[5]/td[2]//input")
	private WebElement producttxtbox;
	
	@FindBy(xpath="//span[text()='Confirm']//parent :: button")
	private WebElement confirmBtn;
	
	
	@FindBy(xpath="//div[@class=\"o_statusbar_buttons\"]//button[4]")
	private WebElement markasdoneBtn;

	
	@FindBy(xpath="//span[text()='Ok']//parent :: button")
	private WebElement okBtn;
	
	@FindBy(xpath="//span[text()='Apply']//parent :: button")
	private WebElement applyBtn;
	
	@FindBy(xpath="//span[@name ='name']")
	private WebElement ref;
	
	@FindBy(xpath="//a[text()='Manufacturing Orders']")
	private WebElement back;
	
	@FindBy(xpath="//tbody/tr[1]//span[@name=\"state\"]")
	private WebElement status;
	
	@FindBy(xpath="//input[@title=\"Search for records\"]")
	private WebElement searchBox;
	
	@FindBy(xpath="//i[@title='Remove']")
	private WebElement removeBtn;
	
	@FindBy(xpath="//tbody/tr[1]//td[@name=\"name\"]")
	private WebElement name;
	
	
	
	public WebElement getMftBtn()
	{
		
		return this.mftBtn;
	}
	public WebElement getmftCreate()
	{
		
		return this.mftCreate;
	}
	
	public WebElement getproducttxtbox()
	{
		
		return this.producttxtbox;
	}
	
	public WebElement getconfirmBtn()
	{
		
		return this.confirmBtn;
	}
	
	public WebElement getmarkasdoneBtn()
	{
		return this.markasdoneBtn;
	}
	
	public WebElement getokBtn()
	{
		return this.okBtn;
	}
	
	public WebElement getapplyBtn()
	{
		return this.applyBtn;
	}
	

	public WebElement getback()
	{
		return this.back;
	}
	
	public WebElement getref()
	{
		return this.ref;
	}
	
	public WebElement getStatus()
	{
		return this.status;
	}
	public WebElement getSearchBox()
	{
		return this.searchBox;
	}
	
	public WebElement getremoveBtn()
	{
		return this.removeBtn;
	}
	public WebElement getname()
	{
		return this.name;
	}
	
}
