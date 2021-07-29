package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_page;
import generic.Reusablemethods;

public class OnlineShoppingSitePage extends Base_page
{
     public OnlineShoppingSitePage(WebDriver driver) {
		super(driver);
}

    @FindBy(xpath ="(//input[@type='text'])[2]")
    private WebElement uname;
    @FindBy(xpath ="//input[@type='password']")
    private WebElement pword;
    @FindBy(xpath ="(//button[@type='submit'])[2]")
    private WebElement login;
    @FindBy(xpath = "(//span[@class='_1QZ6fC _3Lgyp8'])[3]")
	private WebElement men;
	@FindBy(xpath = "//a[@title='T-Shirts']")
	private WebElement tshirts;
	@FindBy(xpath = "(//div[@class='_3ZJShS _31bMyl'])[4]")
	private WebElement Solidmenpoloneck;
    public void setusername(String username)
    {
         uname.sendKeys(username);
         
     }
    public void setpassword(String password)
    {
         pword.sendKeys(password);
    }
    public void clicklogin()
    {
    	login.click();
    }
    public void title(WebDriver driver)
    {
    	String title = "Online Shopping Site for Mobiles";
        verifyTitle(title,10);
    }
    public void hover(WebDriver driver)
	{
		verifyElement(men, 20);
		Reusablemethods obj = new Reusablemethods();
		obj.mousehover(driver,men);
	}
	
	public void Tshirt(WebDriver driver)
	{
		verifyElement(tshirts, 10);
		tshirts.click();
	}   
	public void Click(WebDriver driver)
	{
		verifyElement(Solidmenpoloneck, 10);
		Solidmenpoloneck.click();
	}
	public void switchwindow()
	{
		Reusablemethods childbrowser = new Reusablemethods();
		childbrowser.windowhandler(driver);
	}
	
}
