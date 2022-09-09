package com.platzimarket.persistence.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "COMPRAS_PRODUCTO")
public class CompraProducto {
    @EmbeddedId
    private CompraProductoPK id;

    @Column(name = "CANTIDAD")
    private Integer cantidad;

    @Column(name = "TOTAL")
    private BigDecimal total;

    @Column(name = "ID_ESTATUS")
    private Integer idEstatus;

    @ManyToOne
    @JoinColumn(name = "ID_COMPRA", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUCTO", insertable = false, updatable = false)
    private Producto producto;

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public CompraProductoPK getId() {
        return id;
    }

    public void setId(CompraProductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Integer getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }
}
