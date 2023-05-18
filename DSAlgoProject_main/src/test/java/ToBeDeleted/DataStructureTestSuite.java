package ToBeDeleted;

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//To Be Removed
		//driver.get("https://dsportalapp.herokuapp.com/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		WebElement dsGetStartedLink = driver.findElement(By.xpath("//a[@href='data-structures-introduction']"));
		dsGetStartedLink.click();
		Sleep.sleep();
		WebElement timeCompplexityLink = driver.findElement(ById.xpath("//a[contains(text(),'Time Complexity')]"));
		timeCompplexityLink.click();
		
	}
	
	@Test
	public void clickDSGetStarted() {
		

		driver.get("https://dsportalapp.herokuapp.com/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement signInLink = driver.findElement(By.xpath("//a[@href='data-structures-introduction']"));
		signInLink.click();
		
		//WebElement getStarted = driver.findElement(By.xpath("//a[contains(@href,'data-structures-introduction')]"));
		//WebElement getStarted2 = driver.findElement(By.linkText("data-structures-introduction"));
		//WebElement getStarted3 = driver.findElement(By.xpath("//a[@href='data-structures-introduction']"));
		//WebElement getStarted4 = 	driver.findElement(By.cssSelector("a[href=(data-structures-introduction)]"));
		//WebElement getStarted5 = driver.findElement(By.xpath("//a[contains(@href,'structures')]"));
		
		//WebElement getStarted6 = driver.findElement(By.partialLinkText("Get"));
				
		//WebElement getStarted7 = driver.findElement(By.cssSelector("a[href*='data-structures-introduction']"));
		
		
		//getStarted.click();
		//WebElement getStarted3 = driver.findElement(By.xpath("//a[@href='https://dsportalapp.herokuapp.com/data-structures-introduction']"));
		
		//WebElement getStarted8 = driver.findElement(ById.xpath("//a[contains(text(),'Get Started')]"));
		//WebElement getStarted9 = driver.findElement(By.linkText("Array"));
		//WebElement getStarted19 = driver.findElement(By.linkText("Get Started"));
		//List<WebElement> getStarted191 = driver.findElements(By.linkText("Get Started"));
		
		//driver.findElement(By.xpath("//a[@href='data-structures-introduction']")).click();
		

		
	}
	
	@Test
	public void clickTimeComplexity() {
		Sleep.sleep();
		WebElement timeCompplexityLink = driver.findElement(ById.xpath("//a[contains(text(),'Time Complexity')]"));
		timeCompplexityLink.click();
		
	}
	/*
	@Test
	public void clickTryHere() {
		Sleep.sleep();
		WebElement tryHereBtn = driver.findElement(ById.xpath("//a[contains(text(),'Try here>>>')]"));
		tryHereBtn.click();
		
	}
	
	@Test
	public void tryDataStruture() {
		WebElement codetextArea = driver.findElement(By.xpath("//textarea[@id='editor']"));
		codetextArea.sendKeys("print 'Hello'");
		
		WebElement runButton = driver.findElement(ById.xpath("//button[contains(text(),'Run')]"));
		runButton.click();
	}
	
    public void clickPracticeQues() {
		
	}
	
    public void navigateToArray() {
    	
    }

*/
}
