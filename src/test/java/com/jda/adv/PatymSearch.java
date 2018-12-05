package com.jda.adv;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PatymSearch {
	
	public static WebDriver driver;
	
	@Test
	public void patymSearch(){
		try{
		//Set chrome driver path.
		System.setProperty("webdriver.chrome.driver", "C://Venkat//AdvAutomation//adv//browserdrivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		List<WebElement> search=driver.findElements(By.xpath("//*[contains(@placeholder,'Search for a Product , Brand or Category')]"));
        if(search.size()!=0){
        	driver.findElement(By.xpath("//*[contains(@placeholder,'Search for a Product , Brand or Category')]")).sendKeys("Mobile Recharge");
        	driver.findElement(By.xpath("//*[contains(@placeholder,'Search for a Product , Brand or Category')]")).sendKeys(Keys.ENTER);
        }else{
        	System.out.println("Patym Search Not Visible");
        }
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(driver!=null){
				driver.close();
				driver.quit();
			}
		}	
	}
}