package prueba.banistmo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class AcercaNosotrosPage extends PageObject{
	public static final Target BOTON_INFORMACION_CORPORATIVA = Target.the("Boton información corporativa").locatedBy("//a[@class='dropdown-toggle']");
	public static final Target OPCION_PROVEEDORES_DESPLEGABLE = Target.the("Opción proveedores del desplegable").locatedBy("//a[@href='/wps/portal/banistmo/acerca-de/informacion-corporativa/proveedores']");
}
