package standalone.dsalgoproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.Sleep;

public class QueueTestSuite {

	private static WebDriver driver = new ChromeDriver();

	@Test
	public void clickGetStarted() {
		driver.get("https://dsportalapp.herokuapp.com");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Sleep.sleep();
		WebElement getStarted = driver.findElement(ById.xpath("//button[contains(text(),'Get Started')]"));
		getStarted.click();
	}

	@Test
	public void clickSignIn() {
		WebElement signInLink = driver.findElement(ById.xpath("//a[contains(text(),'Sign in')]"));
		signInLink.click();
		Sleep.sleep();
	}

	@Test
	public void loginUserPositiveTest() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement usernameTextBox = driver.findElement(By.name("username"));
		// TODO get input from Excel
		usernameTextBox.clear();
		usernameTextBox.sendKeys("MyNewUser9899");
		Sleep.sleep();

		WebElement passwordTextBox = driver.findElement(By.id("id_password"));
		// TODO get input from Excel
		passwordTextBox.clear();
		passwordTextBox.sendKeys("Login1234");
		Sleep.sleep();

		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));
		loginBtn.click();

		// To Be Removed
		// driver.get("https://dsportalapp.herokuapp.com/home");
		Sleep.sleep();

		driver.findElement(By.xpath("//a[@href='queue']")).click();
		Sleep.sleep();

		driver.findElement(ById.xpath("//a[@href='implementation-lists']")).click();
		Sleep.sleep();

		driver.findElement(ById.xpath("//a[@href='/tryEditor']")).click();
		Sleep.sleep();
		
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("print 'Implementation of Queue in Python'");
		Sleep.sleep();

		driver.findElement(ById.xpath("//button[contains(text(),'Run')]")).click();
		Sleep.sleep();
		
		driver.navigate().back();
		Sleep.sleep();
		
		driver.findElement(ById.xpath("//a[contains(text(),'Implementation using collections.deque')]")).click();

		Sleep.sleep();

		driver.findElement(ById.xpath("//a[contains(text(),'Try here>>>')]")).click();
		Sleep.sleep();
		
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("print 'Implementation using collections.deque'");
		Sleep.sleep();

		driver.findElement(ById.xpath("//button[contains(text(),'Run')]")).click();
		Sleep.sleep();
		
		driver.navigate().back();
		Sleep.sleep();

		driver.findElement(ById.xpath("//a[contains(text(),'Implementation using array')]")).click();
		Sleep.sleep();
		
		driver.findElement(ById.xpath("//a[@href='/tryEditor']")).click();
		Sleep.sleep();
				
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("print 'Implementation using array'");
		
		driver.findElement(ById.xpath("//button[contains(text(),'Run')]")).click();
		Sleep.sleep();
		
		driver.navigate().back();
		Sleep.sleep();
		
		driver.findElement(ById.xpath("//a[contains(text(),'Queue Operations')]")).click();
		Sleep.sleep();
		
		driver.findElement(ById.xpath("//a[@href='/tryEditor']")).click();
		Sleep.sleep();
				
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("print 'Queue Operations'");
		
		driver.findElement(ById.xpath("//button[contains(text(),'Run')]")).click();
		Sleep.sleep();
		
		driver.navigate().back();
		Sleep.sleep();
				
		driver.findElement(ById.xpath("//a[contains(text(),'Practice Questions')]")).click();
		Sleep.sleep();
		driver.navigate().back();
	}

}
