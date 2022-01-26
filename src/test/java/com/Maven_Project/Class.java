package com.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class extends Baseclass {
	public static void main(String[] args) throws Throwable {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		broswerLanuch("chrome");
	//	driver.get("http://demo.automationtesting.in/Alerts.html");
		geturl("http://demo.automationtesting.in/Alerts.html");
		WebElement a = driver.findElement(By.className("analystic"));
	//	a.click();
		clickmethod(a);
		WebElement s = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	//	s.click();
		clickmethod(s);
//		driver.switchTo().alert().accept();
		alertaccept();
//		Thread.sleep(2000);
		WebElement d = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
//		d.click();
		clickmethod(d);
		WebElement f = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
//		f.click();
		clickmethod(f);
//		driver.switchTo().alert().dismiss();
		alertdismiss();
//		Thread.sleep(2000);
		WebElement z = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
//		z.click();
		clickmethod(z);
		WebElement x = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
//		x.click();
		clickmethod(x);
//		driver.switchTo().alert().getText();
//		driver.switchTo().alert().sendKeys("karthik surya");
	
//		Thread.sleep(3000);
//
//		String text = driver.switchTo().alert().getText();
//		System.out.println(text);
//		driver.switchTo().alert().accept();

	}


		
	}


