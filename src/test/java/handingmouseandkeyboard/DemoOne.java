package handingmouseandkeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoOne {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Actions actions = new Actions(driver);
		
		WebElement blogsMenuOption = driver.findElement(By.id("blogsmenu"));
		
		actions.moveToElement(blogsMenuOption).perform();
		
		WebElement seleniumByArunOption = driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));

		actions.moveToElement(seleniumByArunOption).click().perform();
	}

}
