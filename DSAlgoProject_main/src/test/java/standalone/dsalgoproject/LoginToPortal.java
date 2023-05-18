package standalone.dsalgoproject;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.Sleep;

public class LoginToPortal {
	
	private static WebDriver driver = new ChromeDriver();

	@Test
	public void clickGetStarted() {
		driver.get("https://dsportalapp.herokuapp.com");
		Sleep.sleep();
		WebElement getStarted = driver.findElement(ById.xpath("//button[contains(text(),'Get Started')]"));
		getStarted.click();
	}
	@Test
	public void clickSignIn() {
		Sleep.sleep();
		
		WebElement signInLink = driver.findElement(ById.xpath("//a[contains(text(),'Sign in')]"));
		signInLink.click();
		
	}
	@Test
	public void loginUserNegativeTest() {
		Sleep.sleep();
		WebElement usernameTextBox = driver.findElement(By.name("username"));
		//TODO get input from Excel
		usernameTextBox.sendKeys("Login1234");
		
		WebElement passwordTextBox = driver.findElement(By.name("password"));
		//TODO get input from Excel
		passwordTextBox.sendKeys("Login1234");
		Sleep.sleep();
		
		Sleep.sleep();
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));
		loginBtn.click();
	}
		
	@Test
	public void loginUserPositiveTest() {
		Sleep.sleep();
		WebElement usernameTextBox = driver.findElement(By.name("username"));
		//TODO get input from Excel
		usernameTextBox.clear();
		usernameTextBox.sendKeys("MyNewUser9899");
		
		WebElement passwordTextBox = driver.findElement(By.id("id_password"));
		//TODO get input from Excel
		passwordTextBox.clear();
		passwordTextBox.sendKeys("Login1234");
		Sleep.sleep();
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));
		loginBtn.click();
	}
	

	

	}
