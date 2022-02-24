package com.bykenyodarz.ventas.services.providers;

import com.bykenyodarz.ventas.models.Producto;
import com.bykenyodarz.ventas.repositories.ProductoRepository;
import com.bykenyodarz.ventas.services.apis.ProductoServiceAPI;
import com.bykenyodarz.ventas.shared.GenericServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductoServiceImpl  extends GenericServiceImpl<Producto, Long> implements ProductoServiceAPI {

    private final ProductoRepository repository;

    @Override
    public Producto findProductoWithStock(Long id) {
        return this.repository.findProductoWithStock(id).orElse(null);
    }

    @Override
    public JpaRepository<Producto, Long> getJpaRepository() {
        return this.repository;
    }
}
