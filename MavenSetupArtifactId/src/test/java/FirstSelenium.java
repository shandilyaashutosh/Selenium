import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



@SuppressWarnings("unused")
public class FirstSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "/Users/ashutoshshandilya/WorkSpace/MavenSetupArtifactId/driver/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://smallbusinessonline.bbt.com/sboEnrollment/main/web/sboEnroll/home");
		
		String sboenrollementpage = driver.getTitle();
		System.out.print(sboenrollementpage);
		
		//System.out.println(radiobuttoname);
		//System.getLogger(radiobuttoname);
//				WebElement soleradiobutton = driver.findElement(By.id("businessType02"));
//				soleradiobutton.click();
//				Boolean radiobuttonstate = soleradiobutton.isSelected();
//				System.out.print(radiobuttonstate);
				
				//driver.wait(4000);
		
				WebElement nonsoleradiobutton = driver.findElement(By.id("businessType03"));
				System.out.println("radiobuttonadded");
				WebElement debitcardinputfield = driver.findElement(By.name("acctNumber"));
				System.out.println("acctNumber");
				//WebElement  taxidinputfield = driver.findElement(By.xpath("//input[@id=\'taxId\']"));
				System.out.println("tax");
				
				WebElement  zipinputfield = driver.findElement(By.id("busZip2")) ;
				
				nonsoleradiobutton.click();
				
				debitcardinputfield.sendKeys("9874-5289-6857-5874");
				
				//taxidinputfield.sendKeys("987654321");
				driver.wait(1000);
				zipinputfield.sendKeys("27604");
				driver.wait(1000);
				
				
				
				
				
//				driver.wait(3000);
//		
//					WebElement continuebutton =	driver.findElement(By.xpath("//button[@id=\'sboEnrollHome\']"));
//				String hanle  = driver.getWindowHandle();
//					System.out.println("hanle");
//					
//				WebElement continuebuttoncss = driver.findElement(By.cssSelector("#sboEnrollHome"));
//				continuebuttoncss.click();
		
		//Thread.sleep(3000);
		driver.close();
		
		
	}

}
