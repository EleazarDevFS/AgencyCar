
package Controlador;
// Clase abstracta Empleado que hereda de Persona
public abstract class Empleado extends Persona {
    protected String idEmpresa;
    protected String fechaIngreso;
    protected String estado;
    protected String ubicacion;
    protected String telefono;
    protected String email;

    public Empleado(String idEmpresa, String nombre, String apellidoP, String apellidoM, String fechaNacimiento,
                    String fechaIngreso, String estado, String ubicacion, String telefono, String email) {
        super(nombre, apellidoP, apellidoM, fechaNacimiento);
        this.idEmpresa = idEmpresa;
        this.fechaIngreso = fechaIngreso;
        this.estado = estado;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.email = email;
    }

    // Getters y Setters
    public String getIdEmpresa() { return idEmpresa; }
    public void setIdEmpresa(String idEmpresa) { this.idEmpresa = idEmpresa; }

    public String getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(String fechaIngreso) { this.fechaIngreso = fechaIngreso; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}