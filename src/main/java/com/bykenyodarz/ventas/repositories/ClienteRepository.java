package com.bykenyodarz.ventas.repositories;

import com.bykenyodarz.ventas.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query("select c from Cliente c where c.dni =?1")
    Optional<Cliente> findByDni(String dni);

}
