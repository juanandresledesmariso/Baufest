package StepDefinitions;


import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;


public class UserData {
	
	WebDriver driver = null;
	int number = new Random().nextInt(11);
	String username = "jledesma";
	String password = "baufest_challenge";
	
	
	@Given("browser is open")
		public void browser_is_open() 
		{		
			//System.out.println("Current Step: Browser is open");
			System.getProperty("webdriver.chrome.driver", "/BaufestCucumber/src/test/resources/Drivers/chromedriver");		
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	
	@And("user is on sign up page")
		public void user_is_on_sign_up_page() 
		{		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//System.out.println("Current Step: User is on login page");
			driver.navigate().to("https://www.demoblaze.com/index.html");
			driver.findElement(By.id("signin2")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}	
			
	@And("user is on login page")
		public void user_is_on_login_page() 
		{		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//System.out.println("Current Step: User is on login page");
			driver.navigate().to("https://www.demoblaze.com/index.html");
			driver.findElement(By.id("login2")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

	@And("user enters sign up username and password")
	public void user_enters_sign_up_username_and_password() 
		{		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//System.out.println("Current Step: User enters correct username and password");
			driver.findElement(By.id("sign-username")).sendKeys(username+number);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("sign-password")).sendKeys(password);
		}	
	
	@And("user enters login username and password")
		public void user_enters_login_username_and_password() 
		{					
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//System.out.println("Current Step: User enters correct username and password");
			driver.findElement(By.id("loginusername")).sendKeys(username);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("loginpassword")).sendKeys(password);
		}	
	
	@When("user clicks on sign up button")
		public void user_clicks_on_sign_up_button() 
		{		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//System.out.println("Current Step: User clicks on login button");
			driver.findElement(By.xpath("//button[text()='Sign up']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		}

	@When("user clicks on login button")
		public void user_clicks_on_login_button() 
		{		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//System.out.println("Current Step: User clicks on login button");
			driver.findElement(By.xpath("//button[text()='Log in']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}

	@Then("user is redirected to the home page")
		public void user_is_redirected_to_the_home_page() 
		{		
			//System.out.println("Current Step: User is redirected to the home pag");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.close();
		}
	
	@Then("user add a new item to cart")
		public void user_selects_new_item() 
		{		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}	
	
	@And("user verifies the item in the cart")
		public void user_verify_item_cart() 
		{		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//a[@href='#']")).click();
			driver.close();
		}
}
