package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class modelingstep {
	WebDriver driver;
  

	@Given("browser is open")
	public void browser_is_open() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
  driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjY3MDI2MTIyLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D");		
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
  driver.findElement(By.id("email")).sendKeys("chiruc008@gmail.com");	
  driver.findElement(By.id("pass")).sendKeys("918294middi");

		
		
	}

	@And("hits login button")
	public void hits_login_button() {
		driver.findElement(By.name("login")).click();

		
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() throws InterruptedException {
		Thread.sleep(1000);
		
	}















}
