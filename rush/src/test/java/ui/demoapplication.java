package ui;
import org.openqa.selenium.By;//By class from the org.openqa.selenium package. The By class provides mechanisms for locating elements on a web page.
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class demoapplication {
public static void main(String[] args) {//entry point for the Java application. It takes an array of strings (args) as input.
	//System.setProperty(" webdriver.chrome.driver", "C:\\browser driver"); //for Selenium WebDriver to know where to find the ChromeDriver executable
    WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();// This instance represents a session of the Chrome web browser controlled by Selenium WebDriver.
    driver.get("http://www.ebay.com");
    driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");//corresponds to the search input field on the eBay homepage
	driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).click();
    driver.close();
}
}
//id ==XPath expression used to locate an HTML element 
//[@id=\\\"gh-ac\\\"]: Specifies an attribute condition. Here, it's looking for an element with an id attribute equal to "gh-ac".
//\": Represents an escaped double quote within a Java string.
//So "//*[@id=\\\"gh-ac\\\"]" effectively means "find any element in the document with the id attribute equal to 'gh-ac'".