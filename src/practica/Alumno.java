package practica;

public class Alumno {
	
    private String nombre;
    private String apellido;
    private String dni;
    
    public Alumno(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    
    public String toString() {
        return "Alumno: " + nombre + " " + apellido + " - DNI: " + dni;
    }
    
    public Alumno() {
        this.nombre = "Desconocido";
        this.apellido = "Desconocido";
        this.dni = "00000000X";
    }
    
}