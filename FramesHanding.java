package week4.day1class_section;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHanding {

	public static void main(String[] args) {
		
		
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");

		 WebElement flame = driver.findElement(By.id("iframeResult"));
		 driver.switchTo().frame(flame);
		 driver.findElement(By.xpath( "//button[text()='Try it']")).click();
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		 String text = driver.findElement(By.id("demo")).getText();
		 System.out.println("text:"+ text);
		 
	 		
	}

}
