package Common;

import PageBusinessLogic.HomePageBL;
import PageBusinessLogic.LoginPageBL;
import PageBusinessLogic.ManufacturingPageBL;
import PageBusinessLogic.ProductPageBL;
import PageRepo.ManufacturingPageRepo;

public class BusinessLogicFactory {

	private static LoginPageBL lpb;
	private static HomePageBL hpb;
	private static ProductPageBL ppb;
	private static ManufacturingPageBL mpb;
	
	public static LoginPageBL loginpagebl() {
		return lpb != null ? lpb : new LoginPageBL();
	}

	public static HomePageBL homepagebl() {
		return hpb != null ? hpb : new HomePageBL();
	}

	public static ProductPageBL productpagebl() {
		return ppb != null ? ppb : new ProductPageBL();
	}
	
	public static ManufacturingPageBL manufacturingpagebl() {
		return mpb != null ? mpb : new ManufacturingPageBL();
	}
}
