package pageObject;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FrameworkPractice.action.ActionClass;

public class LoginPage {
	
	public WebDriver driver;
	
	//public ActionClass ac;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	//ac=new ActionClass();
	}
	
	

	@FindBy(xpath="//input[@id='modalusername']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='current-password']")
	WebElement password;
	
	@FindBy(xpath="//span[text()='Log in']")
	WebElement loginbutton;
	
	public void username() {
		
		//ac.clearText(username);
		username.sendKeys("bddcucumber03@gmail.com");
	}
	
	public void password() {
		
		password.sendKeys("BDDcucumber@123");
	}
	
	public void loginButton() {
		
		loginbutton.click();
	}
	
	public void getURL() {
		
		driver.get("https://profile.w3schools.com/log-in");
	 }
	
	public String getTitle() {
		
		return driver.getTitle();
	}
	
	public void wrongCredentials() {
		
		username.sendKeys("abcde");
		
		password.sendKeys("pqrs");
		
		loginbutton.click();
		
	}
	
	public String getUrlString(){
		
		return driver.getCurrentUrl();
		
	}
	
	
}
