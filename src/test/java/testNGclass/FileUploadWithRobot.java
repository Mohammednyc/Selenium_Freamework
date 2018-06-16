package testNGclass;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/*@SuppressWarnings("unused")
public class RobotClass {
	 @Test
	 public void TestRobo()throws Exception {
	  // Open Firefox
	  WebDriver driver=new FirefoxDriver();
	                
	  // Maximize the window
	  driver.manage().window().maximize();
	 
	  // Open facebook
	  driver.get("http://www.facebook.com");
	 
	  // Enter Username
	  driver.findElement(By.id("email")).sendKeys("Selenium@gmail.com");
	 
	  // Enter password
	  driver.findElement(By.id("pass")).sendKeys("mukesh");
	  
	 
	  // Create object of Robot class
	   Robot r=new Robot();
	 
	   // Press Enter
	   r.keyPress(KeyEvent.VK_ENTER);
	 
	   // Release Enter
	   r.keyRelease(KeyEvent.VK_ENTER);}}*/

        public class FileUploadWithRobot{
        public static void main(String args[]) throws Exception{
        Robot robot = new Robot();
        System.setProperty("webdriver.gecko.driver","./DriverBrowser/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
 
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.findElement(By.id("imagesrc")).click();
        robot.setAutoDelay(2000);
 
        StringSelection selection = new StringSelection("D:\\Selenium\\Clean.bat");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
        robot.setAutoDelay(1000);
 
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
 
        robot.setAutoDelay(1000);
 
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER); }}

