package com.sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {
	@Test
	public void print() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 Thread.sleep(3000);
		  js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		  Thread.sleep(3000);
		  js.executeScript("window.scrollBy(0,1000)");
		  Thread.sleep(3000);
		  js.executeScript("window.scrollBy(0,-1000)");
		  Thread.sleep(3000);
		  js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//h1[contains(text(),'JavaScript')]")));
		  
		  driver.close();
		  
		  
		  
		
	}

}
