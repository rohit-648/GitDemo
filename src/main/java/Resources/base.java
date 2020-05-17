package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
	
	
	public WebDriver InitializeDriver() throws IOException {
		
		
		prop = new Properties();
		
		FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Academy\\data.properties");
		
		prop.load(fis);
		//String browserName = System.getProperty("browser");
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\Chromedriver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			
		}
		
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\selenium\\firefoxdriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if(browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\selenium\\IEDriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	;
	return driver;
	
	}
	
	

}
