package commandspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFour {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("selenium143")).click();
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
