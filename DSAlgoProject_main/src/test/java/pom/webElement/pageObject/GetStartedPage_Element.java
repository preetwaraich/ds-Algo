package pom.webElement.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import utilities.ConfigReader;
import utilities.Sleep;

public class GetStartedPage_Element {
	private WebDriver driver;
	 String URL=ConfigReader.getApplicationUrl();
	
	 //constructor 
	 public GetStartedPage_Element(WebDriver driver) {
	  this.driver = driver;
	 }

	 WebElement getStarted = driver.findElement(ById.xpath("//button[contains(text(),'Get Started')]"));


	 //Actions or Methods
	 public void openHomepage() {
	  driver.get(URL);
	 }
	 
	 public void clickGetStarted_btn() {

		 getStarted.click();
		 Sleep.sleep(3000);
	 }

	 public String getHomePageTitle() {
	  return driver.getTitle().trim();
	 }

}
