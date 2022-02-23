package com.bykenyodarz.ventas.services.providers;

import com.bykenyodarz.ventas.models.Cliente;
import com.bykenyodarz.ventas.repositories.ClienteRepository;
import com.bykenyodarz.ventas.services.apis.ClienteServiceAPI;
import com.bykenyodarz.ventas.shared.GenericServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl extends GenericServiceImpl<Cliente, Long> implements ClienteServiceAPI {

    private final ClienteRepository repository;

    @Override
    public Cliente findByDni(String dni) {
        return this.repository.findByDni(dni).orElse(null);
    }

    @Override
    public JpaRepository<Cliente, Long> getJpaRepository() {
        return this.repository;
    }
}
