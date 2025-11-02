package handlingmultiplewindowspack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOne {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String parentWindowId = driver.getWindowHandle();
		
		driver.findElement(By.id("ta1")).sendKeys("Arun Motoori");
		
		driver.findElement(By.id("selenium143")).click();
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Thread.sleep(2000);
		
		Set<String> windowsIds = driver.getWindowHandles();
		
		String text = null;
		
		for(String windowId : windowsIds) {
			
			driver.switchTo().window(windowId);
			
			if(driver.getTitle().equals("New Window")) {
				
				text = driver.findElement(By.xpath("//h3")).getText();
				
				break;
				
			}
			
		}
		
		System.out.println(text);
		
		driver.close();
		
		windowsIds = driver.getWindowHandles();
		
		for(String windowId : windowsIds) {
			
			driver.switchTo().window(windowId);
			
			if(driver.getTitle().equals("Selenium143")) {
				
				driver.findElement(By.linkText("What is Selenium?")).click();
				
				break;
				
			}
			
		}
		
		System.out.println(driver.getCurrentUrl());
		driver.close();

		driver.switchTo().window(parentWindowId);
		
		driver.findElement(By.id("ta1")).clear();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
