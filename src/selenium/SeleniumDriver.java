package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class SeleniumDriver {
	
	WebDriver driver;
	
	public void openBrowseOnUrl(String browse,String url ) {
		if(browse.equalsIgnoreCase("htmlunit"))
			driver = new HtmlUnitDriver();
		driver.navigate().to(url);
		          
	}
	
	public void inputStringWithXpath(String str,String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		element.sendKeys(str);
	}
	
	public void clickWithXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		element.click();
	}
	
	public void closeBrowse() {
		driver.close();
	}

	public static void main(String[] args) {
		SeleniumDriver driver = new SeleniumDriver();
		driver.openBrowseOnUrl("htmlunit", "https://www.baidu.com");
		driver.inputStringWithXpath("xebium", "//*[@id='kw']");
		driver.clickWithXpath("//*[@id='su']");
		driver.closeBrowse();

	}

}
