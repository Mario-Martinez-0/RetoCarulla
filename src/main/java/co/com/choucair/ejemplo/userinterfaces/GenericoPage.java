package co.com.choucair.ejemplo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class GenericoPage {

    public static final Target BTN_ENVIAR = Target.the("Boton enviar")
            .locatedBy("//button[@type='submit']");

    private GenericoPage() {
    }
}
