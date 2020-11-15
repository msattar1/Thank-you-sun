package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class xPath_2_LastName {
	
	@Test
	public void xpath_example1() throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();		
		driver.get("http://borkotmicrotechna.com/Assertion/");
		
		Thread.sleep(17000);
		
		driver.findElement(By.id("text2")).sendKeys("Borkot Chowdhury");		
		driver.findElement(By.name("lname")).clear();		
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Sattar Bhai");
		
		
		
	}

}
