package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsMenu extends BasicPage {
	

	private By Dashboard = By.className("fa fa-desktop");
	private By Updates =  By.cssSelector("ul#social-sidebar-menu li:nth-of-type(2) a");
	private By Modules =  By.cssSelector("ul#social-sidebar-menu li:nth-of-type(3) a");	
	private By Tours = By.cssSelector("ul#social-sidebar-menu > li:nth-of-type(9) a");
	private By ToursAdd = By.xpath("//*[@id=\"Tours\"]/li[2]");
	private By Coupons = By.cssSelector("ul#social-sidebar-menu li:nth-of-type(15) > a");
	private By NewsLetter = By.className("ul#social-sidebar-menu li:nth-of-type(16) > a");
	private By Bookings = By.cssSelector("ul#social-sidebar-menu li:nth-of-type(17) > a");


	public TravelsMenu(WebDriver driver) {
		super(driver);
	}

	
	public By getDashboard() {
		return Dashboard;
	}

	public By getUpdates() {
		return Updates;
	}

	public By getModules() {
		return Modules;
	}

	public By getTours() {
		return Tours;
	}
	
	public By getToursAdd() {
		return ToursAdd;
	}

	public By getCoupons() {
		return Coupons;
	}

	public By getNewsLetter() {
		return NewsLetter;
	}

	public By getBookings() {
		return Bookings;
	}
	
	
	public void clickOnDashBoard() {
		this.driver.findElement(Dashboard).click();
	}
	
	public void clickOnUpdates() {
		this.driver.findElement(Updates).click();
	}
	
	public void clickOnModules() {
		this.driver.findElement(Modules).click();
	}
	
	
	public WebElement getOnTours() {
		return this.driver.findElement(Tours);
	}
	
	public void clickOnTours() {
		this.driver.findElement(Tours).click();
	}

	public void clickOnToursAdd() {
		this.driver.findElement(ToursAdd).click();
	}
	
	public void clickOnCoupons() {
		this.driver.findElement(Coupons).click();
	}
	
	public void clickOnNewsLetter() {
		this.driver.findElement(NewsLetter).click();
	}
	
	public void clickOnBookings() {
		this.driver.findElement(Bookings).click();
	}

}
