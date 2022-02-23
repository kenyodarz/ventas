package com.bykenyodarz.ventas.services.providers;

import com.bykenyodarz.ventas.models.DetalleVenta;
import com.bykenyodarz.ventas.repositories.DetalleVentaRepository;
import com.bykenyodarz.ventas.services.apis.DetalleVentaServiceAPI;
import com.bykenyodarz.ventas.shared.GenericServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DetalleVentaServiceImpl extends GenericServiceImpl<DetalleVenta, Long> implements DetalleVentaServiceAPI {

    private final DetalleVentaRepository repository;


    @Override
    public JpaRepository<DetalleVenta, Long> getJpaRepository() {
        return this.repository;
    }
}
