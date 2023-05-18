package pom.pageFactory.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.Sleep;

public class GetStartedPage {
	private WebDriver driver;
	 String URL=ConfigReader.getApplicationUrl();
	
	 //constructor 
	 public GetStartedPage(WebDriver driver) {
	  this.driver = driver;
	  PageFactory.initElements(driver, this); // initializing WebElelements
	 }

	//Get Started button
	 @FindBy(xpath = "//button[@class='btn']")
	 WebElement getStartedBtn;


	 //Actions or Methods
	 public void open_app_url() {
	  driver.get(URL);
	 }
	 
	 public void clickGetStarted_btn() {
		 Sleep.sleep();
	  getStartedBtn.click();

	 }

	 public String getHomePageTitle() {
	  return driver.getTitle().trim();
	 }

}
