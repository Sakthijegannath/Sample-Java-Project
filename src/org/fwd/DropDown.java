package org.fwd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver",
				"D:\\Sakthi\\Jegan\\Selenium\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		String expectedUrl = "https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
		driver.navigate().to(expectedUrl);
		driver.manage().window().maximize();
		
		WebElement Single = driver.findElement(By.xpath("(//select)[1]"));
		Select s = new Select(Single);
		Thread.sleep(1000);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("Apple");
		Thread.sleep(1000);
		s.selectByVisibleText("Yahoo");
		
		WebElement multiple = driver.findElement(By.xpath("(//select)[3]"));
		boolean multiple2 = s.isMultiple();
		System.out.println(multiple2);
		
		List<WebElement> options = s.getOptions();
		for(int i=0; i<options.size();i++) {
		WebElement element = options.get(i);
		String text = element.getText();
		System.out.println(text);
		}
		
		Select s1 = new Select (multiple);
		Thread.sleep(1000);
		s1.selectByIndex(0);
		Thread.sleep(1000);
		s1.selectByIndex(1);
		Thread.sleep(1000);
		s1.selectByIndex(2);
		Thread.sleep(1000);
		/* s1.deselectAll(); */
		
		WebElement first = s1.getFirstSelectedOption();
		String text = first.getText();
		System.out.println("First Selected Option : + "+text);
		
		List<WebElement> all = s1.getAllSelectedOptions();
		for(int i=0; i<all.size();i++) {
			WebElement element = all.get(i);
			String text2 = element.getText();
			System.out.println(text2);
		
}}}
