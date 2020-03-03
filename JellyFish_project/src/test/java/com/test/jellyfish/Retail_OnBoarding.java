package com.test.jellyfish;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.generic.jellyFish.BaseLib;
import com.pom.jellyFish.Reatil_SignUp_Page;

public class Retail_OnBoarding extends BaseLib
{
	Reatil_SignUp_Page retail;
@Test(invocationCount = 5)
public void signUp_test() throws AWTException
{
   retail=new Reatil_SignUp_Page(driver);
	retail.signup();
}
}
