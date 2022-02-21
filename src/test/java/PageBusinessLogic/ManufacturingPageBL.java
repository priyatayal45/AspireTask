package PageBusinessLogic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Common.PageRepofactory;

public class ManufacturingPageBL

{

	
	public void createorder(WebDriver driver,String productname) throws InterruptedException
	{
		PageRepofactory.ProductPageRepo(driver).gethomebtn().click();
		PageRepofactory.manufacturingPageRepo(driver).getMftBtn().click();
		PageRepofactory.manufacturingPageRepo(driver).getmftCreate().click();
		PageRepofactory.manufacturingPageRepo(driver).getproducttxtbox().sendKeys(productname);
		driver.findElement(By.xpath("//a[text()=\""+productname+"\"]")).click();
		PageRepofactory.manufacturingPageRepo(driver).getconfirmBtn().click();
		WebDriverWait wait = new WebDriverWait(driver,3000);
		wait.until(ExpectedConditions.elementToBeClickable(PageRepofactory.manufacturingPageRepo(driver).getmarkasdoneBtn()));
		PageRepofactory.manufacturingPageRepo(driver).getmarkasdoneBtn().click();
		PageRepofactory.manufacturingPageRepo(driver).getokBtn().click();
		PageRepofactory.manufacturingPageRepo(driver).getapplyBtn().click();
		String orderno=PageRepofactory.manufacturingPageRepo(driver).getref().getText();
		PageRepofactory.manufacturingPageRepo(driver).getback().click();
		PageRepofactory.manufacturingPageRepo(driver).getremoveBtn().click();
		PageRepofactory.manufacturingPageRepo(driver).getSearchBox().sendKeys(orderno);
		PageRepofactory.manufacturingPageRepo(driver).getSearchBox().sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.textToBePresentInElement(PageRepofactory.manufacturingPageRepo(driver).getname(), orderno));
		
	}
	
}
