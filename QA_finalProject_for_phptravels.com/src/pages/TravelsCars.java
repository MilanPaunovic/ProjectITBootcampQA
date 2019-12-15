package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TravelsCars extends BasicPage {
	
	private By cars = By.cssSelector("ul#social-sidebar-menu > li:nth-of-type(10) > a");
	private By carsCars = By.cssSelector("#Cars > li:nth-child(1)");
	private By carsRow = By.cssSelector(".xcrud-row");


	public TravelsCars(WebDriver driver) {
		super(driver);
	}
	
	
	public List<WebElement> getResults() {
		return this.driver.findElements(carsRow);
	}
	
	public int getResultCount() {
		return this.getResults().size();
		
	}

	
	public WebElement getCarsRow() {
		return this.driver.findElement(cars);
	}
	
	public WebElement getCarsCars() {
		return this.driver.findElement(carsCars);
	}
	
	
	public void clickOnCarsRow() {
		this.getCarsRow().click();
	}
	
	public void clickOnCarsCars() {
		this.getCarsCars().click();
	}
	
	
	public boolean carOrdersIsOver50() {
			
		int sumOrders = 0;
		for (int i = 0; i < getResultCount(); i++) {
			WebElement numberOfOrders = getResults().get(i).findElements(By.tagName("td")).get(9); 
			
			int digit = Integer.parseInt(numberOfOrders.findElement(By.tagName("input")).getAttribute("value"));
			sumOrders += digit;
		}
		
		boolean n50plus = false;
		if (sumOrders > 50) {
			n50plus = true;
		}
		
		return n50plus;			
	}
	
}