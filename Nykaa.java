package nykaaProject.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Nykaa {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\MiniProject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/sp/mega-sale/mega-sale?utm_content=ads&utm_source=GooglePaid&utm_medium=search&utm_campaign=Search_Nykaa&gclid=CjwKCAjw-b-kBhB-EiwA4fvKrK-XQDZC_o50JdGZjnudnAyRYg6YmntajIXiSAoGiVoFoUd1_vEHIBoCLyoQAvD_BwE");
		driver.manage().window().maximize();
		WebElement Mouse = driver.findElement(By.xpath("//a[text()='mom & baby']"));
		Actions mo = new Actions (driver);
		mo.moveToElement(Mouse).build().perform();
		driver.findElement(By.xpath("//a[text()='Baby Powder']")).click();
		Set<String>secondTab = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(secondTab);
		driver.switchTo().window(list1.get(1));
		driver.findElement(By.xpath("//img[@alt='Himalaya Baby Powder']")).click();
		Set<String>ThirdTab = driver.getWindowHandles();
		List<String> list2 = new ArrayList<String>(ThirdTab);
		driver.switchTo().window(list2.get(2));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement DD = driver.findElement(By.xpath("//select[@title='SIZE']"));
		Select s= new Select(DD);
		s.selectByValue("2");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div[2]/div/div[1]/div[6]/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"header_id\"]/div[2]/div/div[2]/div[2]/button")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"4790\"]/div/div/div[3]/div/div[1]/span/img")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[3]/div/div/div/div/div[2]/div[2]/div[2]/li[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div/div/div/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[2]/div/div/div[1]/div[1]/div/span[2]/img")).click();
		driver.findElement(By.xpath("//p[@class='css-z7wmhp eka6zu20']")).click();
		driver.findElement(By.xpath("//*[@id=\"4790\"]/div/div/div[1]/span")).click();
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		driver.quit();
		System.out.println("Code was runned");
      }
	}


