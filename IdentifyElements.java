package SolePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class IdentifyElements extends InvokeBrowser {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		// adding property file 
		
		FileInputStream ipstream = new FileInputStream("//WIL-HOMEDRIVE03/A71745$/Desktop/Selenium exercise/Selenium Exercise/SBoEnrollArtifactId/src/test/resources/SBOEnroll.properties");
		Properties prop = new Properties();
		prop.load(ipstream);
		
		System.out.print(prop.get("url"));
		String url = (String) prop.get("url");
		

		System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("useAutomationExtension",false);
		WebDriver driver = new ChromeDriver(opt);
		//driver.manage().window().fullscreen();
		
		driver.manage().deleteAllCookies();
		
		driver.get(url);
		
		if(prop.getProperty("solepropradiobuttonxpath") !=null)
			
		{	
		driver.findElement(By.xpath(prop.getProperty("nonsoleradiobuttonxpath"))).click();
		Thread.sleep(2000);
		
		
		
		
		
		//selecting annual sales
		driver.findElement(By.xpath(prop.getProperty("annualsaledropdownxpath"))).sendKeys(prop.getProperty("inputforannualsales"));
		//selecting accountnumber
		driver.findElement(By.xpath(prop.getProperty("accountnumberinputfieldxpath"))).sendKeys((prop.getProperty("inputaccnumber")));
		//selecting ssn
		driver.findElement(By.xpath(prop.getProperty("ssninoutfield"))).sendKeys(prop.getProperty("inputssnvlaue"));
		//selecting zip 
		driver.findElement(By.xpath(prop.getProperty("nonsolezipinputfiled"))).sendKeys(prop.getProperty("inputzipvalue"));
		
		
//		//selecting and entering phone number 
//		driver.findElement(By.xpath(prop.getProperty("solephonenumberinputfiled"))).sendKeys(prop.getProperty("inputsolepropphonenumner"));
//		
//		
//		//selecting and entering Email
//		driver.findElement(By.xpath(prop.getProperty("solepropemailinputfiled"))).sendKeys(prop.getProperty("inputforemail"));
//		driver.findElement(By.xpath(prop.getProperty("soleprop_confirm_email_xpath"))).sendKeys(prop.getProperty("inputforemail"));
//		
//		
//		//click on continue buttom
		
		driver.findElement(By.xpath(prop.getProperty("continuebuttonxpath"))).click();
	
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.navigate().to("https://www.google.com/");
		//driver.getPageSource().endsWith("/h");
		
		driver.wait(100);
		driver.navigate().back();
		driver.navigate().back();
		
		
		}
	}

}
