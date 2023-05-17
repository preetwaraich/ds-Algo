package pom.usingBy.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;
import utilities.Sleep;

public class GetStartedPage_By {
	private WebDriver driver;
	 String URL=ConfigReader.getApplicationUrl();
	//constructor 
	 public GetStartedPage_By(WebDriver driver) {
	  this.driver = driver;
	 }


	 By getStartedBtn = By.xpath("//button[contains(text(),'Get Started')]");


	 //Actions or Methods
	 public void app_url() {
	  driver.get(URL);
	 }
	 
	 public void clickGetstarted_btn() {
		 
	 driver.findElement(getStartedBtn).click();
	 Sleep.sleep(3000);
	 }

	 public String getHomePageTitle() {
	  return driver.getTitle().trim();
	 }

}
