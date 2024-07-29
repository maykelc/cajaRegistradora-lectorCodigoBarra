
package modelo;

import java.util.Date;

/**
 * @author MaykXZ
 */
public class venta {
    private int idVenta;
    private String fechaVenta;
    private int cantidadProducto;
    private int valorTotal;

    public venta() {
        this.idVenta= 0;
        this.fechaVenta= "";
        this.cantidadProducto= 0;
        this.valorTotal= 0;
    }

    public venta(int idVenta, String fechaVenta, int cantidadProducto, int valorTotal) {
        setIdVenta(idVenta);
        setFechaVenta(fechaVenta);
        setCantidadProducto(cantidadProducto);
        setValorTotal(valorTotal);
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "venta{" + "idVenta=" + idVenta + ", fechaVenta=" + fechaVenta + ", cantidadProducto=" + cantidadProducto + ", valorTotal=" + valorTotal + '}';
    }
    
    public void imprimir(){
        System.out.println("Id de Venta          : "+getIdVenta());
        System.out.println("Cantidad de Productos: "+getCantidadProducto());
        System.out.println("Fecha de venta       : "+getFechaVenta());
        System.out.println("Valor Total          :"+getValorTotal());
    }
}
