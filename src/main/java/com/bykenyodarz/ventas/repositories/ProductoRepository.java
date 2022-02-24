package com.bykenyodarz.ventas.repositories;

import com.bykenyodarz.ventas.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    @Query("select p from Producto p where p.stock > 0 and p.idProducto = ?1")
    Optional<Producto> findProductoWithStock(Long id);
}
