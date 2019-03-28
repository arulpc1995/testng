package org.mav.prj.sam.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg {
@Parameters({"Url","Username","Email","Password"})

	@Test
	public void Testcase(String u,String n,String e,String p) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "E:\\testng\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(u);
	/*driver.findElement(By.id("user[login]")).sendKeys(n);
	driver.findElement(By.id("user[email]")).sendKeys(e);
	driver.findElement(By.id("user[password]")).sendKeys(p);
	driver.findElement(By.xpath("(//button[text()='Sign up for GitHub'])[1]")).click();*/
	driver.findElement(By.xpath("           //a[@class='HeaderMenu-link no-underline mr-3']")).click();
	
	driver.findElement(By.id("login_field")).sendKeys(n);
	driver.findElement(By.id("password")).sendKeys(p);
driver.findElement(By.xpath("           //input[@type='submit']")).click();
	}


}
