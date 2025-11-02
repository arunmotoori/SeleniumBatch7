package commandspack;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoEight {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		Rectangle rect = driver.findElement(By.name("search")).getRect();
		
		System.out.println(rect.height);
		System.out.println(rect.width);
		System.out.println(rect.x);
		System.out.println(rect.y);
		
		driver.quit();

	}

}
