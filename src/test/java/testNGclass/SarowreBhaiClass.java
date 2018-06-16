package testNGclass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SarowreBhaiClass {
	    public static void main(String[] args) {
	/*	int maxsalary = 5000;
		ArrayList<Integer> salary = new ArrayList<Integer>();
		
		salary.add(3000);
		salary.add(3000);
		salary.add(5000);
		System.out.println(salary.size());
		System.out.println(salary);
		
		for (int i = 0; i > salary.size(); i ++) {
			
	    System.out.println(salary.get(i));
		if (maxsalary == salary.get(i)) {
		System.out.println(salary.get(i));*/
	    	
	    	System.setProperty("webdriver.chrome.driver", "./DriverBrowser/chromedriver.exe");
	    	WebDriver driver = new ChromeDriver();
	        driver.get("https://www.wikipedia.org/");
	        driver.manage().window().maximize();
	        
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        System.out.println(links.size());
	        
	        for(WebElement link: links) {
	        System.out.println(link.getText()+ ">>>>>>URL is<<<<<<" + link.getAttribute("href"));
		    }}}

	
			
			
			
			
			
			

            