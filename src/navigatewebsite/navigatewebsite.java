package navigatewebsite;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatewebsite {

	public static void main(String[] args) throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
	 WebDriver d=new ChromeDriver();
	 d.manage().window().maximize();
	 d.get("https://www.seleniumhq.org/");
	 Thread.sleep(500);
	 d.navigate().to("https://www.facebook.com/");
	 Thread.sleep(500);
	 d.navigate().back();
	 Thread.sleep(500);
	 d.navigate().forward();
	 Thread.sleep(500);
	 d.navigate().refresh();
	 d.navigate().forward();
	}

}
