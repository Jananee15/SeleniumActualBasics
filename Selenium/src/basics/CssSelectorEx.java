package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CssSelectorEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Morad\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://demo.automationtesting.in/Index.html  ");
		
		driver.findElement(By.cssSelector("#enterimg")).click();
		
		WebElement firstName=driver.findElement(By.cssSelector("input[ng-model='FirstName']"));
		firstName.sendKeys("Deepa");
		
		WebElement lastName = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		lastName.sendKeys("Aravindan");
		
		
	}
	
	
}
