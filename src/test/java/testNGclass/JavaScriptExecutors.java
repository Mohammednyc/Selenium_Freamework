package testNGclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class JavaScriptExecutors {
        public static void main(String args[]) throws Exception {
        System.setProperty("webdriver.gecko.driver","./DriverBrowser/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.automationtesting.in/Index.html");
        driver.manage().window().maximize();
        
        //JavaScriptExecutor to execute the JavaScript to interact with the web elements. 
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        //How to enter value into textbox:
        js.executeScript("document.getElementById('email').value='krishna@gmail.com'");
        
        //How to click a button
        js.executeScript("document.querySelector('#enterimg').click()");
        
         //How to refresh a window:     
        js.executeScript("history.go(0)");
        
        //How to get the text of a particular web element:
        String text = js.executeScript("return document.getElementById('btn2').innerHTML").toString();
        System.out.println("WebElement Text is : "+ text);
        
        //How to get the title of the WebPage:
        String text1 = js.executeScript("return document.title").toString();
        System.out.println("Page Title is : "+ text1);
        
    //How to scroll vertically for certain pixels:
        js.executeScript("window.scrollBy(0,500)");
        
    //How to scroll till the bottom of the web page:
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
    //How to scroll to a particular element:
        js.executeScript("document.querySelector('#countries').scrollIntoView()");
        
    //How to navigate back to page:
        js.executeScript("window.history.back()");
        
    //How to navigate to next page:
        js.executeScript("window.history.forward()");
        
        
        
        
        
        
 
      

}}
