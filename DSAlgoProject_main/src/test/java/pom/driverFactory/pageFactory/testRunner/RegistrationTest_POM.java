package pom.driverFactory.pageFactory.testRunner;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pom.driverFactory.DriverFactory;
import utilities.Sleep;

public class RegistrationTest_POM {
	
	private static WebDriver driver;

	@Test(priority = 1)
	public void clickGetStarted() {
		driver=DriverFactory.getDriverForBrowser("Firefox");
		driver.get("https://dsportalapp.herokuapp.com");
		Sleep.sleep();
		WebElement getStarted = driver.findElement(ById.xpath("//button[contains(text(),'Get Started')]"));
		getStarted.click();
	}
	
	@Test(priority = 2)
	public void clickSignIn() {
		Sleep.sleep();
		WebElement registerLink = driver.findElement(ById.xpath("//a[contains(text(),'Register')]"));
		registerLink.click();
		
	}
	
	@Test(priority = 3)
	public void registerUserError() {
		Sleep.sleep();
		WebElement usernameTextBox = driver.findElement(By.name("username"));
		//TODO get input from Excel
		usernameTextBox.sendKeys("Login1234");
		
		WebElement passwordTextBox = driver.findElement(By.name("password1"));
		//TODO get input from Excel
		passwordTextBox.sendKeys("Login1234");
		Sleep.sleep();
		WebElement confirmPasswordTextBox = driver.findElement(By.id("id_password2"));
		//TODO get input from Excel
		confirmPasswordTextBox.sendKeys("Login1234");
		Sleep.sleep();
		WebElement registerButton = driver.findElement(By.xpath("//input[@type='submit' and @value='Register']"));
		registerButton.click();
	}
	
	@Test(priority = 4)
	public void registerUser() {
		Sleep.sleep();
		WebElement usernameTextBox = driver.findElement(By.name("username"));
		//TODO get input from Excel
		usernameTextBox.clear();
		usernameTextBox.sendKeys(RandomStringUtils.random(8, true, true));
		
		WebElement passwordTextBox = driver.findElement(By.name("password1"));
		//TODO get input from Excel
		passwordTextBox.clear();
		passwordTextBox.sendKeys("Login1234");
		Sleep.sleep();
		WebElement confirmPasswordTextBox = driver.findElement(By.id("id_password2"));
		//TODO get input from Excel
		confirmPasswordTextBox.clear();
		confirmPasswordTextBox.sendKeys("Login1234");
		Sleep.sleep();
		WebElement registerButton = driver.findElement(By.xpath("//input[@type='submit' and @value='Register']"));
		registerButton.click();
	}
	
	
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}

}
