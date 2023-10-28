package stepDefinitions;

import base.TestBase;
import io.cucumber.java.en.When;
import pageObject.HomePageObject;

public class HomePageStepdef extends TestBase {
	
	HomePageObject hpo=new HomePageObject(driver);
	
	@When("click on paid course")
	
	public void click_on_paid_course() {
		
		hpo.clickOnPaidCourse();
	}

}
