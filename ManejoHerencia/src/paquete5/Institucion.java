package paquete5;

public class Institucion {
    private String nombre;
    private String siglas;

    public Institucion(String n, String s) {
        nombre = n;
        siglas = s;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerSiglas(String n) {
        siglas = n;
    }

    public String obtenerSiglas() {
        return siglas;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s - Siglas: %s",
                obtenerNombre(),
                obtenerSiglas());
    }
    
}
