package org.ars;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionRobotScreenshot {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver","D:\\Sakthi\\Jegan\\Selenium\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		String expectedUrl = "https://demoqa.com/alerts";
		driver.navigate().to(expectedUrl);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert();
		a.accept();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(2000); 
		a.dismiss();
		  
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(2000);

		String text = a.getText();
		System.out.println(text);
		a.sendKeys("Selenium");
		a.accept();
		
		
		
		
		
		
		
		/*
		 * String expectedUrl = "https://demo.guru99.com/test/drag_drop.html";
		 * driver.navigate().to(expectedUrl); driver.manage().window().maximize();
		 * 
		 * 
		 * 
		 * WebElement source =
		 * driver.findElement(By.xpath("//a[contains(text(),'BANK')]")); WebElement
		 * target= driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		 * 
		 * Actions acc = new Actions(driver); acc.dragAndDrop(source,target).perform();
		 * 
		 * WebElement source1 =
		 * driver.findElement(By.xpath("//a[contains(text(),'5000')][4]")); WebElement
		 * target1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		 * 
		 * Actions acc1 = new Actions(driver);
		 * acc1.dragAndDrop(source1,target1).perform();
		 * 
		 * WebElement source2 =
		 * driver.findElement(By.xpath("//a[contains(text(),'SALES')]")); WebElement
		 * target2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		 * 
		 * Actions acc2 = new Actions(driver);
		 * acc2.dragAndDrop(source2,target2).perform();
		 * 
		 * WebElement source3 =
		 * driver.findElement(By.xpath("//a[contains(text(),'5000')][4]")); WebElement
		 * target3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		 * 
		 * Actions acc3 = new Actions(driver);
		 * acc3.dragAndDrop(source3,target3).perform();
		 * 
		 * TakesScreenshot tk = (TakesScreenshot)driver; File src =
		 * tk.getScreenshotAs(OutputType.FILE); File dest = new
		 * File("D:\\Sakthi\\Jegan\\11.07.22 - Action, Robot, screenshot\\DragandDrop");
		 * FileUtils.copyFile(src, dest);
		 */
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		/*
		 * WebElement user = driver.findElement(By.xpath("//button[text()='✕']"));
		 * user.click();
		 */
		   
	    
		/*
		 * Actions acc = new Actions(driver); acc.doubleClick(user).perform();
		 * acc.contextClick(user).perform();
		 * 
		 * Robot r = new Robot(); for (int i=0; i<3; i++) {
		 * r.keyPress(KeyEvent.VK_DOWN); r.keyRelease(KeyEvent.VK_DOWN); }
		 * r.keyPress(KeyEvent.VK_ENTER); r.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * r.keyPress(KeyEvent.VK_TAB); r.keyRelease(KeyEvent.VK_TAB);
		 * 
		 * Thread.sleep(3000); r.keyPress(KeyEvent.VK_CONTROL);
		 * r.keyPress(KeyEvent.VK_V); r.keyRelease(KeyEvent.VK_CONTROL);
		 * r.keyRelease(KeyEvent.VK_V);
		 */
	    
	    
	    
		/* acc.moveToElement(more).perform(); */
	    
	}

}
