package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1{

public WebDriver driver;

public LoginPage1(WebDriver driver){
 this.driver=driver;
PageFactory.initElements(driver,this);

}
@FindBy(xpath="//input[@id='modalusername']")
WebElement username;

@FindBy(xpath="//input[@id='current-password']")
WebElement password;

@FindBy(xpath="//span[text()='Log in']")
WebElement loginButton;

public void username(){
username.sendKeys("bddcucumber03@gmail.com");
}

public void password(){
password.sendKeys("BDDcucumber@123");
}

public void loginbutton(){
loginButton.click();

}

public void getUrl(){
driver.get("https://profile.w3schools.com/log-in");
}

public String getTitle(){
return driver.getTitle();
}



}