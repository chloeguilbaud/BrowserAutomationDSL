import org.junit.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;


public class test9 {
	
	private WebDriver driver;
	private JavascriptExecutor jse;
	
	@Test
 	public void main() {
 		List<WebElement> elements;
 		WebElement element = null;
 		System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
 		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
 		capabilities.setCapability("marionette", true);
 		driver = new FirefoxDriver(capabilities);
 		
 		jse = ((JavascriptExecutor) driver);
 		driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
 		this.pro_1("Communiqués et dossiers de Presse");
 		this.pro_1("Visuels pour la Presse");
 		this.pro_1("La presse en parle");
 		this.pro_1("Tribunes de presse");
 		this.pro_1("Les palmarès");
 	}
 	public void pro_1(String pageName) {
 		List<WebElement> elements;
 		WebElement element = null;
 		driver.get("http://www.imt-atlantique.fr/fr");
 		element = null;
 		elements = driver.findElements(By.xpath("//*[contains(text(), '"+pageName+"')]"));
 		for (WebElement e : elements) {
 			if (!e.getTagName().isEmpty()) {
 				jse.executeScript("window.scrollTo("+ e.getLocation().x + ", " + (e.getLocation().y - e.getRect().height * 3) + ")");
 				element = e;
 			}
 		}
 		element.click();
 		element = null;
 		elements = driver.findElements(By.className("share_rs_btn_pr"));
 		for (WebElement e : elements) {
 			if (!e.getTagName().isEmpty()) {
 				jse.executeScript("window.scrollTo("+ e.getLocation().x + ", " + (e.getLocation().y - e.getRect().height * 3) + ")");
 				element = e;
 			}
 		}
 		assertTrue(element != null);
 		element = null;
 		elements = driver.findElements(By.className("share_rs_btn_pr"));
 		for (WebElement e : elements) {
 			if (!e.getTagName().isEmpty()) {
 				jse.executeScript("window.scrollTo("+ e.getLocation().x + ", " + (e.getLocation().y - e.getRect().height * 3) + ")");
 				element = e;
 			}
 		}
 		element.click();
 	}
}
