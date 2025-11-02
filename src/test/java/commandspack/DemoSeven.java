package commandspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSeven {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		String size = driver.findElement(By.xpath("//div[@id='cart']/button")).getCssValue("font-size");
		System.out.println(size);
		
//		String tag = driver.findElement(By.id("ta1")).getTagName();
//		
//		System.out.println(tag);
		
//		String htmlCode = driver.getPageSource();
//		
//		System.out.println(htmlCode);
		
		driver.quit();

	}

}
