
package modelo;

/**
 * @author MaykXZ
 */
public class producto {
    private Integer id_producto;
    private String nombre_producto;
    private Integer precio;
    private Integer cantidad;
    private Integer categoria_id_catg;
    private String codigo_barra;
    
    public producto() {
        this.id_producto = 0;
        this.nombre_producto = "";
        this.precio = 0;
        this.cantidad = 0;
        this.categoria_id_catg = 0;
        this.codigo_barra = "";
    }

    public producto(Integer id_producto, String nombre_producto, Integer precio, Integer cantidad, Integer categoria_id_catg, String codigo_barra) {
        setId_producto(id_producto);
        setNombre_producto(nombre_producto);
        setPrecio(precio);
        setCantidad(cantidad);
        setCategoria_id_catg(categoria_id_catg);
        setCodigo_barra(codigo_barra);
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getCategoria_id_catg() {
        return categoria_id_catg;
    }

    public void setCategoria_id_catg(Integer categoria_id_catg) {
        this.categoria_id_catg = categoria_id_catg;
    }

    public String getCodigo_barra() {
        return codigo_barra;
    }

    public void setCodigo_barra(String codigo_barra) {
        this.codigo_barra = codigo_barra;
    }

    @Override
    public String toString() {
        return "producto{" + "id_producto=" + id_producto + ", nombre_producto=" + nombre_producto + ", precio=" + precio + ", cantidad=" + cantidad + ", categoria_id_catg=" + categoria_id_catg + ", codigo_barra=" + codigo_barra + '}';
    }
    
    
    public void imprimir(){
        System.out.println("Id del Producto   : " + getId_producto());
        System.out.println("Nombre del Producto: " + getNombre_producto());
        System.out.println("Precio            : " + getPrecio());
        System.out.println("Cantidad          : " + getCantidad());
        System.out.println("Categoría ID      : " + getCategoria_id_catg());
        System.out.println("Código de Barra   : " + getCodigo_barra());
    }
    
    
    
    
    
    
    
    
    
}
