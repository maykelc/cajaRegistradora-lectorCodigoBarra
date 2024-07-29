package modelo;
/**
 * @author MaykXZ
 */
public class det_venta {
    private int idDetVenta;
    private int cantidad;
    private int precio;
    private int ventaIdVenta;
    private int productoIdProducto;

    public det_venta() {
        this.idDetVenta = 0;
        this.cantidad = 0;
        this.precio = 0;
        this.ventaIdVenta = 0;
        this.productoIdProducto = 0;
    }

    public det_venta(int idDetVenta, int cantidad, int precio, int ventaIdVenta, int productoIdProducto) {
        setIdDetVenta(idDetVenta);
        setCantidad(cantidad);
        setPrecio(precio);
        setVentaIdVenta(ventaIdVenta);
        setProductoIdProducto(productoIdProducto);
    }

    public int getIdDetVenta() {
        return idDetVenta;
    }

    public void setIdDetVenta(int idDetVenta) {
        this.idDetVenta = idDetVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVentaIdVenta() {
        return ventaIdVenta;
    }

    public void setVentaIdVenta(int ventaIdVenta) {
        this.ventaIdVenta = ventaIdVenta;
    }

    public int getProductoIdProducto() {
        return productoIdProducto;
    }

    public void setProductoIdProducto(int productoIdProducto) {
        this.productoIdProducto = productoIdProducto;
    }

    @Override
    public String toString() {
        return "det_venta{" + "idDetVenta=" + idDetVenta + ", cantidad=" + cantidad + ", precio=" + precio + ", ventaIdVenta=" + ventaIdVenta + ", productoIdProducto=" + productoIdProducto + '}';
    }

    public void imprimir(){
        System.out.println("ID de venta           :"+getIdDetVenta());
        System.out.println("Cantidad de Productos : "+getCantidad());
        System.out.println("Precio                :"+getPrecio());
        System.out.println("Venta ID              : "+getVentaIdVenta());
        System.out.println("Producto ID           :"+getProductoIdProducto());
    }

}
