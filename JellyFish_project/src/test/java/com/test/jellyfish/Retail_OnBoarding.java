package com.test.jellyfish;

import org.testng.annotations.Test;

import com.generic.jellyFish.BaseLib;
import com.pom.jellyFish.Reatil_SignUp_Page;

public class Retail_OnBoarding extends BaseLib
{
	Reatil_SignUp_Page retail;
@Test()
public void signUp_test()
{
   retail=new Reatil_SignUp_Page(driver);
   System.out.println("Hello World");
	retail.signup();
}
}
