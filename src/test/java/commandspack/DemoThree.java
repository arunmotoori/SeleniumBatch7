package commandspack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoThree {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		String pageURL = driver.getCurrentUrl();
		System.out.println(pageURL);
		
		//driver.close();
		driver.quit();

	}

}
