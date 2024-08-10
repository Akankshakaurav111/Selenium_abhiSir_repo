package com.qsp.genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.qsp.objectRepositrory.HomePage;
import com.qsp.objectRepositrory.LoginPage;
import com.qsp.objectRepositrory.Welcome;

public class BA2 {
   public FileUtility fileLab;
  public static WebDriver driver;
  public HomePage hp;
  public LoginPage lp;
  public Welcome wp;
  public JavaUtility javaLib;
  
  @BeforeClass
  public void launchBrowser() throws IOException
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  fileLab=new FileUtility();
	  String url=fileLab.getDataFromProperty("url");
	  driver.get(url);
  }
  
  @BeforeMethod
  public void login() throws IOException 
  {
  wp=new Welcome(driver);
  wp.getLoginLink().click();
  lp=new LoginPage(driver);
  String email=fileLab.getDataFromProperty("email");
  String password=fileLab.getDataFromProperty("password");
  lp.getEmailTxtField().sendKeys(email);
  lp.getPasswordTextField().sendKeys(password);
  lp.getLoginButton().click();
}
@AfterMethod
public void logout()
{
  hp=new HomePage(driver);
 hp.getLogoutLink().click(); 
}
@AfterClass
public void closeBrowser()
{
  driver.quit();
}

  
}
