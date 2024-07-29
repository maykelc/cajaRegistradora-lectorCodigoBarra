package controlador;
import modelo.usuario;
import conexion.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
/**
 * @author MaykXZ
 */
public class usuarioDAO {
    private Connection conect = null;
    public usuarioDAO(){
        conect = new conexion().getConexion();
    }
    //Agregar Usuario
    public boolean agregarUsuario(usuario user){
        try{
            String sql = "insert into usuario(nombre, apellido, nombre_user, contrasena ) values(?,?,?,?)";
            PreparedStatement stmt = conect.prepareStatement(sql);
        
            stmt.setString(1, user.getNombre());
            stmt.setString(2, user.getApellido());
            stmt.setString(3, user.getNombreUser());
            stmt.setString(4, user.getContrasena());
            if(stmt.executeUpdate()> 0){
                return true;
            }else{
                return false;
            }
        }catch(SQLException ex){
        Logger.getLogger(usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        return false;
        }
    }
    //Listar Usuarios
    public ArrayList<usuario> listarusuario(){
        try{
            ArrayList<usuario> lista = new ArrayList<>();   
            String sql = "SELECT * FROM usuario";
            PreparedStatement stmt = conect.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                usuario user = new usuario();
                user.setNombre(rs.getString("nombre"));
                user.setApellido(rs.getString("apellido"));
                user.setNombreUser(rs.getString("nombreUser"));
                user.setContrasena(rs.getString("contrasena"));
                lista.add(user);
            }
            return lista;
        } catch(SQLException ex){
            System.out.println("Error al Listar Usuarios: "+ex.getMessage());
            return null;
        }
    }
    //Eliminar Usuario
    public boolean EliminarUser(String nombreUser){
        try{
            String sql = "delete from usuario where nombre_user = ?";
            PreparedStatement stmt = conect.prepareStatement(sql);
            stmt.setString(1, nombreUser);
            if(stmt.executeUpdate()> 0){
            return true;
            }else{
            return false;
            }
        }catch(SQLException e){
            System.out.println("Error Al Eliminar Usuario: "+e.getMessage());
            return false;
        }
    }
    //Modificar Usuario
    public boolean modificarUser(usuario user){
        String sql= "UPDATE usuario SET nombre = ?, apellido = ?, nombre_user = ?, contrasena = ? WHERE id_usuario = ?";
        try{
            PreparedStatement stmt = conect.prepareStatement(sql);
            
            stmt.setString(1, user.getNombre());
            stmt.setString(2, user.getApellido());
            stmt.setString(3, user.getNombreUser());
            stmt.setString(4,user.getContrasena());
            stmt.setInt(5, user.getId_usuario());
            
            if(stmt.executeUpdate()>0){
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al Modificar Usuario: "+e.getMessage());
            return false;
        }
    }
    //Buscar Usuario
    public ArrayList<usuario> buscaruser(String nombreUser){
        ArrayList<usuario> lista = new ArrayList<>();
        try{
            String sql ="select * from usuario where nombre_user = ?";
            PreparedStatement stmt = conect.prepareStatement(sql);
            stmt.setString(1, nombreUser);
            ResultSet rs = stmt.executeQuery(); 
            while(rs.next()){
                usuario user = new usuario();
                user.setNombre(rs.getString("nombre"));
                user.setApellido(rs.getString("apellido"));
                user.setNombreUser(rs.getString("nombre_user"));
                user.setContrasena(rs.getString("contrasena"));
                lista.add(user);
            }return lista;
        }catch(Exception e){
            Logger.getLogger(usuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }return null;
    }
}
