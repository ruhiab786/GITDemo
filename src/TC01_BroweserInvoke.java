import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_BroweserInvoke {

	public static void main(String[] args) {
		// TODO invocation of BRowser
	//	System.setProperty("webdriver.chrome.driver", "C/Program Files/chromedriver-win64/chromedriver");
		WebDriver driver =new ChromeDriver();
        driver.get("http://rahulshettyacademy.com");
        System.out.println((driver.getTitle()));
        System.out.println((driver.getCurrentUrl()));
        driver.quit();

	}

}
