package conexion;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author MaykXZ
 */
public class conexion {
    private Connection conect = null;
    private String usuario = "root";
    private String contrasena = "null";
    private String url = "jdbc:mysql://localhost:3306/nombredelabd" ;//Ruta
    //Conexion
    public conexion(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conect = DriverManager.getConnection(url,usuario, contrasena);
        if(conect != null){
            System.out.println("Conexion Exitosa a BD");
        } else{
            System.out.println("Conexion Fallida");
        }
    }catch(ClassNotFoundException | SQLException e){
        System.out.println("Error al conectarse: "+e.getMessage());
        }
    }
    public Connection getConexion(){
    return conect;
    }
    public void cerrarConexion(){
        if(conect != null){
            try{
                conect.close();
                System.out.println("Conexion Cerrada");
            }catch(SQLException e){
                System.out.println("Error al Cerrar la Conexion: "+e.getMessage());
            }
        }
    }
}
