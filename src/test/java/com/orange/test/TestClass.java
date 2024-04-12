package com.orange.test;

import org.testng.annotations.Test;

import com.orange.pages.RegisterPage;

public class TestClass extends TestBase
{
	RegisterPage regobj;
	
	@Test
	public void TC_LG_001()
	{
		regobj = new RegisterPage(driver);
		regobj.setUser("Admin", "admin12");
		
		
	}
	

}
