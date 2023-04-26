package uax.poo.ejerciciosDeClase.banco;

public class Cliente {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private String direccion;
    private String telefono;
    private String email;

    public Cliente(String nombre, String apellido1, String apellido2, String dni, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public Cliente(String dni, String nombre, String apellido1, String email) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
