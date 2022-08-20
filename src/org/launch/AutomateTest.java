package org.launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateTest {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver","D:\\Sakthi\\Jegan\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String expectedUrl = "https://www.facebook.com/";
		driver.navigate().to(expectedUrl);

		WebElement user = driver.findElement(By.xpath("(//input) [3]"));
		user.sendKeys("Sakthi@123");
		String attribute = user.getAttribute("value");
		 System.out.println(attribute);
		
		  WebElement password = driver.findElement(By.name("pass"));
		  password.sendKeys("hsadgfa");
		  
		  List<WebElement> elements = driver.findElements(By.tagName("a"));
		  System.out.print(elements.size());
		  for(int i=0; i <elements.size(); i++) {
			  WebElement element = elements.get(i);
			  String text = element.getText();
			  System.out.println(text);
		  }
		  
		  		  
		  // X path ---- //tagname[@attribute name ='attributevalue']
		/*
		 * WebElement login =
		 * driver.findElement(By.xpath("(//div[@ class='_6ltg'])[1]")); login.click();
		 */

		/*
		 * WebElement login = driver.findElement(By.xpath("//button[text()='Log In']"));
		 * login.click();
		 */ 
	
		/*
		 * WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		 * login.click();
		 */
		/*
		 * WebElement login =
		 * driver.findElement(By.xpath("(//button[text()='Log In']")); login.click();
		 */
		  
		/*
		 * WebElement login =
		 * driver.findElement(By.xpath("(//button[containstext()='Log']"));
		 * login.click();
		 */
 
			  
		

		/*
		 * WebElement login = driver.findElement(By.tagName("button")); login.click();
		 * 
		 * WebElement login = driver.findElement(By.partialLinkText("Log"));
		 * login.click();
		  
		 * List<WebElement> element = driver.findElements(By.tagName("a"));
		 * System.out.print(element.size());
		 */

		/*
		 * driver.manage().window().maximize(); Thread.sleep(1500);
		 * driver.navigate().back(); Thread.sleep(1500); driver.navigate().forward();
		 * Thread.sleep(1500); driver.navigate().refresh(); String CurrentUrl =
		 * driver.getCurrentUrl(); if(expectedUrl.equals(CurrentUrl)) {
		 * System.out.println("Same URL is fetched"); } else {
		 * System.out.println("Same URL is not fetched"); } String title =
		 * driver.getTitle(); if(title.contains("Online Shopping")) {
		 * System.out.println("Title is verified"); } else {
		 * System.out.println("Title is not verified"); } driver.quit();
		 * 
		 */

	}

}
