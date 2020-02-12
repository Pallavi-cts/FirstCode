package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Login=By.xpath("//span[contains(text(),'Login')]");
	By Title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	
	public WebElement getLogin()
	{
		return driver.findElement(Login);
	}
	public WebElement getTitle()
	{
		return driver.findElement(Title);
	}
}
