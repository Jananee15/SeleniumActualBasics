package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xPath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Morad\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='userId']"));
		email.sendKeys("Deepa@gmail.com");
		
		WebElement password= driver.findElement(By.xpath("//input[@class='selectors-input jsSelector'] [2]"));
		password.sendKeys("0123456789");
		
		
		
		
		
		
	}
}
