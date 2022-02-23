package com.bykenyodarz.ventas.services.providers;

import com.bykenyodarz.ventas.models.Empleado;
import com.bykenyodarz.ventas.repositories.EmpleadoRepository;
import com.bykenyodarz.ventas.services.apis.EmpleadoServiceAPI;
import com.bykenyodarz.ventas.shared.GenericServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmpleadoServiceImpl extends GenericServiceImpl<Empleado, Long> implements EmpleadoServiceAPI {

    private final EmpleadoRepository repository;


    @Override
    public Empleado findEmpleadoByUserAndDni(String user, String dni) {
        return this.repository.findEmpleadoByUserAndDni(user, dni).orElse(null);
    }

    @Override
    public JpaRepository<Empleado, Long> getJpaRepository() {
        return this.repository;
    }
}
