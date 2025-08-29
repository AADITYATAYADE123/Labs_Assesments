package Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Q2 {
	WebDriver driver;
  @Test
  public void f() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://the-internet.herokuapp.com/login");
	  
	  driver.findElement(By.id("username")).sendKeys("tomsmith");
	  driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	  driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
	  
	 WebElement abc = driver.findElement(By.xpath("//*[@id=\"flash\"]"));
	 if(abc.isDisplayed())
	 {
		 System.out.println("Login successsfully");
	 }
	 else
	 {
		 System.out.println("Login Failed");
	 }
}
}