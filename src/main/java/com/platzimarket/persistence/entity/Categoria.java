package com.platzimarket.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CATEGORIAS")
@SequenceGenerator(sequenceName = "SEQ_ID_CATEGORIA", allocationSize = 1, name = "SEQ_ID_CATEGORIA")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_CATEGORIA")
    @Column(name = "ID_CATEGORIA")
    private Long idCateria;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "ID_ESTATUS")
    private Integer idEstatus;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Long getIdCateria() {
        return idCateria;
    }

    public void setIdCateria(Long idCateria) {
        this.idCateria = idCateria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }
}
