package handlingalertspack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOne {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String alertText = alert.getText();
		
		System.out.println(alertText);
		
		alert.sendKeys("Arun Motoori");
		
		alert.accept();
		
		//alert.dismiss();
		
		//driver.findElement(By.linkText("Elemental Selenium")).click();

	}

}
