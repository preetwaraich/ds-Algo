package pom.pageFactory.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.Sleep;

public class SignInPage {
	private WebDriver driver;
	 String URL=ConfigReader.getApplicationUrl();
	//constructor 
	 public SignInPage(WebDriver driver) {
	  this.driver = driver;
	  PageFactory.initElements(driver, this); // initializing WebElelements
	 }

	//Textboxes
	 @FindBy(name = "username")
	 WebElement usernameTextBox;
	 
	 @FindBy(name = "password")
	 WebElement passwordTextBox;
	 
	 @FindBy(xpath = "//input[@type='submit' and @value='Login']")
	 WebElement loginButton;

	 
	//Error message
		@FindBy(xpath = "//div[@role='alert']")
		WebElement errorMessage;

	 //Actions or Methods
	 public void app_url() {
	  driver.get(URL);
	 }
	 
	 public void enterUsername(String username) {

		 usernameTextBox.sendKeys(username);

	 }
	 
	 public void clearUsername() {

		 usernameTextBox.clear();

	 }
	 
	 public void enterPassword(String password) {

		 passwordTextBox.sendKeys(password);

	 }
	 
	 public void clearPassword() {

		 passwordTextBox.clear();

	 }
	 
	 public void clickLogin() {
		 Sleep.sleep();
		 loginButton.click();
	 }

	 public String getHomePageTitle() {
	  return driver.getTitle().trim();
	 }
	 
	 public String getErrorMsg() {
		 	Sleep.sleep();
			String errorMsg=errorMessage.getText();
			return errorMsg;
		}

}
