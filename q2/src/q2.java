
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //System.out.println("hi");
    System.setProperty(" webdriver.chrome.driver", "C:\\browser driver"); 
     ChromeDriver driver=new ChromeDriver();
      driver.get("http://www.google.com");
    //EdgeDriver driver1=new EdgeDriver();
    //driver.get("https://www.bing.com/search?q=edge.com&form=ANNTH1&refig=4faa20f0981241238ce3914efe06be5a&pc=DCTS");
    //System.setProperty(" webdriver.edge.driver", "C:\\browser driver\\msedgedriver.exe");
	}
	
}
