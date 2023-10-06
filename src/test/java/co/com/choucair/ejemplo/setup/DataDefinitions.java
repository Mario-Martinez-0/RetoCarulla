package co.com.choucair.ejemplo.setup;

import co.com.choucair.ejemplo.models.Respuesta;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataDefinitions {

    @DataTableType
    public Respuesta respuestas(Map<String, String> datos){
        return new Respuesta(
                datos.get("Multiplos"),
                datos.get("Secuencia"),
                datos.get("Operacion"),
                datos.get("Fecha")
        );
    }
}
