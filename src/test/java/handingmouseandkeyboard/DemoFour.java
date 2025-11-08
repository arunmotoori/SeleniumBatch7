package handingmouseandkeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoFour {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Actions actions = new Actions(driver);
		
		WebElement compendiumDevLink = driver.findElement(By.linkText("compendiumdev"));
		WebElement onlyTestBlogLink = driver.findElement(By.linkText("onlytestingblog"));
		WebElement testWiselfLink = driver.findElement(By.linkText("testwisely"));
		WebElement jqueryUILink = driver.findElement(By.linkText("jqueryui"));
		WebElement automatedTesterLink = driver.findElement(By.linkText("theautomatedtester"));
		
		
		actions.keyDown(Keys.CONTROL)
		.click(compendiumDevLink)
		.click(onlyTestBlogLink)
		.click(testWiselfLink)
		.click(jqueryUILink)
		.click(automatedTesterLink)
		.keyUp(Keys.CONTROL)
		.perform();
		
		

	}

}
