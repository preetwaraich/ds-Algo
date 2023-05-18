package ToBeDeleted;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.Sleep;

public class TestSuite_ToBeDeleted {
	
	private static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {

		// Launch browser
		//WebDriver driver = new ChromeDriver();

		// open url on the browser
		//driver.get("https://dsportalapp.herokuapp.com");
		//Sleep.sleep();

		//WebElement getStarted = driver.findElement(ById.xpath("//button[contains(text(),'Get Started')]"));
		//getStarted.click();
		Sleep.sleep();
		WebElement registerLink = driver.findElement(ById.xpath("//a[contains(text(),'Register')]"));
		registerLink.click();

	}

	@Test
	public void clickGetStarted() {
		driver.get("https://dsportalapp.herokuapp.com");
		Sleep.sleep();
		WebElement getStarted = driver.findElement(ById.xpath("//button[contains(text(),'Get Started')]"));
		getStarted.click();
	}
	@Test
	public void clickRegister() {
		Sleep.sleep();
		WebElement registerLink = driver.findElement(By.xpath("//input[@type='submit' and @value='Register']"));
		registerLink.click();
		
	}
	

}
