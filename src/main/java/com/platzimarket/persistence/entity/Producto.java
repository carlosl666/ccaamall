package com.platzimarket.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "Productos")
@SequenceGenerator(sequenceName = "SEQ_ID_PRODUCTO", allocationSize = 1, name="SEQ_ID_PRODUCTO")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_PRODUCTO")
    @Column(name="ID_PRODUCTO", nullable = false)
    private Long idProducto;

    @Column(name="NOMBRE")
    private String nombre;

    @Column(name="ID_CATEGORIA")
    private Long idCategoria;

    @Column(name="CODIGO_BARRAS")
    private String codigoBarras;

    @Column(name="PRECIO_VENTA")
    private Double precioVenta;

    @Column(name="CANTIDAD_STOCK")
    private Integer cantidadStock;

    @Column(name="ESTADO")
    private Integer estado;

    @ManyToOne
    @JoinColumn(name = "ID_CATEGORIA",insertable = false, updatable = false)
    private Categoria categoria;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
