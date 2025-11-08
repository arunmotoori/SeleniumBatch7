package handlingframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoThree {

	public static void main(String[] args) {
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement iframeOne = driver.findElement(By.xpath("//iframe[@src='https://selenium143.blogspot.com/']"));
		
		driver.switchTo().frame(iframeOne);
		
		driver.findElement(By.linkText("What is Selenium?")).click();

	}

}
