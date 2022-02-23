package com.bykenyodarz.ventas.repositories;

import com.bykenyodarz.ventas.models.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface VentaRepository extends JpaRepository<Venta, Long> {
    @Query(value = "select max(v.numeroSerie) from Venta v")
    Optional<Integer> findMAxNumeroSerie();
}
