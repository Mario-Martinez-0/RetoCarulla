package co.com.choucair.ejemplo.tasks;

import co.com.choucair.ejemplo.interactions.SeleccionarMultiplos;
import co.com.choucair.ejemplo.models.Respuesta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.ejemplo.userinterfaces.FormularioPage.*;
import static co.com.choucair.ejemplo.userinterfaces.GenericoPage.BTN_ENVIAR;

public class DiligenciarFormulario implements Task {

    private final Respuesta respuesta;

    public DiligenciarFormulario(Respuesta respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                SeleccionarMultiplos.delformulario(respuesta.getMultiples()),
                Enter.theValue(respuesta.getSecuencia()).into(TXT_SUMAR_SECUENCIA),
                Click.on(RBT_OPERACION_MATEMATICA.of(respuesta.getOperacion())),
                Enter.theValue(respuesta.getFecha()).into(TXT_FECHA),
                Click.on(BTN_ENVIAR)
        );

    }
    public static DiligenciarFormulario enEvalart(Respuesta respuesta){
        return Tasks.instrumented(DiligenciarFormulario.class, respuesta);
    }
}
