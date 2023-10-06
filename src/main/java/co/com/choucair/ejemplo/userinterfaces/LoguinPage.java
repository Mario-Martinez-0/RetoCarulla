package co.com.choucair.ejemplo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoguinPage {

    public static final Target TXT_USUARIO = Target.the("Campo usuario")
            .located(By.name("username"));
    public static final Target TXT_CONTRASENA = Target.the("Campo contraseña")
            .located(By.name("password"));


    private LoguinPage() {
    }
}
