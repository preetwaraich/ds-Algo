package standalone.dsalgoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.Sleep;

public class RegistrationTestSuite {
	
	private static WebDriver driver = new ChromeDriver();

	@Test
	public void clickGetStarted() {
		driver.get("https://dsportalapp.herokuapp.com");
		Sleep.sleep(2000);
		WebElement getStarted = driver.findElement(ById.xpath("//button[contains(text(),'Get Started')]"));
		getStarted.click();
	}
	@Test
	public void clickSignIn() {
		Sleep.sleep(1000);
		WebElement registerLink = driver.findElement(ById.xpath("//a[contains(text(),'Register')]"));
		registerLink.click();
		
	}
	
	@Test
	public void registerUserError() {
		Sleep.sleep(1000);
		WebElement usernameTextBox = driver.findElement(By.name("username"));
		//TODO get input from Excel
		usernameTextBox.sendKeys("Login1234");
		
		WebElement passwordTextBox = driver.findElement(By.name("password1"));
		//TODO get input from Excel
		passwordTextBox.sendKeys("Login1234");
		Sleep.sleep(1000);
		WebElement confirmPasswordTextBox = driver.findElement(By.id("id_password2"));
		//TODO get input from Excel
		confirmPasswordTextBox.sendKeys("Login1234");
		Sleep.sleep(1000);
		WebElement registerButton = driver.findElement(By.xpath("//input[@type='submit' and @value='Register']"));
		registerButton.click();
	}
	
	@Test
	public void registerUser() {
		Sleep.sleep(1000);
		WebElement usernameTextBox = driver.findElement(By.name("username"));
		//TODO get input from Excel
		usernameTextBox.clear();
		usernameTextBox.sendKeys("MyNewUser9899");
		
		WebElement passwordTextBox = driver.findElement(By.name("password1"));
		//TODO get input from Excel
		passwordTextBox.clear();
		passwordTextBox.sendKeys("Login1234");
		Sleep.sleep(1000);
		WebElement confirmPasswordTextBox = driver.findElement(By.id("id_password2"));
		//TODO get input from Excel
		confirmPasswordTextBox.clear();
		confirmPasswordTextBox.sendKeys("Login1234");
		Sleep.sleep(1000);
		WebElement registerButton = driver.findElement(By.xpath("//input[@type='submit' and @value='Register']"));
		registerButton.click();
	}
	
	
	

}
