package week2.day2.assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();	
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	WebElement elementUsername = driver.findElement(By.id("username"));
	elementUsername.sendKeys("DemoCSR");
	WebElement elementPassword = driver.findElement(By.id("password"));
	elementPassword.sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.className("crmsfa")).click();	
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//span[text()='Email']")).click();
	driver.findElement(By.name("emailAddress")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead?partyId=11108'])")).click();
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.xpath("(//input[@class='smallSubmit'])")).click();
	driver.close();
	
}
}
