package testNGclass;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HendleXpath {
	
	@Test
	public void Hendlexpath() {
		
	System.setProperty("webdriver.chrome.driver", "./DriverBrowser/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.wikipedia.org/");
    driver.manage().window().maximize();
    
/*    // This line for Search box Xpath
    WebElement dropdown = driver.findElement(By.xpath(".//*[@id='searchLanguage']"));
    
    // This line for drop down menu
    Select select = new Select(dropdown);
    
   // search by name
   // select.selectByVisibleText("Eesti");
    
   // search by value
   // select.selectByValue("hi");
    
   // This line create for multiple elements
   List<WebElement> values = driver.findElements(By.tagName("option"));
   
   // This line for specific value or get Name
   // System.out.println(values.get(7).getText());
   
   // This line for whole values
   System.out.println("Total values in drop down are "+ values.size());
   
   for (int i =0; i<values.size(); i ++) {
   System.out.println(values.get(i).getAttribute("lang"));
	   
  }
  System.out.println(">>>>>>>> Printing all links text and count>>>>>>>>>> ");*/
  
  
  List<WebElement> links = driver.findElements(By.tagName("a"));
  System.out.println(links.size());
  for(WebElement link: links) {
  System.out.println(link.getText()+ ">>>>>>URL is<<<<<<" + link.getAttribute("href"));
  }
  }}
