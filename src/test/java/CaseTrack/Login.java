package CaseTrack;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.CredentialsPage;
import pageObjects.LoginPage;
import resources.Base;

public class Login extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initialise() throws IOException
	{
		driver = BrowserInitialisation();
		log.info("success");
	
	}
	@Test(dataProvider="getData")
	public void basepagenavigation(String Username,String Password) throws IOException {
		driver.get(prop.getProperty("URL"));
		LoginPage lp=new LoginPage(driver); 
		lp.getLogin().click();
		CredentialsPage cp=new CredentialsPage(driver);
		cp.Email().sendKeys(Username);
		cp.Password().sendKeys(Password);
		cp.LogIn().click();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="pallavi";
		data[0][1]="pavi";
		
		data[1][0]="pallavi.bellamkonda1994@gmail.com";
		data[1][1]="pallavipavi";
		
		return data;
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
