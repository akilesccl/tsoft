package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilidades.ClaseBase;

public class home extends ClaseBase {

	public home(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	//getterSetter
	
	
	
	
	
	By locatorShop = By.linkText("Shop");
	
	public void irShop() {
		if(estaHabilitado(locatorShop)) {
			click(locatorShop);
		}
	}
	
	By locatorBrebajeria = By.linkText("Brebajeria");
	
	public void irBrebajeria() {
		if(estaHabilitado(locatorBrebajeria));
		click(locatorBrebajeria);
	}
	
	By locatorBar = By.linkText("Bar Tamango");
	public void irBar() {
		if(estaHabilitado(locatorBar));
		click(locatorBar);
		
	}

	
	By locatorClub = By.linkText("Club");
	public void irClub() {
		if (estaHabilitado(locatorClub));
		click(locatorClub);
	}
	
	By locatorIngresa = By.linkText("Ingresa");
	public void irIngresa() {
		if (estaHabilitado(locatorIngresa));
		click(locatorIngresa);
	}
	
	
	
	
	
}

