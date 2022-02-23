package com.bykenyodarz.ventas.repositories;

import com.bykenyodarz.ventas.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    //@Query(value = "select e from Empleado e where e.user=?1 and e.dni=?2")
    Optional<Empleado> findEmpleadoByUserAndDni(String user, String dni);
}
