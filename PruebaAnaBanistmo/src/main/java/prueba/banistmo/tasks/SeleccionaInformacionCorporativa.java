package prueba.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static prueba.banistmo.userinterfaces.AcercaNosotrosPage.*;

public class SeleccionaInformacionCorporativa implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
	            Click.on(BOTON_INFORMACION_CORPORATIVA)	            
	        );
	}

	public static SeleccionaInformacionCorporativa seleccionarBoton() {
		return instrumented(SeleccionaInformacionCorporativa.class);
	}
	

}
