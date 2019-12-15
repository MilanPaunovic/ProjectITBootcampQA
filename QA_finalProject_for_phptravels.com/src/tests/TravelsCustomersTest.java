package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TravelsCustomers;


public class TravelsCustomersTest extends LoginTest {
	
	private String baseUrl = "https://www.phptravels.net/admin";
	
	@Test (priority = 61)
	public void customersTest() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(4000);
		
	TravelsCustomers tcustomers = new TravelsCustomers(driver);
		Thread.sleep(4000);
	
	tcustomers.clickOnAccounts();
		Thread.sleep(3000);
		
	tcustomers.clickOnCustomers();
		Thread.sleep(1000);
		
	tcustomers.clickOnEditCustomer();
		Thread.sleep(2000);
		
	tcustomers.sendFirstName();
		Thread.sleep(1000);
		
	tcustomers.sendLastName();
		Thread.sleep(1000);
		
	tcustomers.sendEmail();
		Thread.sleep(1000);
		
	tcustomers.sendPhone();
		Thread.sleep(1000);
		
	tcustomers.clickOnCountry();
		Thread.sleep(1000);
		
	tcustomers.sendAddress();
		Thread.sleep(1000);
		
	tcustomers.clickOnStatus();
		Thread.sleep(1000);
		
	tcustomers.clickOnNewsSubscribe();
		Thread.sleep(1000);
		
	tcustomers.clickOnSubmitButton();
		Thread.sleep(4000);
		
	tcustomers.clickOnSearchButton();
		Thread.sleep(2000);
		
	tcustomers.clickOnSearchField();
		Thread.sleep(2000);
		
	tcustomers.clickOnCustomerList();
		Thread.sleep(2000);
	
	Assert.assertTrue(tcustomers.getcustomers().getText().contains("Ave Cezar"));

	}
}
