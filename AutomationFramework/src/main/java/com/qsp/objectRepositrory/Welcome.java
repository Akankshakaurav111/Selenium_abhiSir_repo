package com.qsp.objectRepositrory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome {
	WebDriver driver;
	//intialization
	public Welcome(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	//declearation
  @FindBy(linkText = "Register")
  private WebElement registerlink;
  
  public WebElement getRegisterlink() {
	return registerlink;
}

public WebElement getLoginLink() {
	return loginLink;
}

public WebElement getShoppingCardLink() {
	return shoppingCardLink;
}

@FindBy(linkText="Log in")
  private WebElement loginLink;
  
  @FindBy(xpath="//span[text()='Shopping cart']")
  private WebElement shoppingCardLink;
}
