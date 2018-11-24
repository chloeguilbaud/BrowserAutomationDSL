import org.junit.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;


public class test3 {
	
	@Test
 	public void main() {
 		List<WebElement> elements;
 		WebElement element = null;
 		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
 		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
 		capabilities.setCapability("marionette", true);
 		WebDriver driver = new FirefoxDriver(capabilities);
 		
 		JavascriptExecutor jse = ((JavascriptExecutor) driver);
 		driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
 		driver.get("http://www.imt-atlantique.fr/fr");
 		element = null;
 		elements = driver.findElements(By.xpath("//*[contains(text(), 'Toutes les actualités')]"));
 		for (WebElement e : elements) {
 			if (!e.getTagName().isEmpty()) {
 				jse.executeScript("window.scrollTo("+ e.getLocation().x + ", " + (e.getLocation().y - e.getRect().height * 3) + ")");
 				element = e;
 			}
 		}
 		element.click();
 		element = null;
 		elements = driver.findElements(By.xpath("//img[contains(@alt, 'Accueil')]"));
 		for (WebElement e : elements) {
 			if (!e.getTagName().isEmpty()) {
 				jse.executeScript("window.scrollTo("+ e.getLocation().x + ", " + (e.getLocation().y - e.getRect().height * 3) + ")");
 				element = e;
 			}
 		}
 		element.click();
 		element = null;
 		elements = driver.findElements(By.xpath("//*[contains(text(), 'Toutes les actualités')]"));
 		for (WebElement e : elements) {
 			if (!e.getTagName().isEmpty()) {
 				jse.executeScript("window.scrollTo("+ e.getLocation().x + ", " + (e.getLocation().y - e.getRect().height * 3) + ")");
 				element = e;
 			}
 		}
 		assertTrue(element != null);
 	}
}
