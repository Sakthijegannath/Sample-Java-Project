package org.fwd;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FramesWindowHandlingDefaultcontent {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver",
				"D:\\Sakthi\\Jegan\\Selenium\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		String expectedUrl = "https://www.flipkart.com/";
		driver.navigate().to(expectedUrl);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Redmi Mobiles", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String>child = driver.getWindowHandles();
		System.out.println(child);
		List<String> multiwindow = new ArrayList<>(child);
		driver.switchTo().window(multiwindow.get(1));
		
		String element = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
		System.out.println(element);
		}
		
		
		
		/*
		 * driver.switchTo().frame("frame1"); driver.switchTo().frame("frame3");
		 * driver.findElement(By.xpath("//input[@id='a']")).click();
		 * 
		 * driver.switchTo().parentFrame(); WebElement element =
		 * driver.findElement(By.xpath("//b[@id='topic']")); String text =
		 * element.getText(); System.out.println(text);
		 * 
		 * driver.switchTo().parentFrame(); WebElement element1 =
		 * driver.findElement(By.xpath("(//span) [3]")); String text1 =
		 * element1.getText(); System.out.println(text1);
		 */
		

}
