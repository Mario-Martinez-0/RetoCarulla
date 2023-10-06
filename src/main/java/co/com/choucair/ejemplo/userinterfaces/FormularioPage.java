package co.com.choucair.ejemplo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioPage {

    public static final Target RBT_MULTIPLOS = Target.the("Selecciona todos los multiplos")
            .locatedBy("//input[@value='{0}']");
    public static final Target TXT_SUMAR_SECUENCIA = Target.the("Indica cuantas imagenes hay en la siguiente secuencia")
            .located(By.name("number"));
    public static final Target RBT_OPERACION_MATEMATICA = Target.the("Complete la siguiente operacion matematica")
            .locatedBy("//input[@value='{0}' and @name='radio']");
    public static final Target TXT_FECHA = Target.the("Indique la fecha que corresponde")
            .located(By.name("date"));
    public static final Target LBL_MENSAJE = Target.the("Mensaje de exito")
            .locatedBy("//h1");

    private FormularioPage(){

    }

}

