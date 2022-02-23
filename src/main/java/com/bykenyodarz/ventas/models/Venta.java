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
import javax.persistence.PrePersist;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "ventas")
public class Venta {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IdVentas")
    private Long idVentas;

    @OneToOne
    @JoinColumn(name = "IdCliente")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "IdEmpleado")
    private Empleado empleado;

    @Column(name = "NumeroSerie")
    private String numeroSerie;

    @Column(name = "FechaVentas")
    private LocalDate fechaVentas;

    @Column(name = "monto")
    private Double monto;

    @Column(name = "Estado")
    private String estado;


    @PrePersist
    public void prePersist() {
        this.fechaVentas = LocalDate.now();
    }
}
