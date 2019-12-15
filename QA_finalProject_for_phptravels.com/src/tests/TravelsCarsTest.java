package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.PageTitle;
import pages.TravelsCars;


public class TravelsCarsTest extends LoginTest {
	
	private String baseUrl = "https://www.phptravels.net/admin";
	
	@Test (priority = 41)
	public void carTest() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(4000);
		
	TravelsCars tc = new TravelsCars(driver);

	tc.getCarsRow().click();
	Thread.sleep(5000);

	tc.getCarsCars().click();
	Thread.sleep(2000);
		
	PageTitle pt = new PageTitle(driver);	
	String actualTitle = pt.getPageTitle();
	String expectedTitle = "Cars Management";
	Assert.assertEquals(expectedTitle, actualTitle);
		
	}
	
	@Test(priority = 42)
	public void ifEqual10Test() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(4000);
		
		TravelsCars tc = new TravelsCars(driver);
		
		System.out.println("Is the number of car model equal to 10?");
		Assert.assertEquals(tc.getResultCount(), 10);
	}
	
	@Test(priority = 43)
	public void carOrdersIsOver50Test() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(4000);
		
		TravelsCars tc = new TravelsCars(driver);
		
		System.out.println("Is the total number of orders greater than 50?");
		Assert.assertFalse(tc.carOrdersIsOver50());

	}	
}
