package stepDefination;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks{
	WebDriver driver;
	
	@Before
	public void setUp() {
		 System.setProperty("webdriver.gecko.driver","D:\\Users\\Temp\\eclipse-workspace\\CucumberJunit\\src\\test\\resources\\webdrivers\\geckodriver.exe" );
	      driver = new FirefoxDriver();
		  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@When("user opens URL {string}")
	public void user_opens_url(String string) throws Exception{
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		String t = driver.getTitle();
		System.out.println(driver.getTitle());
	Thread.sleep(100);
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String username, String password) throws Exception{
		 driver.findElement(By.name("username")).sendKeys(username);  
	     driver.findElement(By.name("password")).sendKeys(password);
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		 Thread.sleep(100);
	}
	

@When("login should be successful")
	public void login_should_be_successful() { 
	
		if(driver.getCurrentUrl().contains("index.php")) {
			System.out.println("test pass");}
		else {
			System.out.println("test failed");
		}
}
	

	@Then("user clicks on user dropdown and on logout button")
	public void user_clicks_on_user_dropdown_and_on_logout_button() throws Exception {
	 driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
	
	driver.findElement(By.xpath("//a[@href=\"/web/index.php/auth/logout\"]" )).click();
	
	}
	
	@After
	public void cleanUp() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.quit();
	   
	}
	

}
