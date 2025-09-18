import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		
		String errorText = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(errorText);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Mel Gibson");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("John@Smith.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("something@mail.com");
		driver.quit();
	}
	

}
