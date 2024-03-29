package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SkillraryLoginSteps {
	
	WebDriver driver;
	
	//Hooks
	@Before
	public void beforeScenarios() {
		WebDriverManager .chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Given("I enter to login page")
	public void i_enter_to_login_page() {
	    
	    driver.get("https://demoapp.skillrary.com/login.php?type=login");
	    
	}

	@When("I provide valid credentials")
	public void i_provide_valid_credentials() {
	    driver.findElement(By.id("email")).sendKeys("admin");
	    driver.findElement(By.id("password")).sendKeys("admin");
	}

	@And("I hit on login")
	public void i_hit_on_login() {
	    driver.findElement(By.id("last")).click();
	}

	@Then("I should navigate to home page")
	public void i_should_navigate_to_home_page() {
		try {
			driver.findElement(By.xpath("//span[text()='SkillRary Admin']"));
			System.out.println("Test Pass");
		} catch (Exception e) {
			System.out.println("Test Fail");
		}
//		WebElement home = driver.findElement(By.xpath("//a[text()=' Home']"));
//		if(home.isDisplayed())
//			System.out.println("Test Pass");
//		else
//			System.out.println("test Fail");	
	}
	
	@When("^I provide (.*) nd (.*)$")
	public void i_provide_admin_nd_admin(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@After
	public void afterScenario() {
		driver.quit();
	}
}
