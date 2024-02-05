package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	 WebDriver ldriver;
	 
public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		

@FindBy(xpath="//div[@class='panel header']//a[contains(text(),'Sign In')]")
@CacheLookup
WebElement signin;

@FindBy(xpath="//input[@id='email']")
@CacheLookup
WebElement txtUserName;

@FindBy(xpath="//fieldset[@class='fieldset login']//input[@id='pass']")
@CacheLookup
WebElement txtPassword;

@FindBy(xpath="//fieldset[@class='fieldset login']//button[@id='send2']")
@CacheLookup
WebElement btnLogin;


@FindBy(xpath="//li[@class='customer-welcome'] //button")
@CacheLookup
WebElement WelcomeMenu;

@FindBy(xpath="(//a[normalize-space()='Sign Out'])[1]")
@CacheLookup
WebElement lnkLogout;


@FindBy(xpath="//a[@class='action remind']")
@CacheLookup
WebElement forgotpassword;



public void UserName(String username)
{
	txtUserName.sendKeys(username);
}

public void Password(String password)
{
	txtPassword.sendKeys(password);
}


public void clickSubmit()
{
	btnLogin.click();
}	

public void welcomeMenu() {
	WelcomeMenu.click();
}
public void clickLogout()
{
	lnkLogout.click();
}

public void Forgotpassword() {
	forgotpassword.click();
}

public void returntosignin() {
	signin.click();
}
	
public AccountsPage doLogin(String un, String pwd) {
	System.out.println("login with: " + un + " and " + pwd);
	signin.click();
	txtUserName.sendKeys(un);
	txtPassword.sendKeys(pwd);
	btnLogin.click();
	return new AccountsPage(ldriver);
	
	
}
	
	
	
	

}
