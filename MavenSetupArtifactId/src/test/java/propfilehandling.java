import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class propfilehandling {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream("/Users/ashutoshshandilya/WorkSpace/MavenSetupArtifactId/src/test/java/config.properties");
		
		prop.load(input);
		System.setProperty("webdriver.chrome.driver" , "/Users/ashutoshshandilya/WorkSpace/MavenSetupArtifactId/driver/chromedriver"); //String.valueOf(prop.getProperty("driverpath")));
		
		System.out.println(String.valueOf(prop.getProperty("driverpath")));
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(String.valueOf(prop.getProperty("url")));
		System.out.println("url added in prop file " + prop.getProperty("url"));
		
		System.out.println(driver.getCurrentUrl()); 
		
		
		
	}

}
