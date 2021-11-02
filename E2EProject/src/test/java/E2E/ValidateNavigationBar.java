package E2E;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import resources.Base;
public class ValidateNavigationBar extends Base{
	public static Logger log =LogManager.getLogger(Base.class.getName());
	@BeforeTest

	public void initialize() throws IOException
	{
	
	 driver =initilizeDriver();
	 log.info("Driver is initialized");
		
	driver.get(pro.getProperty("url"));
	log.info("Navigated to Home page");
	}
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}
	@Test
	public void ValidateAppNavigationBar() throws IOException, InterruptedException {
		
		LandingPage l = new LandingPage(driver);
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		log.info("Navigation Bar is displayed");
	}
	
}
