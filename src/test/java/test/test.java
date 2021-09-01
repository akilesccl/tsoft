package test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.compra;
import pages.home;
import pages.login;
import utilidades.DataDriven;
import pages.MayorEdad;


public class test {
	
	private WebDriver driver;
	
	private String url;
	
	@AfterTest
	public void finTest() {
		driver.close();

	}
	
	@BeforeTest
	public void before() {
		String rutaDriver = Paths.get(System.getProperty("user.dir"),"\\src\\main\\resources\\drivers\\chromedriver.exe").toString();
		String navegador = "chrome";
		String propertyDriver = "webdriver.chrome.driver";
		
		
		mayorEdad.conexionDriver(navegador, rutaDriver, propertyDriver);		
		
		url ="https://www.tamango.cl/";
		
		
		mayorEdad = new MayorEdad(mayorEdad.getDriver());
		
	}
	
	
	@Test
	public void CP001_ValidaciónMayorEdad() throws IOException  {
		driver.get(url);
		mayorEdad.ObtenerMensajeMayor();
		mayorEdad.SiMayorEdad();
		
		
	}
	
	
	@Test
	public void CP002_AgregarPilsen()  throws IOException{
		
		
	}
	
	@Test
	public void CP003_Login()  throws IOException{
		
		
	}
	
	@Test
	public void CP005_BarTamango()  throws IOException{
		driver.findElement(By.linkText("/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/div[1]/input[1]"));
		
	}
	@Test
	public void CP005_Club()  throws IOException{
		
	}
	
	@Test
	public void CP006_EliminarCarro()  throws IOException{
		
	}
	
	@Test
	public void CP007_Contacto()  throws IOException{
		
	}
	
	@Test
	public void CP008_AgregarPoleras()  throws IOException{
		
	}

}
