package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import resources.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.runner.RunWith;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
@RunWith(Cucumber.class)
public class stepDefination extends Base {

    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
        //throw new PendingException();
    	
    	driver =initilizeDriver();
    }

    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
        //throw new PendingException();
    	
    	driver.get(strArg1);
    }
    
    @And("^Click on Login link in hone page$")
    public void click_on_login_link_in_hone_page() throws Throwable {
        //throw new PendingException();
    	

		LandingPage l = new LandingPage(driver);
		l.noThanks().click();
		Thread.sleep(2000);
		l.getLogin().click();
    }
    
    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
    public void user_enters_something_and_something_and_logs_in(String strArg1, String strArg2) throws Throwable {
        //throw new PendingException();
    	
    	LoginPage lp = new LoginPage(driver);
		lp.email().sendKeys(strArg1);
		Thread.sleep(2000);
		lp.password().sendKeys(strArg2);
		Thread.sleep(2000);
		lp.login().click();
    	
    	
    }

    @Then("^verify that user is successfully logged in$")
    public void verify_that_user_is_successfully_logged_in() throws Throwable {
        //throw new PendingException();
    }

    

    

}