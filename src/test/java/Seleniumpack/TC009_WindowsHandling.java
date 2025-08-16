package Seleniumpack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC009_WindowsHandling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/window");
        driver.findElement(By.id("home")).click();
        String pwindow = driver.getWindowHandle();
        System.out.println("Parent window: " + pwindow);
        System.out.println("URL is: " + driver.getCurrentUrl());
    }
}
