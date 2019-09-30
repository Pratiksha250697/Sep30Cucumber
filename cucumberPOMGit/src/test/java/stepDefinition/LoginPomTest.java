package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPomTest 
{
	WebDriver driver;

@Given("user is on HerokuApp")
public void user_is_on_HerokuApp() 
{
	System.out.println("User is on Home Page");
	System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
	driver= new ChromeDriver(); 
	driver.get("http://the-internet.herokuapp.com/login"); 
	driver.manage().window().maximize();   
}

@When("user enters username and password")
public void user_enters_username_and_password()
{
	LoginOR obj=new LoginOR(driver);
	obj.usern.sendKeys("tomsmith");
	obj.pass.sendKeys("SuperSecretPassword!");
	obj.login.click();
	
	/*driver.findElement(By.id("username")).sendKeys("tomsmith");
	driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
	driver.findElement(By.className("radius")).click();*/
}

@Then("user logged in successfully")
public void user_logged_in_successfully() throws InterruptedException 
{
	System.out.println("user logged in successfully");
	Thread.sleep(3000);
	driver.close();
}
}
