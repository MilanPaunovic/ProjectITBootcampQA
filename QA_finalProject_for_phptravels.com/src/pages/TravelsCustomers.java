package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TravelsCustomers extends BasicPage {

	private By accounts = By.cssSelector("ul#social-sidebar-menu > li:nth-of-type(5) > a");
	private By customers = By.cssSelector("#ACCOUNTS > li:nth-child(3) > a");
	private By editCustomer = By.cssSelector(".btn.btn-default.btn-xcrud.btn.btn-warning");	
	private By firstName = By.name("fname");
	private By lastName = By.name("lname");
	private By email = By.name("email");
	private By phone = By.name("mobile");
	private By country = By.cssSelector(".select2-chosen");
	private By countrySearch = By.cssSelector(".select2-input");	
	private By address = By.name("address1");
	private By statusDM = By.name("status");
	private By newsSubscribe = By.name("newssub");	
	private By submitButton = By.cssSelector("#content > form > div > div.panel-footer > button");	
	private By searchButton = By.cssSelector("a.xcrud-search-toggle.btn.btn-default");
	private By searchField = By.cssSelector("input.xcrud-searchdata.xcrud-search-active.input-small.form-control");
	private By customerList = By.className("tr.xcrud-row");
	
	
	public TravelsCustomers(WebDriver driver) {
		super(driver);
	}
	
	
	public WebElement getaccounts() {
		      return this.driver.findElement(this.accounts);
	}

	public WebElement getcustomers() {
	      return this.driver.findElement(this.customers);
	}
	
	public WebElement geteditCustomer() {
	      return this.driver.findElement(this.editCustomer);
	}
	
	public WebElement getfirstName() {
	      return this.driver.findElement(this.firstName);
	}
	
	public WebElement getlastName() {
	      return this.driver.findElement(this.lastName);
	}
	
	public WebElement getemail() {
	      return this.driver.findElement(this.email);
	}
	
	public WebElement getphone() {
	      return this.driver.findElement(this.phone);
	}
	
	public WebElement getcountry() {
	      return this.driver.findElement(this.country);
	}
	
	public WebElement getcountrySearch() {
	      return this.driver.findElement(this.countrySearch);
	}
	
	public WebElement getaddress() {
	      return this.driver.findElement(this.address);
	}
	
	public WebElement getstatus() {
	      return this.driver.findElement(this.statusDM);
	}
	
	public WebElement getnewsSubscribe() {
	      return this.driver.findElement(this.newsSubscribe);
	}
	
	public WebElement getsubmitButton() {
	      return this.driver.findElement(this.submitButton);
	}
	
	public WebElement getsearchButton() {
	      return this.driver.findElement(this.searchButton);
	}

	public WebElement getsearchField() {
		  return this.driver.findElement(this.searchField);
	}

	public WebElement getcustomerList() {
		  return this.driver.findElement(this.customerList);
	}
	
	
	public void clickOnAccounts() {
		this.driver.findElement(accounts).click();
	}

	public void clickOnCustomers() {
		this.driver.findElement(customers).click();
	}

	public void clickOnEditCustomer() {
		this.driver.findElement(editCustomer).click();
	}

	public void sendFirstName() {
		this.getfirstName().clear();
		this.getfirstName().sendKeys("Ave");
	}

	public void sendLastName() {
		this.getlastName().clear();
		this.getlastName().sendKeys("Cezar");
	}
	
	public void sendEmail() {
		this.getemail().clear();
		this.getemail().sendKeys("efsme4@gmx.com");
	}

	public void sendPhone() {
		this.getphone().clear();
		this.getphone().sendKeys("+38668356921");
	}

	public void clickOnCountry() {
		this.driver.findElement(this.country).click();
		WebElement c = driver.findElement(this.countrySearch);
		c.sendKeys("Greenland");
		c.sendKeys(Keys.ENTER);

	}

	public void sendAddress() {
		this.getaddress().clear();
		this.getaddress().sendKeys("Elm street 7c");
	}

	public void clickOnStatus() {
		WebElement sdm = driver.findElement(this.statusDM);
		Select s = new Select(sdm);
		s.selectByVisibleText("Enabled");
	}
	
	public void clickOnNewsSubscribe() {
		this.driver.findElement(this.newsSubscribe).click();
	}

	public void clickOnSubmitButton() {
		this.driver.findElement(this.submitButton).click();
	}

	public void clickOnSearchButton() {
		this.driver.findElement(searchButton).click();
	}
	public void clickOnSearchField() {
		this.getsearchField();
		this.getsearchField().sendKeys("Ave Cezar");
	}
	
	public void clickOnCustomerList() {
		this.driver.findElement(customerList).click();
	}
		
}
