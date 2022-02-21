package Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import Common.BusinessLogicFactory;
import Common.PageRepofactory;

public class Test1 extends BaseClass

{
	WebDriver driver;

	@Test(priority =0)
	public void logintest() throws IOException
	{
		this.driver=BaseClass.driverSetUp();
		driver.get(BaseClass.configreader("Url"));
		driver.manage().window().maximize();
		BusinessLogicFactory.loginpagebl().login(driver);
	}
	
	@Test(priority =1)
	public void selectinvnttest()
	{
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		BusinessLogicFactory.homepagebl().selectInventory(driver);
	}
	
	@Test(priority =2)
	public void createprdtest()
	{
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		BusinessLogicFactory.productpagebl().createProduct(driver,"TestAutomation_10");
	}
	
	@Test(priority=3)
	public void createmanufacturingordertest() throws InterruptedException
	{		
		BusinessLogicFactory.manufacturingpagebl().createorder(driver, "TestAutomation_10");
		Assert.assertEquals(PageRepofactory.manufacturingPageRepo(driver).getStatus().getText(),"Done");
		BaseClass.browserclose();
	}
}
