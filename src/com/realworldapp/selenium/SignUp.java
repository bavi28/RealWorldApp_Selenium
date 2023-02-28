package com.realworldapp.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class SignUp extends Homepage{
	public WebDriver driver;
	public void signup() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bavit\\eclipse-workspace\\Task\\chromedriver.exe");
	driver=new ChromeDriver();
 	driver.get("http://localhost:3000/signup");
 	driver.manage().window().maximize();
 	}


public void valid() {
 	WebElement fname = driver.findElement(By.id("firstName"));
	fname.sendKeys("Bavithra");
	WebElement lname = driver.findElement(By.id("lastName"));
	lname.sendKeys("Rangarajulu");
	WebElement uname = driver.findElement(By.id("username"));
	uname.sendKeys("test");
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("s3cret");
	WebElement cpwd = driver.findElement(By.id("confirmPassword"));
	cpwd.sendKeys("s3cret");
	WebElement signup = driver.findElement(By.xpath("//span[text()='Sign Up']"));
	signup.click();

	
}
public void invalidfirstname()
{
	driver=new ChromeDriver();
	driver.get("http://localhost:3000/signup");
	WebElement fname = driver.findElement(By.id("firstName"));
	fname.sendKeys(" ");
	WebElement lname = driver.findElement(By.id("lastName"));
	lname.sendKeys("Rangarajulu");
	WebElement uname = driver.findElement(By.id("username"));
	uname.sendKeys("test");
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("s3cret");
	WebElement cpwd = driver.findElement(By.id("confirmPassword"));
	cpwd.sendKeys("s3cret");
	WebElement signup = driver.findElement(By.xpath("//span[text()='Sign Up']"));
	signup.click();
	WebElement actualtext=driver.findElement(By.id("firstName-helper-text"));
	String expectedtext= "First Name is required";
	Assert.assertEquals(actualtext, expectedtext);
	driver.close();
	
}
public void invalidlastname()
{
	driver=new ChromeDriver();
 	driver.get("http://localhost:3000/signup");
	WebElement fname = driver.findElement(By.id("firstName"));
	fname.sendKeys("Bavithra");
	WebElement lname = driver.findElement(By.id("lastName"));
	lname.sendKeys(" ");
	WebElement uname = driver.findElement(By.id("username"));
	uname.sendKeys("test");
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("s3cret");
	WebElement cpwd = driver.findElement(By.id("confirmPassword"));
	cpwd.sendKeys("s3cret");
	WebElement signup = driver.findElement(By.xpath("//span[text()='Sign Up']"));
	signup.click();
	WebElement actualtext=driver.findElement(By.id("lastName-helper-text"));
	String expectedtext= "Last Name is required";
	Assert.assertEquals(actualtext, expectedtext);
	driver.close();
}
public void invalidusername()
{
	driver=new ChromeDriver();
 	driver.get("http://localhost:3000/signup");
	WebElement fname = driver.findElement(By.id("firstName"));
	fname.sendKeys("Bavithra");
	WebElement lname = driver.findElement(By.id("lastName"));
	lname.sendKeys("Rangarajulu");
	WebElement uname = driver.findElement(By.id("username"));
	uname.sendKeys("t");
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("s3cret");
	WebElement cpwd = driver.findElement(By.id("confirmPassword"));
	cpwd.sendKeys("s3cret");
	WebElement signup = driver.findElement(By.xpath("//span[text()='Sign Up']"));
	signup.click();
	WebElement actualtext=driver.findElement(By.id("username-helper-text"));
	String expectedtext= "Username is required";
	Assert.assertEquals(actualtext, expectedtext);
	driver.close();
}
public void invalidpwd()
{
	driver=new ChromeDriver();
 	driver.get("http://localhost:3000/signup");
	WebElement fname = driver.findElement(By.id("firstName"));
	fname.sendKeys("Bavithra");
	WebElement lname = driver.findElement(By.id("lastName"));
	lname.sendKeys("Rangarajulu");
	WebElement uname = driver.findElement(By.id("username"));
	uname.sendKeys("test");
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("425");
	WebElement cpwd = driver.findElement(By.id("confirmPassword"));
	cpwd.sendKeys("s3cret");
	WebElement signup = driver.findElement(By.xpath("//span[text()='Sign Up']"));
	signup.click();
	WebElement actualtext=driver.findElement(By.id("password-helper-text"));
	String expectedtext= "Enter your password";
	Assert.assertEquals(actualtext, expectedtext);
	driver.close();
}
public void invalidconfirmpwd()
{
	driver=new ChromeDriver();
 	driver.get("http://localhost:3000/signup");
	WebElement fname = driver.findElement(By.id("firstName"));
	fname.sendKeys("Bavithra");
	WebElement lname = driver.findElement(By.id("lastName"));
	lname.sendKeys("Rangarajulu");
	WebElement uname = driver.findElement(By.id("username"));
	uname.sendKeys("test");
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("s3cret");
	WebElement cpwd = driver.findElement(By.id("confirmPassword"));
	cpwd.sendKeys("234");
	WebElement signup = driver.findElement(By.xpath("//span[text()='Sign Up']"));
	signup.click();
	WebElement actualtext=driver.findElement(By.id("confirmPassword-helper-text"));
	String expectedtext= "Confirm your password";
	Assert.assertEquals(actualtext, expectedtext);
	driver.close();
}
}
