package com.sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyWordEvents {
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		WebElement link=driver.findElement(By.xpath("//nav[@id='navbar']/a[text()='Documentation']"));
		  Actions act=new Actions(driver);
		 // act.moveToElement(text).click().keyDown(text, Keys.SHIFT).sendKeys("madhuri jasti").keyUp(Keys.SHIFT).build().perform();;
		act.keyDown( Keys.CONTROL).keyDown( Keys.SHIFT).click(link).keyUp( Keys.CONTROL).keyUp( Keys.SHIFT).build().perform();
		  Thread.sleep(3000);
		  driver.close();
		
	}

}
