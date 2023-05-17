package standalone.dsalgoproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.Sleep;

public class DataStructureTestSuite {
	
	private static WebDriver driver = new ChromeDriver();

	@Test
	public void clickGetStarted() {
		driver.get("https://dsportalapp.herokuapp.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Sleep.sleep(2000);
		WebElement getStarted = driver.findElement(ById.xpath("//button[contains(text(),'Get Started')]"));
		getStarted.click();
	}
	@Test
	public void clickSignIn() {
		WebElement signInLink = driver.findElement(ById.xpath("//a[contains(text(),'Sign in')]"));
		signInLink.click();
		Sleep.sleep(2000);
	}
	@Test
	public void loginUserPositiveTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement usernameTextBox = driver.findElement(By.name("username"));
		//TODO get input from Excel
		usernameTextBox.clear();
		usernameTextBox.sendKeys("MyNewUser9899");
		
		WebElement passwordTextBox = driver.findElement(By.id("id_password"));
		//TODO get input from Excel
		passwordTextBox.clear();
		passwordTextBox.sendKeys("Login1234");
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));
		loginBtn.click();
		
		//To Be Removed
		//driver.get("https://dsportalapp.herokuapp.com/home");
		Sleep.sleep(2000);

		WebElement dsGetStartedLink = driver.findElement(By.xpath("//a[@href='data-structures-introduction']"));
		dsGetStartedLink.click();
		Sleep.sleep(2000);
	
		WebElement timeCompplexityLink = driver.findElement(ById.xpath("//a[contains(text(),'Time Complexity')]"));
		timeCompplexityLink.click();
		Sleep.sleep(2000);
		
		WebElement tryHereBtn = driver.findElement(ById.xpath("//a[contains(text(),'Try here>>>')]"));
		tryHereBtn.click();
		
		//WebElement codetextArea = driver.findElement(By.xpath("//div[@class='CodeMirror-scroll']"));
		//codetextArea.sendKeys("print 'Hello'");
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("print 'hello'");
		Sleep.sleep(2000);
		WebElement runButton = driver.findElement(ById.xpath("//button[contains(text(),'Run')]"));
		runButton.click();
		Sleep.sleep(2000);
		driver.navigate().back();
		Sleep.sleep(2000);
		WebElement practiceQuesLink = driver.findElement(ById.xpath("//a[contains(text(),'Practice Questions')]"));
		practiceQuesLink.click();
		Sleep.sleep(2000);
		WebElement nnLink = driver.findElement(ById.xpath("//a[contains(text(),'NumpyNinja')]"));
		nnLink.click();
		Sleep.sleep(2000);
		WebElement getStarted = driver.findElement(ById.xpath("//button[contains(text(),'Get Started')]"));
		getStarted.click();
		
		WebElement dsDropdown = driver.findElement(ById.xpath("//a[@data-toggle='dropdown']")); 
		//WebElement dsDropdown = driver.findElement(ById.xpath("//a[@class='nav-link dropdown-toggle']")); 
		dsDropdown.click();
		
		Sleep.sleep(2000);
		WebElement signOutLink = driver.findElement(ById.xpath("//a[contains(text(),'Sign out')]"));
		signOutLink.click();
		
	}
	
	
	
	
}
