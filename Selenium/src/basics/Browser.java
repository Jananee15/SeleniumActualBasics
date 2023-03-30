package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Morad\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		//webDriver Methods
		//driver.manage().window().maximize();
		//get Method
		driver.get("https://www.facebook.com/");
		//getTitle
		String pageTitle= driver.getTitle();
		System.out.println("Page Title is: "+ pageTitle);
		//getCurrentURL()
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: "+ currentURL);
		Thread.sleep(5000);
		//quit
		driver.quit();
		
	}

}
