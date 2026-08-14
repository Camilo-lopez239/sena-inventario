package co.edu.sena.inventario.model;

public class Clientes {
    private long id;
    private String nombre;
    private String correoElectronico;
    private String numeroTelefono;
    private String direccion;

    public Clientes(Long id, String nombre, String correoElectronico, String numeroTelefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
    }

    public Long getId() {return id;}
    public String getNombre() {return nombre;}
    public String getCorreoElectronico() {return correoElectronico;}
    public String getNumeroTelefono() {return numeroTelefono;}
    public String getDireccion() {return direccion;}

}
