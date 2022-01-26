package com.Maven_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adaction_Project {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Maven_Project\\Driver\\96Version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("karthikmadhu");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("karthik2000m");
		WebElement Login = driver.findElement(By.id("login"));
		Login.click();
		WebElement location = driver.findElement(By.id("location"));
		Select aa = new Select(location);
		aa.selectByIndex(1);
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select a = new Select(hotels);
		a.selectByIndex(1);
		WebElement room_type = driver.findElement(By.id("room_type"));
		Select ab = new Select(room_type);
		ab.selectByIndex(1);
		WebElement nor = driver.findElement(By.id("room_nos"));
		Select ac = new Select(nor);
		ac.selectByIndex(1);
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
		radiobutton.click();
		WebElement continues = driver.findElement(By.id("continue"));
		continues.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		WebElement fn = driver.findElement(By.id("first_name"));
		fn.sendKeys("karthik");
		WebElement ln = driver.findElement(By.id("last_name"));
		ln.sendKeys("M");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("abcde");
		WebElement cc = driver.findElement(By.id("cc_num"));
		cc.sendKeys("9876543210123654");
		WebElement cc_type = driver.findElement(By.id("cc_type"));
		Select ad = new Select(cc_type);
		ad.selectByIndex(1);
		WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
		Select adc = new Select(cc_exp_month);
		adc.selectByIndex(1);
		WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
		Select zx = new Select(cc_exp_year);
		zx.selectByIndex(12);
		WebElement cvvno = driver.findElement(By.id("cc_cvv"));
		cvvno.sendKeys("589");
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		TakesScreenshot src = (TakesScreenshot) driver;
		File sr = src.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Screens\\adaction1.png");
		FileUtils.copyFile(sr, dest);
////		driver.close();

	}

}
