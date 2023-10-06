package co.com.choucair.ejemplo.models;

public class Respuesta {

    private String multiples;
    private String secuencia;
    private String operacion;
    private String fecha;

    public Respuesta(String multiples, String secuencia, String operacion, String fecha) {
        this.multiples = multiples;
        this.secuencia = secuencia;
        this.operacion = operacion;
        this.fecha = fecha;
    }

    public String getMultiples() {
        return multiples;
    }

    public String getSecuencia() {
        return secuencia;
    }

    public String getOperacion() {
        return operacion;
    }

    public String getFecha() {
        return fecha;
    }
}
