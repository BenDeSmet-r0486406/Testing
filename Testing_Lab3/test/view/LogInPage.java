package view;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	private WebDriver driver;
	private static final String URL = "http://java.cyclone2.khleuven.be:38034/bmi";
	
	public LogInPage(WebDriver driver){
		this.driver = driver;
		driver.get(URL);
	}
	
	public void setUserName(String username){
		WebElement UserNameField = driver.findElement(By.id("loginForm:personId"));
		UserNameField.clear();
		UserNameField.sendKeys(username);
	}
	
	public void setPassword ( String password){
		WebElement passwordField = driver.findElement(By.id("loginForm:password"));
		passwordField.clear();
		passwordField.sendKeys(password);
	}
	
	public NaLoginPage confirm(){
		WebElement loginButton=driver.findElement(By.id("loginForm:login"));
		loginButton.click();
		return new NaLoginPage(driver);
	}
}
