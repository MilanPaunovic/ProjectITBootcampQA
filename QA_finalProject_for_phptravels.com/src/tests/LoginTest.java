package tests;

import org.testng.Assert;
// import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.TravelsLogin;
import utils.ExcelUtils;


public class LoginTest extends BasicTest {

	private String baseUrl = "https://www.phptravels.net/admin";

	@Test (priority = 0)
	public void basicLogin() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(5000);
		
		ExcelUtils ex = new ExcelUtils();
		ex.setExcell("..\\QA_finalProject_for_phptravels.com\\excel\\Username.xlsx");
		ex.setWorkSheet(0);
		
		TravelsLogin tl = new TravelsLogin(driver);
		tl.singIn(ex.getDataAt(1, 0), ex.getDataAt(1, 1), false);
		ex.closeExcell();
		Thread.sleep(5000);

		HomePage hp = new HomePage(driver);
		Assert.assertTrue(hp.isLoggedOut());
	
	}
	
}
