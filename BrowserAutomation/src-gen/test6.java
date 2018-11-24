import org.junit.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertTrue;

public class test6 {
	
	@Test
 	public void main() {
 		WebElement element;
 		WebDriver driver = new FirefoxDriver();
 		driver.get("http://www.imt-atlantique.fr/fr");
 		element = driver.findElement("SEARCHFILED");
 		element.click();
 		element.clear();
 		element.sendKeys("2007");
 		new Select(web.findElement(By.id("test"))).selectByValue("Le mois dernier");
 		driver.findElement(By.xpath("//*[contains(text(), 'Appliquer les filtres')]")).click();
 		assertTrue(driver.findElement(By.xpath("Aucun réultat ne correspond à votre recherche"))) != null);
 	}
}
