import org.junit.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertTrue;

public class test9 {
	
	@Test
 	public void main() {
 		WebElement element;
 		this.pro_1("COMMUNIQUES DE PRESSE");
 		this.pro_1("DOSSIERS DE PRESSE");
 		this.pro_1("VISUELS POUR LA PRESSE");
 		this.pro_1("LA PRESSE EN PARLE");
 		this.pro_1("TRIBUNE DE PRESSE");
 		this.pro_1("LE PARLMARES");
 	}
 	public void pro_1(String pageName) {
 		WebElement element;
 		WebDriver driver = new FirefoxDriver();
 		driver.get("http://www.imt-atlantique.fr/fr");
 		driver.findElement(By.xpath("//*[contains(text(), '"+pageName+"')]")).click();
 		assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'Imprimer')]")) != null);
 		driver.findElement(By.xpath("//*[contains(text(), 'Imprimer')]")).click();
 	}
}
