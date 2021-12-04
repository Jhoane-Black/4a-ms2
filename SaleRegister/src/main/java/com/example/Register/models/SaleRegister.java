package com.example.Register.models;

import java.util.Date;
import org.springframework.data.annotation.Id;

public class SaleRegister {
    @Id
    private String registroID;
    private Integer cliente;
    private Integer proveedor;
    private Integer producto;
    private Integer cantidad;
    private Integer precio;
    private Integer total;
    private Date fecha;
    private Float promocion;

    public SaleRegister(String registroID, Integer cliente, Integer proveedor, Integer producto, Integer cantidad, Integer precio, Date fecha, Float promocion) {
        this.registroID = registroID;
        this.cliente = cliente;
        this.proveedor = proveedor;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = precio * cantidad;
        this.fecha = fecha;
        this.promocion = promocion;
    }

    public String getRegistroID() {
        return registroID;
    }


    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public Integer getProveedor() {
        return proveedor;
    }

    public void setProveedor(Integer proveedor) {
        this.proveedor = proveedor;
    }

    public Integer getProducto() {
        return producto;
    }

    public void setProducto(Integer producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Float getPromocion() {
        return promocion;
    }

    public void setPromocion(Float promocion) {
        this.promocion = promocion;
    }
}
