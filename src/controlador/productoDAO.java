
package controlador;

import modelo.producto;
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
public class productoDAO {
    private Connection conect = null;

    public productoDAO() {
        conect = new conexion().getConexion();
    }

    // Agregar Producto
    public boolean agregarProducto(producto prod) {
        try {
            String sql = "INSERT INTO producto (nombre_producto, precio, cantidad, categoria_id_catg, codigo_barra) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conect.prepareStatement(sql);

            stmt.setString(1, prod.getNombre_producto());
            stmt.setDouble(2, prod.getPrecio());
            stmt.setInt(3, prod.getCantidad());
            stmt.setInt(4, prod.getCategoria_id_catg());
            stmt.setString(5, prod.getCodigo_barra());
            return stmt.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(productoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    // Listar Productos
    public ArrayList<producto> listarProductos() {
        ArrayList<producto> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM producto";
            PreparedStatement stmt = conect.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                producto prod = new producto();
                prod.setId_producto(rs.getInt("id_producto"));
                prod.setNombre_producto(rs.getString("nombre_producto"));
                prod.setPrecio(rs.getInt("precio"));
                prod.setCantidad(rs.getInt("cantidad"));
                prod.setCategoria_id_catg(rs.getInt("categoria_id_catg"));
                prod.setCodigo_barra(rs.getString("codigo_barra"));
                lista.add(prod);
            }
        } catch (SQLException ex) {
            System.out.println("Error al Listar Productos: " + ex.getMessage());
        }
        return lista;
    }

    // Eliminar Producto
    public boolean eliminarProducto(Integer id_producto) {
        try {
            String sql = "DELETE FROM producto WHERE id_producto = ?";
            PreparedStatement stmt = conect.prepareStatement(sql);
            stmt.setInt(1, id_producto);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al Eliminar Producto: " + e.getMessage());
            return false;
        }
    }

    // Modificar Producto
    public boolean modificarProducto(producto prod) {
        String sql = "UPDATE producto SET nombre_producto = ?, precio = ?, cantidad = ?, categoria_id_catg = ?, codigo_barra = ? WHERE id_producto = ?";
        try {
            PreparedStatement stmt = conect.prepareStatement(sql);
            stmt.setString(1, prod.getNombre_producto());
            stmt.setDouble(2, prod.getPrecio());
            stmt.setInt(3, prod.getCantidad());
            stmt.setInt(4, prod.getCategoria_id_catg());
            stmt.setString(5, prod.getCodigo_barra());
            stmt.setInt(6, prod.getId_producto());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al Modificar Producto: " + e.getMessage());
            return false;
        }
    }

    // Buscar Producto
    public ArrayList<producto> buscarProducto(String codigo_barra) {
        ArrayList<producto> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM producto WHERE codigo_barra = ?";
            PreparedStatement stmt = conect.prepareStatement(sql);
            stmt.setString(1, codigo_barra);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                producto prod = new producto();
                prod.setId_producto(rs.getInt("id_producto"));
                prod.setNombre_producto(rs.getString("nombre_producto"));
                prod.setPrecio(rs.getInt("precio"));
                prod.setCantidad(rs.getInt("cantidad"));
                prod.setCategoria_id_catg(rs.getInt("categoria_id_catg"));
                prod.setCodigo_barra(rs.getString("codigo_barra"));
                lista.add(prod);
            }
        } catch (Exception e) {
            Logger.getLogger(productoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return lista;
    }
}
