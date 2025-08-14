package Seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_Selenium {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		//setup
		WebDriver driver = new ChromeDriver();
		//connection
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\r\n");
		
		String tittle = driver.getTitle();
		System.out.println("thid tittle is : "+tittle);
		Thread.sleep(3000);
	//	WebElement username = driver.findElement(By.name("username"));
	//	username.sendKeys("Admin");
	
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}
	

}
