package com.pom.jellyFish;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.generic.jellyFish.BaseLib;
import com.relevantcodes.extentreports.LogStatus;

public class Reatil_SignUp_Page extends BaseLib
{
 
	public Reatil_SignUp_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Declaration of the webElement
	@FindBy(xpath = "//p[text()=\"Please log in to proceed\"]")
	private WebElement jellyfish_logologin_text;
	
	@FindBy(xpath="//span[text()=' Sign Up']")
	private WebElement sign_up_button;
	
	@FindBy(xpath ="(//h3[contains(text(),'Sign Up')])[2]")
	private WebElement sign_up_text;
	
	
public void signup()
{

	if(jellyfish_logologin_text.isDisplayed()==true)
	{
		logger.log(Status.PASS,"Login Page verified Successfully");
		logger.log(Status.INFO,"click on the SignUp button on the Login Page");
		sign_up_button.click();
		logger.log(Status.PASS,"Sign Up button has been clicked");
	
		logger.log(Status.PASS,"Welcome to the Retail SignUp Page");
	}
	else
	{
		logger.log(Status.FAIL,"It is not dispalying the Login Page");
	}
	
	
	
	
}
	
	
}
