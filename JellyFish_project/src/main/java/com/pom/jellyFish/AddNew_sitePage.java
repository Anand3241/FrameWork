package com.pom.jellyFish;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNew_sitePage 
{
  public AddNew_sitePage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  
}
