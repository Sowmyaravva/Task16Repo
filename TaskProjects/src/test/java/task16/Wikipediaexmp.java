package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wikipediaexmp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//Create an instance of the WebDriver interface for the Chrome browser
		WebDriver driver= new ChromeDriver();
		//Use the driver object to navigate to a website.
		driver.get("https://www.wikipedia.org/");
		//Maximize the opened website tab
		driver.manage().window().maximize();
		//Finding and storing search field
		WebElement searchfield= driver.findElement(By.id("searchInput"));
		//Sending text to Search field
		searchfield.sendKeys("Artificial Intelligence");
		searchfield.submit();
		//finding and stroing histroy section
		 WebElement historySection = driver.findElement(By.linkText("History"));
		 //performing click operation
	     historySection.click();
	     //getting and printing tittle of the history section
	     System.out.println("Title of the History section: " + driver.getTitle());

	        
	}

}
