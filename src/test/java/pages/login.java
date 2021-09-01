package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilidades.ClaseBase;

public class login extends ClaseBase {
	
	public login(WebDriver driver) {
		super(driver);
	}
	
	By locatorIngresa = By.xpath("//body/div[1]/div[9]/a[1]");
	
	public void irIngresar() {
		if(estaHabilitado(locatorIngresa)){
			click(locatorIngresa);
		}
	}

	public By getLocatorIngresa() {
		return locatorIngresa;
	}

	public void setLocatorIngresa(By locatorIngresa) {
		this.locatorIngresa = locatorIngresa;
	}
		
	
	public void CompletarLogin(String email, String Password) {
		
	}
	
	
	

}
