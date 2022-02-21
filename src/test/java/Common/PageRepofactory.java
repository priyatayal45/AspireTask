package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import PageRepo.HomePageRepo;
import PageRepo.LoginpageRepo;
import PageRepo.ManufacturingPageRepo;
import PageRepo.ProductPageRepo;

public class PageRepofactory

{
	static LoginpageRepo lpr;
	static HomePageRepo hpr;
	static ProductPageRepo ppr;
	static ManufacturingPageRepo mpr;
	public static LoginpageRepo loginpagerepo(WebDriver driver) {
		if (lpr == null) {

			lpr = PageFactory.initElements(driver, LoginpageRepo.class);
		}
		return lpr;

	}

	public static HomePageRepo homePageRepo(WebDriver driver) {
		if (hpr == null) {

			hpr = PageFactory.initElements(driver, HomePageRepo.class);
		}
		return hpr;

	}

	
	public static ProductPageRepo ProductPageRepo(WebDriver driver) {
		if (ppr == null) {

			ppr = PageFactory.initElements(driver, ProductPageRepo.class);
		}
		return ppr;

	}
	public static ManufacturingPageRepo manufacturingPageRepo(WebDriver driver) {
		if (mpr == null) {

			mpr = PageFactory.initElements(driver, ManufacturingPageRepo.class);
		}
		return mpr;

	}
	
}
