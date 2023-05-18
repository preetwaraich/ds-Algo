package standalone.dsalgoproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.Sleep;

public class ArrayTestSuite {

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

		driver.findElement(By.xpath("//a[@href='array']")).click();
		Sleep.sleep();

		driver.findElement(ById.xpath("//a[@href='arrays-in-python']")).click();
		Sleep.sleep();

		driver.findElement(ById.xpath("//a[@href='/tryEditor']")).click();
		Sleep.sleep();
		//driver.findElement(By.xpath("//div[@class='CodeMirror-scroll']")).sendKeys("print 'I am an Array in Python'");
		//Sleep.sleep();
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("print 'I am an Array in Python'");
		Sleep.sleep();

		driver.findElement(ById.xpath("//button[contains(text(),'Run')]")).click();
		Sleep.sleep();
		
		driver.navigate().back();
		Sleep.sleep();
		
		driver.findElement(ById.xpath("//a[contains(text(),'Arrays Using List')]")).click();

		Sleep.sleep();

		driver.findElement(ById.xpath("//a[contains(text(),'Try here>>>')]")).click();
		Sleep.sleep();
		//WebElement textField = driver.findElement(By.xpath("//div[@class='CodeMirror-scroll']"));
		//new Actions(driver).sendKeys(textField, "print 'I am an Array using List'!");
		//Sleep.sleep();
		// driver.findElement(By.xpath("//div[@class='CodeMirror-scroll']")).sendKeys("print
		// 'I am an Array using List'");
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("print 'I am an Array  using List!'");
		Sleep.sleep();

		driver.findElement(ById.xpath("//button[contains(text(),'Run')]")).click();
		Sleep.sleep();
		
		driver.navigate().back();
		Sleep.sleep();

		driver.findElement(ById.xpath("//a[contains(text(),'Basic Operations in Lists')]")).click();
		Sleep.sleep();
		
		driver.findElement(ById.xpath("//a[@href='/tryEditor']")).click();
		Sleep.sleep();
		
		driver.findElement(ById.xpath("//button[contains(text(),'Run')]")).click();
		Sleep.sleep();
		
		driver.navigate().back();
		Sleep.sleep();
		
		driver.findElement(ById.xpath("//a[contains(text(),'Applications of Array')]")).click();
		Sleep.sleep();
		
		driver.findElement(ById.xpath("//a[contains(text(),'Try here>>>')]")).click();
		Sleep.sleep();
		
		//driver.findElement(By.xpath("//div[@class='CodeMirror-scroll']")).sendKeys("print'I am in Application of Array'");
		//Sleep.sleep();
		driver.findElement(By.xpath("//form[@id='answer_form']/div/div/div/textarea")).sendKeys("print 'I am in Application of Array!'");
		Sleep.sleep();
		
		driver.findElement(ById.xpath("//button[contains(text(),'Run')]")).click();
		Sleep.sleep();
		
		driver.navigate().back();
		
		driver.findElement(ById.xpath("//a[contains(text(),'Practice Questions')]")).click();
		Sleep.sleep();
		driver.findElement(ById.xpath("//a[@href='/question/1']")).click();
		Sleep.sleep();
		driver.navigate().back();
		driver.findElement(ById.xpath("//a[@href='/question/2']")).click();
		Sleep.sleep();
		driver.navigate().back();
		driver.findElement(ById.xpath("//a[@href='/question/3']")).click();
		Sleep.sleep();
		driver.navigate().back();
		driver.findElement(ById.xpath("//a[@href='/question/4']")).click();
		Sleep.sleep();
		driver.navigate().back();
		Sleep.sleep();
		driver.navigate().back();
		
	
	
		/*
		 * WebElement nnLink =
		 * driver.findElement(ById.xpath("//a[contains(text(),'NumpyNinja')]"));
		 * nnLink.click(); Sleep.sleep(); WebElement getStarted =
		 * driver.findElement(ById.xpath("//button[contains(text(),'Get Started')]"));
		 * getStarted.click();
		 * 
		 * WebElement dsDropdown =
		 * driver.findElement(ById.xpath("//a[@data-toggle='dropdown']")); //WebElement
		 * dsDropdown =
		 * driver.findElement(ById.xpath("//a[@class='nav-link dropdown-toggle']"));
		 * dsDropdown.click();
		 * 
		 * Sleep.sleep(); WebElement signOutLink =
		 * driver.findElement(ById.xpath("//a[contains(text(),'Sign out')]"));
		 * signOutLink.click();
		 */

	}

}
