package org.cts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\Day3Selenium7\\Drive\\chromedriver.exe");
		WebDriver web=new ChromeDriver();
		web.get("https://www.swiggy.com/");
		WebElement log = web.findElement(By.xpath("//a[@class='x4bK8']"));
		log.click();
		WebElement user = web.findElement(By.id("mobile"));
		user.sendKeys("9626153752");
		WebElement in = web.findElement(By.xpath("//a[@class='a-ayg']"));
		in.click();
		WebElement name = web.findElement(By.xpath("(//input[@type='text'])[2]"));
		name.sendKeys("siva");
		WebElement mail = web.findElement(By.xpath("//input[@type='email']"));
		mail.sendKeys("sivaaashoka@gmail.com");
		WebElement pass = web.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("123456");
		WebElement i = web.findElement(By.xpath("//a[@class='a-ayg']"));
		i.click();
		
		web.quit();
		}
}
