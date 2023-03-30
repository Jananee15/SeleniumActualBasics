package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelectorsHubex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Morad\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		/*driver.findElement(By.id("userId")).sendKeys("jananee1595@gmail.com");
		Thread.sleep(1000);
		WebElement passWord = driver.findElement(By.id("pass"));
		passWord.sendKeys("0123456789");
		WebElement company = driver.findElement(By.className("form-control"));
		company.sendKeys("Skillpits");
		WebElement mobile= driver.findElement(By.name("mobile number"));
		mobile.sendKeys("0123456789");*/
		
		//absolute Xpath:
		driver.findElement(By.xpath("/html/body/div/main/div/div[1]/section[2]/div/div[1]/div/div[1]/div/form/div/input[1]")).sendKeys("Jananee");
		
		//RelativeX-path:
		
		
	}

}
