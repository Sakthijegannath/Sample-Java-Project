package org.dw;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {
	static WebDriver driver;
	public static void launch(String expectedurl) {
	System.setProperty("webdriver.edge.driver","D:\\Sakthi\\Jegan\\Selenium\\Drivers\\edgedriver_win64\\msedgedriver.exe");
	driver = new EdgeDriver();
	driver.navigate().to(expectedurl);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void fill (WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void takeScreenshot (String screenshotName) throws Throwable {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File ("D:\\Sakthi\\Jegan\\11.07.22 - Action, Robot, screenshot\\screenshot7");
		FileUtils.copyFile(src, dest);
		}
}
