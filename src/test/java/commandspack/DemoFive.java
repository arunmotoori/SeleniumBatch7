package commandspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFive {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		boolean a = driver.findElement(By.xpath("//input[@value='Bike']")).isSelected();
		System.out.println(a); // false
		
		boolean b = driver.findElement(By.xpath("//input[@value='Bicycle']")).isSelected();
		System.out.println(b); // true
		
//		boolean a = driver.findElement(By.id("but2")).isEnabled();
//		System.out.println(a); // true
//		
//		boolean b = driver.findElement(By.id("but1")).isEnabled();
//		System.out.println(b); // false
		
//		boolean a = driver.findElement(By.id("but2")).isDisplayed();
//		System.out.println(a); // true
//		
//		boolean b = driver.findElement(By.id("but1")).isDisplayed();
//		System.out.println(b); // true
//		
//		boolean c = driver.findElement(By.id("hbutton")).isDisplayed();
//		System.out.println(c); // false
		
		driver.quit();

	}

}
