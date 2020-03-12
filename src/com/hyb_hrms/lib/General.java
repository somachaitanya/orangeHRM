package com.hyb_hrms.lib;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.hyb_hrms.utility.Log;

public class General extends Global{

	public void openApp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\soma\\Downloads\\Programs\\selenium\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		Log.info("app opened");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}
	
	public void login() {
		driver.findElement(By.name(un_nam)).sendKeys(un);
		driver.findElement(By.name(pw_nam)).sendKeys(pw);
		driver.findElement(By.xpath(lgn_xp)).click();
		Log.info("logged in");
		
	}
	
	public void title() {
		assertTrue(driver.getTitle().matches(title));
		Reporter.log("title matched");
		Log.info("title matched");
	}
	public void admin_loc() throws InterruptedException {
		
	
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath(admin_xp))).build().perform();
			Actions act1 = new Actions(driver);
			act1.moveToElement(driver.findElement(By.xpath(compny_xp))).build().perform();
			
			driver.findElement(By.xpath(loc_xp)).click();
			
			driver.switchTo().frame("rightMenu");
			driver.findElement(By.xpath(addLoc_xp)).click();
			
			driver.findElement(By.id(nameLoc_id)).sendKeys(nameLoc);
			WebElement element = driver.findElement(By.id(contry_id));
			Select sel = new Select(element);
			sel.selectByVisibleText(country);
			driver.findElement(By.id(address_id)).sendKeys(address);
			driver.findElement(By.name(zipcode_nam)).sendKeys(zipcode);
			driver.findElement(By.xpath(save_xp)).click();
			Log.info("location added");
			Thread.sleep(4000);
			driver.switchTo().defaultContent();
		
	}
	public void login_alert() {
		driver.findElement(By.name(un_nam)).sendKeys(un);
		driver.findElement(By.xpath(lgn_xp)).click();
		Alert alt = driver.switchTo().alert();
		Reporter.log(alt.getText());
		alt.accept();
	}
	
	public void screenshot() throws IOException {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath(pim_xp))).build().perform();
			driver.findElement(By.linkText(addemp_lt)).click();
		}
		catch(Exception e) {
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("D:\\testerror2.png"));
		}
	}

	public void logout() {
		driver.findElement(By.linkText(logut_lt)).click();
		driver.close();
	}
	
	public void closeApp() {
		driver.quit();
	}

}
