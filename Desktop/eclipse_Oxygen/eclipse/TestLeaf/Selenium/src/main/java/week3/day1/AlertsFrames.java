package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByTagName("button").click();
		Alert myAlert = driver.switchTo().alert();
		myAlert.getText();
		System.out.println(myAlert.getText());
		myAlert.sendKeys("subhashree");
		myAlert.accept();
		String text = driver.findElementByTagName("p").getText();
		if(text.contains("subhashree")) {
			System.out.println("name matched");
		}
			else {
				System.out.println("Name doesnt match");
				}
		driver.switchTo().defaultContent();
		driver.findElementById("tryhome").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listOfWindowHandles = new ArrayList<String>();
		listOfWindowHandles.addAll(windowHandles);
		driver.switchTo().window(listOfWindowHandles.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(listOfWindowHandles.get(0));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		
		
		
		}

	private static List<String> addAll(Set<String> windowHandles) {
		// TODO Auto-generated method stub
		return null;
	}
		
		
		
		
		
		
	
	
	}


