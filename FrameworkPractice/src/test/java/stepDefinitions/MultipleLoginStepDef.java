package stepDefinitions;

import base.TestBase;
import io.cucumber.java.en.When;
import pageObject.LoginPage;

public class MultipleLoginStepDef extends TestBase {
	
	LoginPage lp=new LoginPage(driver);

	@When("Enter (.+) and (.+) and click on login button")
	public void enter_username_and_password_and_click_on_login_button(String username, String password){
	
		lp.username();
		lp.password();
		lp.loginButton();
		
	}
	
}
