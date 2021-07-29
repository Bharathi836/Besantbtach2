package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
public static void capturePhoto(WebDriver driver,String testname)
{
	String path = "C://photos/";
	Date d = new Date();
	String d1 = d.toString();
	String date = d1.replace(":", "-");
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst = new File(path+date+testname+".png");
	try
	{
		FileHandler.copy(src, dst);
	}
	catch(IOException e)
	{
		System.out.println("Failed to take screen shot");
	}
	}
}
