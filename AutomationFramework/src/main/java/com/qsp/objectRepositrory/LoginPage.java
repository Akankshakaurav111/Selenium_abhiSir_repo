package com.qsp.objectRepositrory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
@FindBy(id="Email")
private WebElement emailTxtField;

public WebElement getEmailTxtField() {
	return emailTxtField;
}

public WebElement getPasswordTextField() {
	return passwordTextField;
}

public WebElement getLoginButton() {
	return loginButton;
}

@FindBy(id="Password")
private WebElement passwordTextField;

@FindBy(xpath="//input[@value='Log in']")
private WebElement loginButton;

}
