package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class IdClassLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Morad\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://leafground.com/button.xhtml");
		
		Thread.sleep(3000);
		//WebElement firstName= driver.findElement(By.id("username"));
		//firstName.sendKeys("Jananee");
		
		//WebElement firstName= driver.findElement(By.cssSelector("#u_3_b_Bw"));
		//firstName.sendKeys("Jananee");
		//Thread.sleep(3000);
		//driver.findElement(By.id("password_step_input"))
		//driver.findElement(By.id("profession-0")).click();
		
		
		
		
	}

}
