package commandspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTwo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String buttonLabel = driver.findElement(By.xpath("//input[@class='gsc-search-button']")).getAttribute("value");
		System.out.println(buttonLabel);
		
//		String text = driver.findElement(By.xpath("//input[@class='gsc-search-button']")).getText();
//		System.out.println(text);
		
		
//		String text = driver.findElement(By.id("pah")).getText();
//		System.out.println(text);
		
		//driver.findElement(By.id("textbox1")).clear();

	}

}
