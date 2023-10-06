package co.com.choucair.ejemplo.stepdefinitions;

import co.com.choucair.ejemplo.models.Respuesta;
import co.com.choucair.ejemplo.tasks.DiligenciarFormulario;
import co.com.choucair.ejemplo.tasks.IniciarSesion;
import co.com.choucair.ejemplo.userinterfaces.MainPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;
import java.util.Map;

import static co.com.choucair.ejemplo.userinterfaces.FormularioPage.LBL_MENSAJE;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.Is.is;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.Is.is;

public class EvalartStepDefinition {


    @Dado("que {} ingresa a la aplicacion de Evalart")
    public void queCristinaIngresaALaAplicacionDeEvalart(String actor, Map<String, String> credenciales) {

        theActorCalled(actor).wasAbleTo(
               Open.browserOn().the(MainPage.class),
                IniciarSesion.enEvalart(credenciales)
        );
    }

    @Cuando("Diligencia formulario de pruebas")
    public void diligenciaFormularioDePruebas(List<Respuesta> respuestas) {

        // se recorre con un for each de java 8
        respuestas.forEach(respuesta -> {
            theActorInTheSpotlight().attemptsTo(
                    DiligenciarFormulario.enEvalart(respuesta)
            );
        });

    }

    @Entonces("puede visualizar el mensaje {}")
    public void puedeVisualizarElMensaje(String mensaje) {
        theActorInTheSpotlight().should(
                seeThat(Text.of(LBL_MENSAJE),is(mensaje))
        );
    }
}
