package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.TestBase1;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks1 extends TestBase1{

@Before
public void setup() throws IOException{

launchDriver();
}

@After
public void teardown(Scenario sc){

if(sc.isFailed()){
TakesScreenshot ts=(TakesScreenshot)driver;
byte[] src=ts.getScreenshotAs(OutputType.BYTES);
sc.attach(src,"image/png",sc.getName());

}
//closeDriver();
}

}


