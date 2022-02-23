package com.bykenyodarz.ventas.repositories;

import com.bykenyodarz.ventas.models.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {
}
