import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	
	WebDriver driver;
	
	@Test
	public void setup() {
		WebDriver driver= new HtmlUnitDriver();
		//System.setProperty("webdriver.chrome.driver", "");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

}
