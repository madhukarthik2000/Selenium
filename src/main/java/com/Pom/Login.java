package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	private WebDriver driver;

	@FindBy(id = "email")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "passwd")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}

	@FindBy(xpath = "//i[@class='icon-lock left']")
	private WebElement signup;

	public WebElement getSignup() {
		return signup;
	}

}
