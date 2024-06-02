package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chromeexmple {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//Create an instance of the WebDriver interface for the Chrome browser
		WebDriver driver= new ChromeDriver();
		//Use the driver object to navigate to a website.
		driver.get("https://www.demoblaze.com/");
		//For maximizing the opened website tab
		driver.manage().window().maximize();
		//For getting tittle of opened Website and stroing that tittle into referrenced variable
		String tittle= driver.getTitle();
		if(tittle== "STORE") {
			
			System.out.println("Page landed on correct website ");
			
		}
		else {
			System.out.println("Page landed on wrong website");
		}
		}

	}


