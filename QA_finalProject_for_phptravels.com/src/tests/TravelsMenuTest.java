package tests;

import org.testng.annotations.Test;
//import org.openqa.selenium.By;
import org.testng.Assert;

import pages.PageTitle;
import pages.TravelsMenu;

public class TravelsMenuTest extends LoginTest {
	
	private String baseUrl = "https://www.phptravels.net/admin";

	@Test (priority = 5)
	public void dashboardTest() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(4000);

	TravelsMenu tm = new TravelsMenu(driver);
	tm.getDashboard();
	Thread.sleep(4000);
	
	PageTitle pt = new PageTitle(driver);
	Assert.assertTrue(pt.getPageTitle().equals("Dashboard"));
	
	}
	
	@Test (priority = 10)
	public void updatesTest() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(4000);

	TravelsMenu tm = new TravelsMenu(driver);
	tm.clickOnUpdates();
	Thread.sleep(4000);
	
	PageTitle pt = new PageTitle(driver);
	String actualTitle = pt.getPageTitle();
	String expectedTitle = "Updates";
	Assert.assertEquals(expectedTitle, actualTitle);
		
	}
	
	@Test (priority = 15)
	public void modulesTest() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(4000);

	TravelsMenu tm = new TravelsMenu(driver);
	tm.clickOnModules();
	Thread.sleep(4000);
	
	PageTitle pt = new PageTitle(driver);
	String actualTitle = pt.getPageTitle();
	String expectedTitle = "Modules";
	Assert.assertEquals(expectedTitle, actualTitle);

	}
	
	@Test (priority = 25)
	public void toursTest() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(5000);

	TravelsMenu tm = new TravelsMenu(driver);
	tm.clickOnTours();
	Thread.sleep(5000);
	tm.clickOnToursAdd();
	Thread.sleep(5000);
	
	PageTitle pt = new PageTitle(driver);
	String actualTitle = pt.getPageTitle();
	String expectedTitle = "Add Tour";
	Assert.assertEquals(expectedTitle, actualTitle);
	
	}

	@Test (priority = 30)
	public void couponsTest() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(4000);

	TravelsMenu tm = new TravelsMenu(driver);
	tm.clickOnCoupons();
	Thread.sleep(4000);
	
	PageTitle pt = new PageTitle(driver);
	String actualTitle = pt.getPageTitle();
	String expectedTitle = "Coupon Codes Management";
	Assert.assertEquals(expectedTitle, actualTitle);

	}
	
	@Test (priority = 35)
	public void newsLetterTest() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(4000);

	TravelsMenu tm = new TravelsMenu(driver);
	tm.clickOnNewsLetter();
	Thread.sleep(4000);
	
	PageTitle pt = new PageTitle(driver);
	String actualTitle = pt.getPageTitle();
	String expectedTitle = "Newsletter Management";
	Assert.assertEquals(expectedTitle, actualTitle);
	
	}
	
	@Test (priority = 40)
	public void bookingsTest() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(4000);

	TravelsMenu tm = new TravelsMenu(driver);
	tm.clickOnBookings();
	Thread.sleep(4000);
	
	PageTitle pt = new PageTitle(driver);
	String actualTitle = pt.getPageTitle();
	String expectedTitle = "Booking Management";
	Assert.assertEquals(expectedTitle, actualTitle);
	
	}
}
