package Seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TC002_Selenium {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("Automation testing tools");
		
		search.submit();
		System.out.println("tittle"+driver.getTitle());
		
		//driver.quit();
		//driver.findElement(By.name("btnk")).click();
		
	}

}
