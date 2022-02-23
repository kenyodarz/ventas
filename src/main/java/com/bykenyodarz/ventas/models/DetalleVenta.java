package com.bykenyodarz.ventas.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "detalle_ventas")
public class DetalleVenta {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdDetalleVentas")
    private Long idDetalleVentas;

    @OneToOne
    @JoinColumn(name = "IdVentas")
    private Venta venta;

    @OneToOne
    @JoinColumn(name = "IdProducto")
    private Producto producto;

    @Column(name = "Cantidad")
    private Integer cantidad;

    @Column(name = "PrecioVenta")
    private Double precioVenta;
}
