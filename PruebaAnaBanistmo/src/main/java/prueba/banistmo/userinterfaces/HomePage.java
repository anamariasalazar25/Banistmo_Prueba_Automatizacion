package prueba.banistmo.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class HomePage extends PageObject{
	public static final Target BOTON_ACERCA_NOSOTROS = Target.the("Boton acerca de nosotros").locatedBy("//a[@href='/wps/portal/banistmo/acerca-de']");
	public static final Target BOTON_CERRAR_VENTANA = Target.the("Boton cerrar Ventana aviso privacidad").located(By.id("btn-aceptar-cookies"));
	
}
