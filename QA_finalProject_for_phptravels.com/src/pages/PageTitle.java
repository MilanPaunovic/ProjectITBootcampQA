package pages;

import org.openqa.selenium.WebDriver;

public class PageTitle extends BasicPage{

	
	public PageTitle(WebDriver driver) {
		super(driver);
	}

	public String getPageTitle() {
		return this.driver.getTitle();
	}
}