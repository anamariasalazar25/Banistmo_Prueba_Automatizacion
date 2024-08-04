package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import prueba.banistmo.tasks.SeleccionaBotonConoceMas;
import prueba.banistmo.tasks.SeleccionaInformacionCorporativa;
import prueba.banistmo.tasks.SeleccionaOpcionProveedores;
import prueba.banistmo.tasks.ValidaVentanaEmergente;
import prueba.banistmo.tasks.ScrollToElement;
import prueba.banistmo.tasks.SeleccionaAcercaNosotrosHome;
import prueba.banistmo.userinterfaces.HomePage;
import prueba.banistmo.userinterfaces.ProveedoresPage;

public class BanistmoStep {
	
	@Managed(driver = "chrome")
	private WebDriver navegador;
	private Actor actor= Actor.named("Banistmo");
	private HomePage homePage= new HomePage();
	
	@Given("^que un usuario esta en la pagina de banistmo$")
	public void queUnUsuarioEstaEnLaPaginaDeBanistmo() {
		actor.can(BrowseTheWeb.with(navegador));
		actor.wasAbleTo(Open.browserOn(homePage));		
	}

	@When("^selecciona la opcion acerca de nosotros$")
	public void seleccionaLaOpcionAcercaDeNosotros() throws InterruptedException {
		Thread.sleep(TimeUnit.SECONDS.toMillis(5));
		
		actor.wasAbleTo(
				SeleccionaAcercaNosotrosHome.seleccionar()
				);
	}

	@When("^selecciona la opcion informacion corporativa$")
	public void seleccionaLaOpcionInformacionCorporativa() throws InterruptedException {
		
		actor.wasAbleTo(
				SeleccionaInformacionCorporativa.seleccionarBoton()
				);
	}

	@When("^selecciona la opcion proveedores del menu desplegado$")
	public void seleccionaLaOpcionProveedoresDelMenuDesplegado() throws InterruptedException {
		
		Thread.sleep(TimeUnit.SECONDS.toMillis(2));
		actor.wasAbleTo(
				SeleccionaOpcionProveedores.seleccionarOpcion()
				);
	}

	@When("^selecciona el boton conoce mas$")
	public void seleccionaElBotonConoceMas() throws InterruptedException {
		
		Thread.sleep(TimeUnit.SECONDS.toMillis(2));
		actor.wasAbleTo(
				ScrollToElement.scrollTo(ProveedoresPage.BOTON_CONOCE_MAS),				
				SeleccionaBotonConoceMas.seleccionarBotonConoceMas()
				);
	}

	@Then("^valida que la pantalla emergente sea la correcta$")
	public void validaQueLaPantallaEmergenteSeaLaCorrecta() throws InterruptedException {
		
		Thread.sleep(TimeUnit.SECONDS.toMillis(5));
		actor.wasAbleTo(
				 ValidaVentanaEmergente.conTexto(ProveedoresPage.TITULO_PANTALLA_EMERGENTE,"Aviso de Convocatoria")
				);
		Thread.sleep(TimeUnit.SECONDS.toMillis(2));
	}
}
