package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TagAndLinkTextExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Morad\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://selectorshub.com/xpath-practice-page/ ");
		//TageName
		WebElement tagName=driver.findElement(By.tagName("h3"));
		String s =tagName.getText();
		System.out.println("The text on this tag is " + s);
		
		//LinkText
		WebElement linkText = driver.findElement(By.linkText("Consider a small Donation and support this page."));
		linkText.click();
		String s1 =linkText.getText();
		System.out.println("The text on this tag is " + s1);
		
		
		
		WebElement partialLink= driver.findElement(By.partialLinkText("Youtube Channel"));
		partialLink.click();
		String s2 =partialLink.getText();
		System.out.println("The text on this tag is " + s2);
		
	}

}
