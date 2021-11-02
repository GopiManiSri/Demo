package E2E;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resources.Base;
public class HomePage extends Base{
	
	public static Logger log =LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
	 driver =initilizeDriver();
	}
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		driver=null;
		
	}

	@Test(dataProvider="getData")
	public void HomePageTest(String Username,String Password, String text) throws IOException, InterruptedException {

		
		driver.get(pro.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.noThanks().click();
		Thread.sleep(2000);
		l.getLogin().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.email().sendKeys(Username);
		Thread.sleep(2000);
		lp.password().sendKeys(Password);
		Thread.sleep(2000);
		lp.login().click();
		
		log.info(text);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		//0th row
		data[0][0]="nonrestricteduser@qw.com";
		data[0][1]="123456";
		data[0][2]="Restrcited User";
		//1st row
		/*data[1][0]="restricteduser@qw.com";
		data[1][1]="456788";
		data[1][2]= "Non restricted user";*/
		
		return data;
				
	}
}
