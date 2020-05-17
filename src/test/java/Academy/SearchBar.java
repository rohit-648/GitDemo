package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.base;

public class SearchBar extends base{
	
	public WebDriver driver;
	
	
	@Test(dataProvider="Searchdata")
	public void Search(String searchdata) throws IOException {
		
		driver=InitializeDriver();
		String urlname = prop.getProperty("url");
		
		
		driver.get(urlname);
		
		LoginPage lp  = new LoginPage(driver);
		
		lp.SearchBar().sendKeys(searchdata);
		lp.SearchButton().click();
		
		driver.close();
	}

	
	@DataProvider
	public Object[] Searchdata()
	
	{
		Object [] data = new Object[3];
		
		data[0]="Apple";
		data[1]="Book";
		data[2]="Mobile";
		return data;
	}
	
	

	
}
