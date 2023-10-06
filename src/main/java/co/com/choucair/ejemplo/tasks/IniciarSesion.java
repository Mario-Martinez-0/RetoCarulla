package co.com.choucair.ejemplo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Map;

import static co.com.choucair.ejemplo.userinterfaces.GenericoPage.BTN_ENVIAR;
import static co.com.choucair.ejemplo.userinterfaces.LoguinPage.TXT_CONTRASENA;
import static co.com.choucair.ejemplo.userinterfaces.LoguinPage.TXT_USUARIO;


public class IniciarSesion implements Task {
    private final Map<String, String> credenciales;

    public IniciarSesion(Map<String, String> credenciales) {
        this.credenciales = credenciales;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.angularRequestsHaveFinished(),
                Enter.keyValues(credenciales.get("Usuario")).into(TXT_USUARIO),
                Enter.keyValues(credenciales.get("Contrasena")).into(TXT_CONTRASENA),
                Click.on(BTN_ENVIAR)
        );

    }
    public static IniciarSesion enEvalart(Map<String, String> credenciales){
        return Tasks.instrumented(IniciarSesion.class, credenciales);
    }
}
