package view;

import org.openqa.selenium.WebDriver;

public class NaLoginPage {
	
	private WebDriver driver;
	private static final String URL = "http://java.cyclone2.khleuven.be:38034/bmi/faces/login.xhtml";
	
	public NaLoginPage(WebDriver driver){
		this.driver = driver;
		driver.get(URL);
	}
	
}
