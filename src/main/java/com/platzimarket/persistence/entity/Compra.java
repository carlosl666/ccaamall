package com.platzimarket.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "COMPRAS")
@SequenceGenerator(sequenceName = "SEQ_ID_COMPRA", allocationSize = 1, name = "SEQ_ID_COMPRA")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_COMPRA")
    @Column(name = "ID_COMPRA")
    private Long idCompra;

    @Column(name = "ID_CLIENTE")
    private Long idCliente;

    @Column(name = "FECHA")
    private LocalDateTime fecha;

    @Column(name = "MEDIO_PAGO")
    private String medioPago;

    @Column(name = "COMENTARIO")
    private String comentario;

    @Column(name = "ID_ESTATUS")
    private Integer idEstatus;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", insertable = false, updatable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "compra", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<CompraProducto> compraProductos;

    public List<CompraProducto> getCompraProductos() {
        return compraProductos;
    }

    public void setCompraProductos(List<CompraProducto> compraProductos) {
        this.compraProductos = compraProductos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Long idCompra) {
        this.idCompra = idCompra;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }
}
