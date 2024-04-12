package com.orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	@FindBy(xpath="//input[@name='username' and @placeholder='Username']")
	private WebElement username;
	@FindBy(name="password")
	private WebElement pass;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement sub;
	
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void setUser(String userName, String passwd)
	{
		//WebElement username = driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']"));
		username.sendKeys(userName);
		pass.sendKeys(passwd);
		sub.click();
		
		}
	
	

}
