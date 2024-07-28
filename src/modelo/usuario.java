package modelo;

/**
 *
 * @author MaykXZ
 */
public class usuario {
    private String nombre;
    private String apellido;
    private String contrasena;

    public usuario() {
        this.nombre= "";
        this.apellido ="";
        this.contrasena="";
    }

    public usuario(String nombre, String apellido, String contrasena) {
        setNombre(nombre);
        setApellido(apellido);
        setContrasena(contrasena);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", contrasena=" + contrasena + '}';
    }
    
    public void imprimir(){
        System.out.println("Nombre     : "+getNombre());
        System.out.println("Apellido   : "+getApellido());
        System.out.println("Contraseña : "+getContrasena());
    }
    
    
}
