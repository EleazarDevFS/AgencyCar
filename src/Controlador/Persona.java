
package Controlador;

// Clase Persona
public class Persona {
    protected String nombre;
    protected String apellidoP;
    protected String apellidoM;
    protected String fechaNacimiento;

    public Persona(String nombre, String apellidoP, String apellidoM, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidoP() { return apellidoP; }
    public void setApellidoP(String apellidoP) { this.apellidoP = apellidoP; }

    public String getApellidoM() { return apellidoM; }
    public void setApellidoM(String apellidoM) { this.apellidoM = apellidoM; }

    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
}