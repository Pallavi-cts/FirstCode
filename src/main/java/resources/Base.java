package resources;

import java.io.File;
//import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Base {
	public static WebDriver driver;
	public Properties prop;
	public WebDriver BrowserInitialisation() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\hkasc\\E2EKPGRC\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
	String browsername=prop.getProperty("browser");
	if(browsername.contains("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pallavi\\chromedriver.exe");
	    driver=new ChromeDriver();
	}
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	return driver;
	}

public void getScreenshot(String result) throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    //FileUtils.copFile(src,));
	FileHandler.copy(src, new File("C://Test//"+result+"screenshot.png"));
	

	
	
}
}
