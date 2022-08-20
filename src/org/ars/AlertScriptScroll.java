package org.ars;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertScriptScroll {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver",
				"D:\\Sakthi\\Jegan\\Selenium\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		String expectedUrl = "https://www.facebook.com/";
		driver.navigate().to(expectedUrl);
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].setAttribute('value','Selenium')",user);
		Object text = j.executeScript("return arguments[0].getAttribute('value')", user);
		System.out.println(text);
		j.executeScript("arguments[0].setAttribute('value','Selenium')",password);
		/* j.executeScript("arguments[0].click()", login); */
		WebElement down = driver.findElement(By.linkText("Careers"));
		j.executeScript("arguments[0].scrollIntoView(true)",down);
		Thread.sleep(3000);
		j.executeScript("arguments[0].scrollIntoView(false)",user);

		
		
		
		
		
		
		
		
		/*
		 * driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		 * Thread.sleep(2000); Alert a = driver.switchTo().alert(); a.accept();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		 * Thread.sleep(2000); a.dismiss();
		 * 
		 * JavascriptExecutor j = (JavascriptExecutor)driver; WebElement down =
		 * driver.findElement(By.xpath("//button[@id='confirmButton']"));
		 * j.executeScript("arguments[0].scrollIntoView(true)", down);
		 * 
		 * driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		 * Thread.sleep(2000); String text = a.getText(); System.out.println(text);
		 * a.sendKeys("Selenium"); a.accept();
		 * 
		 * WebElement a1 = driver.findElement(By.xpath("(//span) [52]")); String
		 * attribute =a1.getAttribute("innerText"); System.out.println(attribute);
		 */

	}
}
