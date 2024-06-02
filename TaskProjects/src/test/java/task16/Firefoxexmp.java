package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefoxexmp {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		//Create an instance of the WebDriver interface for the Firefox browser
		WebDriver driver= new FirefoxDriver();
		//Use the driver object to navigate to a website.
		driver.get("https://www.google.com/");
		//getting and storing current url of the opened website
		String url= driver.getCurrentUrl();
		System.out.println(url);
		//Closing the recently opened Website
		driver.close();
	}

}
