package com.qsp.genericutility;



import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

  public class WebDriverUtility 
  {
	Actions act;
    public WebDriverUtility(WebDriver driver) {
	act=new Actions(driver);
        }
   public void doubleClick(WebElement element)
     {
	act.doubleClick(element).perform();
       }

  public void dragAndDrop(WebElement element1,WebElement element2) 
   {
	    act.dragAndDrop(element1, element2).perform();
    }
   public void clickAndHold(WebElement element)
    {
	    act.clickAndHold(element).perform();
      }

  public void mouseHover(WebElement element)
    {
	    act.moveToElement(element).perform();
   }
   public void scrollTOElement(WebElement element)
    {
	    act.scrollToElement(element).perform();
    }
   public void switchToWindow(WebDriver driver,String expectedUrl)
     {
	Set<String> allWindows = driver.getWindowHandles();
	
	for(String id:allWindows) {
	String actual = driver.switchTo().window(id).getCurrentUrl();//driver petch the 
	if(actual.contains(expectedUrl))
	{
		break;
	}
	}
}
   public void switchTo(WebDriver driver,int index) {
	   driver.switchTo() .frame(index) ;
	   }

   
   public Alert switchtoAlert(WebDriver driver) {
	   return driver.switchTo().alert();
   }
}
