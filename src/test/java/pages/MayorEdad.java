package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilidades.ClaseBase;

public class MayorEdad extends ClaseBase{

	public MayorEdad(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	


	By locatorMayorEdad = By.xpath("//p[contains(text(),'Necesitas ser mayor de 18 años para poder ingresar')]");
	By locatorBtnSi = By.xpath("//button[contains(text(),'Sí')]");

public String ObtenerMensajeMayor() {
	esperarXSegundos(3000);
	return obtenerTexto(esperaExplicita(locatorMayorEdad));
}

public void SiMayorEdad() {
	if(estaHabilitado(locatorMayorEdad));
	click(locatorBtnSi);
	
}


	
}
