package org.screenshotclass;

import java.io.File;
import java.io.IOException;
//import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\master\\eclipse-workspace\\ScreenShot\\Chrome Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		System.out.println(screenshotAs);
		
		File file = new File("C:\\Users\\master\\Pictures\\Camera Roll\\home.png");
		
		FileUtils.copyFile(screenshotAs, file);
		
		WebElement txtlast = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		
		txtlast.sendKeys("Krishnaa");
		
		File screenshotAs2 = txtlast.getScreenshotAs(OutputType.FILE);
		
		File file1 = new File("C:\\Users\\master\\Pictures\\Camera Roll\\aravind.png");
		
		org.openqa.selenium.io.FileHandler.copy(screenshotAs2, file1);
	}
	
	
	
}
