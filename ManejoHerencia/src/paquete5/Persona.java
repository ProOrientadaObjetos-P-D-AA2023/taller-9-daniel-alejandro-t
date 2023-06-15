package paquete5;

public class Persona {
    private String nombres;
    private String apellidos;
    private int edad;
    private String username;
    
    public Persona(String n, String a, int e, String u){
        nombres = n;
        apellidos = a;
        edad = e;
        username = u;
    }
    
    public void establecerNombres(String n){
        nombres = n;
    }
    
    public String obtenerNombres(){
        return nombres;
    }
    
    public void establecerApellidos(String n){
        apellidos = n;
    }
    
    public String obtenerApellidos(){
        return apellidos;
    }
    
    public void establecerEdad(int n){
        edad = n;
    }
    
    public int obtenerEdad(){
        return edad;
    }

    public void establecerUsername(String n){
        username = n;
    }

    public String obtenerUsername(){
        return username;
    }
    
    @Override
    public String toString(){
        return String.format("Nombres: %s - Apellidos: %s - Edad: %d",
                obtenerNombres(),
                obtenerApellidos(),
                obtenerEdad());
    }
    
}
