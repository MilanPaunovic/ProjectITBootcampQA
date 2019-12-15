package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TravelsCarsExtras;

public class TravelsCarsExtrasTest extends LoginTest {
	
	private String baseUrl = "https://www.phptravels.net/admin";
	
	@Test(priority = 51)
	public void carsExtras() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(4000);
		
	TravelsCarsExtras carsExtras = new TravelsCarsExtras(driver);
	Thread.sleep(3000);
	
	carsExtras.getCars();
	Thread.sleep(3000);
	
	carsExtras.getCarsExtras();
	Thread.sleep(3000);
	
	carsExtras.getAddButton();
	Thread.sleep(3000);
	
	carsExtras.getName("SSC_Tuatara");
	Thread.sleep(3000);
	
	carsExtras.optionsForStatus("Yes");
	Thread.sleep(3000);
	
	carsExtras.setPrice("1300003");
	Thread.sleep(3000);
	
	carsExtras.getSaveReturn();
	Thread.sleep(3000);
	
	Assert.assertEquals(carsExtras.checkMyCar("SSC_Tuatara"), "SSC_Tuatara");
		
	}
	
}
