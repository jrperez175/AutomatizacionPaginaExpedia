package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BusquedaPage {
	WebDriver driver;

	public void ingresoHotel() {
		driver.findElement(By.id("tab-hotel-tab-hp")).click();;
	}
	
	public void ingresarDestino(String destino) {
		// Caja de texto Destino
		driver.findElement(By.id("hotel-destination-hp-hotel")).clear();
		driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys(destino);
	}
	
	public void ingresarFechaInicial(String fecIni) {
		// Caja de texto Fecha Incial
		driver.findElement(By.id("hotel-checkin-hp-hotel")).sendKeys(fecIni);
	}
	
	public void ingresarFechaFinal(String fecFin) {
		// Caja de texto Fecha Incial
		driver.findElement(By.id("hotel-checkout-hp-hotel")).clear();
		driver.findElement(By.id("hotel-checkout-hp-hotel")).sendKeys(fecFin);
	}
	
	public void clicBotonBuscar(){
		//driver.findElement(By.className("btn-primary btn-action  gcw-submit")).click();
		
		this.driver.findElement(By.id("hotel-destination-hp-hotel")).submit();
	}
	
	public void ingresarUrl() {
		String url = "https://www.expedia.com/";

		// Maximizar la ventana del navegador
		driver.manage().window().maximize();

		// Ingresar a la URL
		driver.get(url);

	}
	
	
	
	public BusquedaPage(WebDriver driver) { // constructor
		this.driver = driver;

	}
	
}
