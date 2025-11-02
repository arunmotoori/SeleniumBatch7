package commandspack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoNine {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
//		WebElement textAreaField = driver.findElement(By.id("ta1"));
//		
//		textAreaField.sendKeys("Arun Motoori");
		
//		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement link : links) {
			System.out.println(link.getText());
		}
		
		driver.quit();

	}

}
