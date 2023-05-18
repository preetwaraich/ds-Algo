package pom.pageFactory.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.Sleep;

public class RegisterPage {
	private WebDriver driver;
	 String URL=ConfigReader.getApplicationUrl();
	//constructor 
	 public RegisterPage(WebDriver driver) {
	  this.driver = driver;
	  PageFactory.initElements(driver, this); // initializing WebElelements
	 }

	//Textboxes
	 @FindBy(name = "username")
	 WebElement usernameTextBox;
	 
	 @FindBy(name = "password1")
	 WebElement passwordTextBox;
	 
	 @FindBy(id = "id_password2")
	 WebElement confirmPasswordTextBox;
	 
	 @FindBy(xpath = "//input[@type='submit' and @value='Register']")
	 WebElement registerButton;
	 
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
	 
	 public void enterPassword(String password) {

		 passwordTextBox.sendKeys(password);

	 }
	 
	 public void enterconfirmPassword(String confirmPassword) {

		 confirmPasswordTextBox.sendKeys(confirmPassword);

	 }
	 
	 public void clickRegisterButton() {
		 Sleep.sleep();
		 registerButton.click();
		 Sleep.sleep();
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
