package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePageObject extends TestBase{

	public WebDriver driver;
	
	public HomePageObject(WebDriver Driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Paid courses']")
	WebElement paidcourse;
	
	public void clickOnPaidCourse() {
		
		paidcourse.click();
	}
}

