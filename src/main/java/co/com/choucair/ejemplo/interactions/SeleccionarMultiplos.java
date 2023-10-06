package co.com.choucair.ejemplo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.Arrays;

import static co.com.choucair.ejemplo.userinterfaces.FormularioPage.RBT_MULTIPLOS;

public class SeleccionarMultiplos implements Performable {

    public final String multiplos;

    public SeleccionarMultiplos(String multiplos) {
        this.multiplos = multiplos;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        String[] listaDeMultiplos = multiplos.split(",");

        Arrays.stream(listaDeMultiplos).forEach(multiplo->{
            actor.attemptsTo(
                    Click.on(RBT_MULTIPLOS.of(multiplo))
            );
        });
    }
    public static SeleccionarMultiplos delformulario(String multiplos){
        return Tasks.instrumented(SeleccionarMultiplos.class, multiplos);
    }
}
