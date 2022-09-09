package com.platzimarket.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CompraProductoPK implements Serializable {
    @Column(name = "ID_COMPRA")
    private Long idCompra;
    @Column(name = "ID_PRODUCTO")
    private Long idProducto;

    public Long getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Long idCompra) {
        this.idCompra = idCompra;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }
}
