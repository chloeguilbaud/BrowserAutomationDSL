import org.junit.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;


public class test5 {
	
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
 		List<WebElement> checkboxes = driver.findElements(By.className("test"));
 		checkboxes.forEach((checkBox) -> {
 		if(checkBox.isSelected()){
 		    checkBox.click();
 		}
 		});
 		element = driver.findElement(By.xpath("//*[contains(text(), 'Anglais')]"));
 		if(!element.isSelected()){
 			element.click();
 		}
 		element = driver.findElement(By.xpath("//*[contains(text(), 'A domicile')]"));
 		if(!element.isSelected()){
 			element.click();
 		}
 		element = null;
 		elements = driver.findElements(By.id("edit-btn-submit"));
 		for (WebElement e : elements) {
 			if (!e.getTagName().isEmpty()) {
 				jse.executeScript("window.scrollTo("+ e.getLocation().x + ", " + (e.getLocation().y - e.getRect().height * 3) + ")");
 				element = e;
 			}
 		}
 		element.click();
 		element = null;
 		elements = driver.findElements(By.xpath("//*[contains(text(), 'Aucune formation trouvée répondant à vos critères')]"));
 		for (WebElement e : elements) {
 			if (!e.getTagName().isEmpty()) {
 				jse.executeScript("window.scrollTo("+ e.getLocation().x + ", " + (e.getLocation().y - e.getRect().height * 3) + ")");
 				element = e;
 			}
 		}
 		assertTrue(element != null);
 	}
}
