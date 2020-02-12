package CaseTrack;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import junit.framework.Assert;
import pageObjects.LoginPage;
import resources.Base;
public class HomeValidation extends Base{
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void Initialize() throws IOException
	{
		driver=BrowserInitialisation();
		log.info("browser opened");
		
		
	}
	@Test
	public void Home() throws IOException{
		
	
	driver.get(prop.getProperty("URL"));
	LoginPage lp=new LoginPage(driver);
	Assert.assertEquals(lp.getTitle().getText(),"FEATURED COURSES12");
	
	}
	@AfterTest
	public void tairdown()
	{
		driver.close();
	}

}
