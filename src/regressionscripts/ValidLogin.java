package regressionscripts;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Datadriven_excelread;
import generic.Generic_Test;
import pom.OnlineShoppingSitePage;
import pom.TryThisSolidMenPoloNeckWhitePage;

public class ValidLogin extends Generic_Test
{
	@Test
	 public void validlogin() throws InterruptedException
	   {   
		   String username = Datadriven_excelread.getData("testdata", 0, 0);
		   String password = Datadriven_excelread.getData("testdata", 0, 1);
		   OnlineShoppingSitePage lp = new OnlineShoppingSitePage(driver);
		    
		    	lp.setusername(username);
				lp.setpassword(password);
				lp.clicklogin();
				lp.title(driver);
                lp.hover(driver);
                lp.Tshirt(driver);
			    lp.Click(driver);
			    lp.switchwindow();
			    TryThisSolidMenPoloNeckWhitePage hp = new TryThisSolidMenPoloNeckWhitePage(driver);
			    hp.title(driver);
			    hp.size();
			    hp.Click();
			    Thread.sleep(3000);
			    hp.carttitle(driver);
			    hp.removefromcart();
			    Thread.sleep(3000);
			    hp.removecartpopup();
			    hp.Myaccount();
			    hp.Logout(); 
			}
			
}

