package org.fwd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver",
				"D:\\Sakthi\\Jegan\\Selenium\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		String expectedUrl = "https://www.techlistic.com/p/demo-selenium-practice.html";
		driver.navigate().to(expectedUrl);
		driver.manage().window().maximize();
		
		List<WebElement> Table = driver.findElements(By.tagName("table"));
		for(int i=0 ; i<Table.size();i++) {
			WebElement table = Table.get(i);
			WebElement tBody = table.findElement(By.tagName("tbody"));
			List<WebElement> Row = tBody.findElements(By.tagName("tr"));
				for(int j=0 ; j<Row.size();j++) {
				WebElement row = Row.get(j);
				List<WebElement> Data = row.findElements(By.tagName("td"));				
				for(int k=0 ; k<Data.size();k++) {
				WebElement data = Data.get(k);
				String text = data.getText();
				if(text.equals("Mecca")) {
					System.out.println("Given Text Is Present");
					System.out.println("Row No:"+j);
					System.out.println("Column No:"+j);
				}
				
				}
		}
		

}}}
