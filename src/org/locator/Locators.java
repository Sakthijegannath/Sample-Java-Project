package org.locator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) throws Throwable {
		
		int count = 0;

		System.setProperty("webdriver.edge.driver",
				"D:\\Sakthi\\Jegan\\Selenium\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		String expectedUrl = "https://www.flipkart.com/";
		driver.navigate().to(expectedUrl);
		driver.manage().window().maximize();

		
	    WebElement user = driver.findElement(By.xpath("//button[text()='✕']"));
	    user.click();
	    
	    WebElement password = driver.findElement(By.name("q"));
	    password.sendKeys("Redmi mobiles");
	    
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	     Thread.sleep(5000);
     
	     List<WebElement> elements = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	    System.out.println(elements.size());
	    for (int i = 0; i < elements.size(); i++) {
			WebElement element = elements.get(i);
			String text = element.getText();
			count=count+1;
			WebElement elements2 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])["+ count +"]/../following-sibling::div/div[1]/div[1]/div[1]"));
			String text2 = elements2.getText();
			//System.out.println(text2);
			Map<String, String> mp = new HashMap<>();
			mp.put(text, text2);
			System.out.println(mp);
		}
	    driver.quit();
	}
}
