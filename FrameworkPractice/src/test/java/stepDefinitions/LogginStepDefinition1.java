package stepDefinitions;

import static org.testng.Assert.assertEquals;

import base.TestBase1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage1;

public class LogginStepDefinition1 extends TestBase1{

LoginPage1 lp=new LoginPage1(driver);

@Given("Navigate to the URL")
public void navigate_to_the_URL(){

lp.getUrl();
}

@When("Enter the username and password and click on loginbutton")
public void enter_the_username_and_password_and_click_on_loginbutton(){
lp.username();
lp.password();
lp.loginbutton();

}

@Then("User should land on the homepage")
public void user_should_land_on_the_homepage(){

String actual=lp.getTitle();
assertEquals(actual,"Log in - W3Schools");


}
}