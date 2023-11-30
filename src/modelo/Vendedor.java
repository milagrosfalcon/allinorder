
package modelo;

/**
 *
 * @author milag
 */
public class Vendedor {
    int id;
    String dni;
    String nombres;
    String telefono;
    String estado;
    String usuario;
  
    
    public Vendedor(){
}

    public Vendedor(int id, String dni, String nombres, String telefono, String estado, String usuario) {
        this.id = id;
        this.dni = dni;
        this.nombres = nombres;
        this.telefono = telefono;
        this.estado = estado;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

   
    
}
