package com.bykenyodarz.ventas.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name = "cliente")
@NoArgsConstructor
public class Cliente {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdCliente")
    private Long idCliente;

    @Column(name = "Dni", unique = true)
    @NotBlank
    @Size(min=1, max=10)
    private String dni;

    @Column(name = "Nombres")
    @NotBlank
    private String nombres;

    @Column(name = "Direccion")
    private String direccion;

    @Column(name = "Estado")
    @Size(min=1,max=1)
    private String estado;

}
