package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.remote.DesiredCapabilities;

public class test3 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("marionette", true);
//		driver = new FirefoxDriver(capabilities);
		driver = new ChromeDriver(capabilities);
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		WebElement element = null;
		List<WebElement> elements;
		driver.get("http://www.imt-atlantique.fr/fr");
		
		elements = driver.findElements(By.xpath("//*[contains(text(), 'Toutes les actualités')]"));
		for (WebElement e : elements) {
			if (!e.getTagName().isEmpty()) {
				jse.executeScript("window.scrollTo("+ e.getLocation().x + ", " + (e.getLocation().y - e.getRect().height * 3) + ")");
				element = e;
			}
		}
		
		element.click();
//		element = wait.until(ExpectedConditions.visibilityOfElementLocated());
//		jse.executeScript("arguments[0].scrollIntoView();", element);
//		Thread.sleep(5000);
//		jse.executeScript("window.scrollTo(" + element.getLocation().x + ", " + (element.getLocation().y - element.getRect().height * 3) + ")");
//		System.out.println("TRy");
//		jse.executeScript("console.log('Je suis un fils de pute de sélénium de merde');", element);
//
//		System.out.println("fini");
//		Thread.sleep(500);
//		System.out.println("3");
//		element.click();
//		System.out.println("wola");
//		driver.findElement(By.xpath("//*[@alt='Acceuil')]")).click();
//		System.out.println("4");
//		assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'Toutes les activités')]")) != null);
//		System.out.println("5");
	}
	
	private static WebElement getElement(By by) {
		List<WebElement> elements = driver.findElements(by);
		for (WebElement e : elements) {
			if (!e.getTagName().isEmpty()) {
				System.out.println("Trouvé");
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", e);
				return e;
			}
		}
		return null;
	}
}
