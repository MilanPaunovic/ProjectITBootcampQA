package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TravelsCarsExtras extends BasicPage {
	
	private By Cars = By.cssSelector("ul#social-sidebar-menu > li:nth-of-type(10) > a");
	private By carsExtras = By.cssSelector("#Cars > li:nth-child(2) > a");
	private By AddButton = By.cssSelector(".btn.btn-success.xcrud-action");
	private By Name = By.cssSelector(".xcrud-input.form-control");
	private By Status = By.cssSelector("#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-view > div > div:nth-child(3) > div > select");
	private By Price = By.cssSelector("#content div.panel.panel-default div.panel-body div div div.xcrud-ajax div.xcrud-view div div:nth-child(4) div input");
	private By SaveReturn = By.cssSelector(".btn.btn-primary.xcrud-action");
	
	public TravelsCarsExtras(WebDriver driver) {
		super(driver);
	}
	
	public void getCars() {
		this.driver.findElement(this.Cars).click();
	}
	
	public void getCarsExtras() {
		this.driver.findElement(this.carsExtras).click();
	}
	
	public void getAddButton() {
		this.driver.findElement(this.AddButton).click();
	}
	
	public void getName(String Name) {
		this.driver.findElement(this.Name).sendKeys(Name);
	}
	
	public void optionsForStatus(String StatusOptions) {
		Select st = new Select(this.driver.findElement(this.Status));
		st.selectByVisibleText(StatusOptions);
	}
	
	public String setPrice(String Price) throws InterruptedException {
		WebElement p = this.driver.findElement(this.Price);
		p.sendKeys(Price);
		Thread.sleep(2000);
		
		return p.getAttribute("value");	
	}
	
	public void getSaveReturn() {
		this.driver.findElement(this.SaveReturn).click();
	}

	public String checkMyCar(String SSC_Tuatara) {
		return SSC_Tuatara;
	}

}