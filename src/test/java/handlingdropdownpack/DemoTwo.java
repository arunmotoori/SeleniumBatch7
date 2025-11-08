package handlingdropdownpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoTwo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement listBoxField = driver.findElement(By.id("multiselect1"));
		
		Select select = new Select(listBoxField);
		
		select.selectByVisibleText("Hyundai");
		select.selectByIndex(0);
		select.selectByValue("swiftx");
		select.selectByIndex(3);
		
//		select.deselectByVisibleText("Audi");
//		select.deselectByIndex(2);
//		select.deselectByValue("volvox");
		
		select.deselectAll();
		

	}

}
