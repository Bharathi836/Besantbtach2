package regressionscripts;

import org.testng.annotations.Test;

import generic.Datadriven_excelread;
import generic.Generic_Test;
import pom.OnlineShoppingSitePage;

public class InvalidLogin extends Generic_Test
{
@Test
public void InvalidLogin()
{
	String username = Datadriven_excelread.getData("testdata", 0, 0);
	   String password = Datadriven_excelread.getData("testdata", 1, 1);
	   OnlineShoppingSitePage lp = new OnlineShoppingSitePage(driver);
	    
	    	lp.setusername(username);
			lp.setpassword(password);
			lp.clicklogin();
			System.out.println("test");
	
}
}
