package org.dw;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DebugAndWaits extends Facebook{
	public static void main (String [] args ) throws Throwable {
	launch("https:\\www.facebook.com/");
	maximize();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	
	/* driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); */
	
	WebElement user = driver.findElement(By.id("email"));
	wait.until(ExpectedConditions.visibilityOf(user));
	WebElement pass = driver.findElement(By.id("pass"));
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	fill (user,"Sakthi");
	takeScreenshot("Username");
	fill (pass,"132456798");
	takeScreenshot("Password");
	click(login);
	takeScreenshot("Login Page");
}
}
