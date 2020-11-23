package org.Function;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class completeaction {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\MOUSE AND KEY BOARD\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/index.php");
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("karthi007");
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("Karthi@1989");
		WebElement btnclick = driver.findElement(By.id("login"));
		btnclick.click();
		WebElement loc = driver.findElement(By.id("location"));
		loc.click();
		Robot a = new Robot();
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		WebElement hotel = driver.findElement(By.id("hotels"));
		hotel.click();
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		WebElement room = driver.findElement(By.id("room_type"));
		room.click();
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		WebElement rdobtn = driver.findElement(By.id("radiobutton_0"));
		rdobtn.click();
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		WebElement fname = driver.findElement(By.className("reg_input"));
		fname.sendKeys("MOHAMMED");
		WebElement lname = driver.findElement(By.id("last_name"));
		lname.sendKeys("BAVASHA");
		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys("my home");
		WebElement card = driver.findElement(By.id("cc_num"));
		card.sendKeys("1234567890123456");
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		cardtype.click();
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		WebElement cardexp = driver.findElement(By.id("cc_exp_month"));
		cardexp.click();
		a.keyPress(KeyEvent.VK_DOWN);
		a.keyRelease(KeyEvent.VK_DOWN);
		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		WebElement cardmnth = driver.findElement(By.id("cc_exp_year"));
		cardmnth.click();

		for (int i = 0; i <= 11; i++) {
			a.keyPress(KeyEvent.VK_DOWN);
			a.keyRelease(KeyEvent.VK_DOWN);
		}

		a.keyPress(KeyEvent.VK_ENTER);
		a.keyRelease(KeyEvent.VK_ENTER);
		WebElement ccv = driver.findElement(By.id("cc_cvv"));
		ccv.sendKeys("000");
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();

		Thread.sleep(10000);
		WebElement orderno = driver.findElement(By.id("order_no"));
		String am = orderno.getAttribute("value");
		System.out.println(am);
		
		// git own repo
		System.out.println("Ashick");
	}
	
	

}