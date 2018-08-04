package week4day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DragAndDrop {
	
	DesiredCapabilities dc = new DesiredCapabilities();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		//ChromeOptions op = new ChromeOptions();
		//op.setHeadless(true);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		WebElement eledroppable = driver.findElementByLinkText("Droppable");
		eledroppable.click();
		WebElement frameName = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frameName);
		WebElement eledrag = driver.findElementById("draggable");
		WebElement eledrop = driver.findElementById("droppable");
		Actions builder = new Actions(driver);
		builder.dragAndDrop(eledrag, eledrop).perform();
		
	}	

}
