import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void mySetup() {
		driver.get("https://www.saucedemo.com/");

		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void myTest() {
		String Username="standard_user";
		String Password="secret_sauce";
		
		WebElement userNameInput = driver.findElement(By.id("user-name"));
		WebElement PasswordInput = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.id("login-button"));

	

		userNameInput.sendKeys(Username);
		PasswordInput.sendKeys(Password);
		LoginButton.click();

	}
	@Test(priority = 2)
	public void addtoCartAllItems() {
		
		List<WebElement> AddToCartButtons = driver.findElements(By.className("btn"));
		
		for(int i=0; i<AddToCartButtons.size(); i++ /*i=i+2*/) {
			AddToCartButtons.get(i).click();
			
			if(i==3) {
				break;
			}
		}
		
		
		
	}
	
	

}
