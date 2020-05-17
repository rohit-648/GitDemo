package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Resources.base;

public class HomePageTest extends base{
	
	//public WebDriver driver;
	public WebDriver driver;
	
	@Test
	public void basePageNavigation() throws IOException {
		
		driver=InitializeDriver();
		String urlname = prop.getProperty("url");
		
		
		driver.get(urlname);
		
		LoginPage lp  = new LoginPage(driver);
		
		lp.Sn().click();
		
		driver.close();
	}

}
