package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CredentialsPage {
	public WebDriver driver;
	public CredentialsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By Username=By.cssSelector("input[type='email']");
	By Password=By.cssSelector("input[type='password']");
	By SignIn=By.name("commit");
	public WebElement Email()
	{
		return driver.findElement(Username);
	}
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	public WebElement LogIn()
	{
		return driver.findElement(SignIn);
	}
}
