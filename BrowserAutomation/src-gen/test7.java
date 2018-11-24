import org.junit.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertTrue;

public class test7 {
	
	@Test
 	public void main() {
 		WebElement element;
 		WebDriver driver = new FirefoxDriver();
 		driver.get("http://www.imt-atlantique.fr/fr");
 		String monUrl = driver.findElement(By.className("actu_home_ctner_inner_cell1_titre"));
 		driver.get("http://www.imt-atlantique.fr/fr/rechercher");
 		element = driver.findElement("SEARCHFILED");
 		element.click();
 		element.clear();
 		element.sendKeys(monUrl);
 		driver.findElement(By.xpath("//*[contains(text(), 'Appliquer les filtres')]")).click();
 		assertTrue(driver.findElement(By.xpath(monUrl)) != null);
 	}
}
