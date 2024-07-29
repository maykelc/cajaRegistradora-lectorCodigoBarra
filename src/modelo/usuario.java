package modelo;

/**
 *
 * @author MaykXZ
 */
public class usuario {
    private Integer id_usuario;
    private String nombre;
    private String apellido;
    private String nombreUser;
    private String contrasena;
    

    public usuario() {
        this.id_usuario=0;
        this.nombre= "";
        this.apellido ="";
        this.nombreUser="";
        this.contrasena="";
        
    }

    public usuario(Integer id_usuario, String nombre, String apellido, String nombreUser, String contrasena) {
        setId_usuario(id_usuario);
        setNombre(nombre);
        setApellido(apellido);
        setNombreUser(nombreUser);
        setContrasena(contrasena);
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
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

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "usuario{" + "id_usuario=" + id_usuario + ", nombre=" + nombre + ", apellido=" + apellido + ", nombreUser=" + nombreUser + ", contrasena=" + contrasena + '}';
    }
    
    public void imprimir(){
        System.out.println("Id              : "+getId_usuario());
        System.out.println("Nombre            : "+getNombre());
        System.out.println("Apellido          : "+getApellido());
        System.out.println("Nombre de Usuario : "+getNombreUser());
        System.out.println("Contraseña        : "+getContrasena());
    }
    
    
}
