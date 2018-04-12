package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BusquedaPage;
import cucumber.api.java.en.And;


public class BusquedaSteps {
	
	public WebDriver driver;
	BusquedaPage busquedapage;
	

	@Before
	public void setup() {
		// definir navegador de la automatizacion -emulador-
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

		// definir una instancia objeto
		driver = new ChromeDriver();
		busquedapage = new BusquedaPage(driver);
		
	}
	
//	@After
//	public void tearDown() {
//		driver.close();
//	}

	@Given("Dado que el usuario esta en la pagina de busqueda")
	public void usuarioEstaEnPaginaLogin() {
		busquedapage.ingresarUrl();
	}
	
	@When ("el usuario haga click en el boton Hotel")
    public void usuarioClicBotonHotel() {
    	
    	busquedapage.ingresoHotel();
						
    }
    @And ("y elija el destino")
    public void usuarioIngresaDestino() {
    	busquedapage.ingresarDestino("MEDELLIN COLOMBIA");
    }
    
    @And ("y defina la Fecha Inicial")
    public void usuarioIngresaFechaInicial() {
    	busquedapage.ingresarFechaInicial("04/15/2018");
    }
    
    @And ("y defina la Fecha Final")
    public void usuarioIngresaFechaFinal() {
    	busquedapage.ingresarFechaFinal("04/20/2018");
    }
    
    @And ("y haga click en el boton Buscar")
    public void usuarioClicBontonBuscar() {
    	busquedapage.clicBotonBuscar();
    }
    
    @Then("el usuario puede ver las lista de hoteles consultados")
	public void usuarioVeListaHoteles(){

		String resultado = " "; //loginpage.ingresoErroneo();
		assertEquals("Invalid password, try again!", resultado);

	}

}
