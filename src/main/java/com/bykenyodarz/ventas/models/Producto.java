package com.bykenyodarz.ventas.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "producto")
public class Producto {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdProducto")
    private Long idProducto;

    @Column(name = "Nombres")
    @NotBlank
    private String nombres;

    @Column(name = "Precio")
    @NotNull
    private Double precio;

    @Column(name = "Stock")
    @NotNull
    private Integer stock;

    @Column(name = "Estado")
    @NotBlank
    private String estado;
    
}
