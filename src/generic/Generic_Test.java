package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Generic_Test implements Auto_const
{
  public WebDriver driver;
  @Parameters({"browser"})
  @BeforeMethod
  public void openAppn(String browser)
  {
	  FileManager fm = new FileManager();
	  BrowserFactory bff = new BrowserFactory();
	  if(browser.equals("chrome"))
	  {
	  driver = bff.getBrowser("chrome");
	  driver.get(fm.getApplicationUrl());
	  }
	  else
	  {
		 driver = bff.getBrowser("firefox");
		 driver.get(fm.getApplicationUrl());
	  }
	  
	  driver.manage().timeouts().implicitlyWait(fm.getImplicitlyWait(), TimeUnit.SECONDS);
  }
	   
  
  @AfterMethod
  public void closeAppn(ITestResult res)
  {  
	    System.out.println(res.getStatus());
		if(ITestResult.FAILURE==res.getStatus())
		{
		     
			String testName = res.getName();
			System.out.println(testName);
			
            Screenshot.capturePhoto(driver,testName);
  }

}

}