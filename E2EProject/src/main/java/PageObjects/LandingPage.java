package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	
	By signin= By.cssSelector("a[href*='sign_in']");
	By noThanks = By.xpath("//*[@id='homepage']/div[4]/div[2]/div/div/div/span/div/div[6]/div/div/button");
	By title = By.xpath("//*[@id='content']/div/div/h2");
	By navigationBar = By.xpath("//*[@id='homepage']/header/div[2]/div/nav/ul");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement noThanks() {
		return driver.findElement(noThanks);
	}

	public WebElement getLogin() {
		
		return driver.findElement(signin);
	}
	public WebElement getTitle() {
		
		return driver.findElement(title);
	}
	public WebElement getNavigationBar() {
		
		return driver.findElement(navigationBar);
	}
}
