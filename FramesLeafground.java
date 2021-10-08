package week4.day1class_section;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesLeafground {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		  ChromeDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("http://leafground.com/pages/frame.html");
		  
		  WebElement iframe = driver.findElement(By.xpath( "//div[@id='wrapframe']//iframe"));
		  driver.switchTo().frame(iframe);
		  driver.findElement(By.id("Click")).click();
		  

	}

}
