package com.bykenyodarz.ventas.services.providers;

import com.bykenyodarz.ventas.models.Venta;
import com.bykenyodarz.ventas.repositories.VentaRepository;
import com.bykenyodarz.ventas.services.apis.VentaServiceAPI;
import com.bykenyodarz.ventas.shared.GenericServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VentaServiceImpl extends GenericServiceImpl<Venta, Long> implements VentaServiceAPI {

    private final VentaRepository repository;

    @Override
    public Integer findMAxNumeroSerie() {
        return this.repository.findMAxNumeroSerie().orElse(null);
    }

    @Override
    public JpaRepository<Venta, Long> getJpaRepository() {
        return this.repository;
    }
}
