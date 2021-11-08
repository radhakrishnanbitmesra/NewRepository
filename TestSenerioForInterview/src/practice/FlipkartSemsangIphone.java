package practice;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSemsangIphone {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("samsung moboles");
		ele.submit();
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F41 (Fusion Blue, 128 GB)']")).click();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_TAB);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_TAB);		
		
		ele.clear();
		
		
		ele.sendKeys("iphone");
		ele.submit();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone SE (Black, 128 GB)']")).click();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_TAB);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(10000);
		driver.close();
		
	}

}
