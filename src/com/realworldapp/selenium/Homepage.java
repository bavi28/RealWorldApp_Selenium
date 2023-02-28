package com.realworldapp.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Homepage {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bavit\\eclipse-workspace\\Task\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.get("http://localhost:3000/signin");
	 	driver.manage().window().maximize();
	 	SignUp sp=new SignUp();
	 	sp.signup();
	 	sp.valid();
	 	Signin();
	 	sp.invalidfirstname();
	 	sp.invalidlastname();
	 	sp.invalidpwd();
	 	sp.invalidconfirmpwd();
	 	sp.invalidusername();
	 	sp.invalidusernamepwd();
	 	WebElement sup=driver.findElement(By.xpath("//a[@href=\"/signup\"]"));
		sup.getCssValue("http://localhost:3000/signup");
		tearDown();	
	}

	public static void Signin() throws InterruptedException
 	{
 	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bavit\\eclipse-workspace\\Task\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:3000/signin");
	driver.manage().window().maximize();
	WebElement uname = driver.findElement(By.id("username"));
	uname.sendKeys("test");
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("s3cret");
	WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
	signin.click();
	String actualUrl="http://localhost:3000/signin";
	String expectedUrl= driver.getCurrentUrl();
	Assert.assertEquals(expectedUrl,actualUrl);
	//driver.findElement(By.className("MuiIconButton-label"));
	//driver.findElement(By.className("MuiBackdrop-root"));
	/*driver.switchTo().activeElement();
	WebElement next=driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		next.click();
		WebElement bankname=driver.findElement(By.xpath("//input[@name='bankName']"));
		bankname.sendKeys("12345");
		WebElement routingno=driver.findElement(By.xpath("//input[@name='routingNumber']"));
		routingno.sendKeys("123456767");
		WebElement accno=driver.findElement(By.xpath("//input[@name='accountNumber']"));
		accno.sendKeys("123456869");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//span[text()='Done']")).click();*/
		Thread.sleep(3000);
		WebElement everyone=driver.findElement(By.xpath("//span[text()='Everyone']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(everyone).build().perform();
		WebElement mine=driver.findElement(By.xpath("//span[text()='Mine']"));
		mine.click();
		ac.moveToElement(mine).build().perform();
		WebElement myacc=driver.findElement(By.xpath("//a[@href=\"/user/settings\"]"));
		myacc.click();
		//driver.findElement(By.name("firstName"));
		//driver.findElement(By.name("lastName"));
		WebElement email=driver.findElement(By.name("email"));
		email.clear();
		//email.sendKeys("bavithracse@gmail.com");
		WebElement mobno=driver.findElement(By.name("phoneNumber"));
		mobno.clear();
		//mobno.sendKeys("9677460605");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Bank Accounts']")).click();
		WebElement bankacc=driver.findElement(By.xpath("//span[text()='Create']"));
		bankacc.click();
		WebElement bankname1=driver.findElement(By.xpath("//input[@name='bankName']"));
		bankname1.sendKeys("12345");
		WebElement routingno1=driver.findElement(By.xpath("//input[@name='routingNumber']"));
		routingno1.sendKeys("123456767");
		WebElement accno1=driver.findElement(By.xpath("//input[@name='accountNumber']"));
		accno1.sendKeys("123456869");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement del=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		del.click();
		WebElement logout=driver.findElement(By.xpath("//span[text()='Logout']"));
		logout.click();
}
	public void invalidusername()
 	{
	WebElement uname = driver.findElement(By.id("username"));
	uname.sendKeys("t ");
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("s3cret");
	WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
	signin.click();
	String actualUrl="http://localhost:3000/signin";
	String expectedUrl= driver.getCurrentUrl();
	Assert.assertEquals(expectedUrl,actualUrl);
 	}
	public void invalidpwd()
 	{
	WebElement uname = driver.findElement(By.id("username"));
	uname.sendKeys("test");
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("s3ghds");
	WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
	signin.click();
	String actualUrl="http://localhost:3000/signin";
	String expectedUrl= driver.getCurrentUrl();
	Assert.assertEquals(expectedUrl,actualUrl);
 	}
	public  void invalidusernamepwd()
 	{
	WebElement uname = driver.findElement(By.id("username"));
	uname.sendKeys("t ");
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("256");
	WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
	signin.click();
	String actualUrl="http://localhost:3000/signin";
	String expectedUrl= driver.getCurrentUrl();
	Assert.assertEquals(expectedUrl,actualUrl);
 	}
	public static void emptyusername()
 	{
	WebElement uname = driver.findElement(By.id("username"));
	uname.sendKeys("");
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("s3cret");
	WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
	signin.click();
	String actualUrl="http://localhost:3000/signin";
	String expectedUrl= driver.getCurrentUrl();
	Assert.assertEquals(expectedUrl,actualUrl);
 	}
	public static void emptypwd()
 	{
	WebElement uname = driver.findElement(By.id("username"));
	uname.sendKeys("test");
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("");
	WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
	signin.click();
	String actualUrl="http://localhost:3000/signin";
	String expectedUrl= driver.getCurrentUrl();
	Assert.assertEquals(expectedUrl,actualUrl);
 	}
@AfterClass
public static void tearDown() throws Exception {
  
        driver.quit();
    }
}