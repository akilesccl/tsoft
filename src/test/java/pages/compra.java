package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilidades.ClaseBase;

public class compra extends ClaseBase{

	public compra(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By locatorAgregar = By.linkText("Agregar");
	
	public void Agregar() {
		if(estaDesplegado(locatorAgregar)) {
			click(locatorAgregar);
		}
		
	}
	
	By locatorCarrito = By.xpath("//body/nav[1]/div[1]/div[2]/div[3]/div[1]/div[4]/div[1]/img[1]");
	public void Carrito() {
		if(estaDesplegado(locatorCarrito)) {
			click(locatorCarrito);
		}
	}
	
	
	By locatorPagar = By.xpath("//a[contains(text(),'Ir a Pagar')]");
	public void Pagar() {
		if(estaDesplegado(locatorPagar));
		click(locatorPagar);
	}
}
