package com.bykenyodarz.ventas.services.apis;

import com.bykenyodarz.ventas.models.Cliente;
import com.bykenyodarz.ventas.shared.GenericServiceAPI;

import java.util.Optional;

public interface ClienteServiceAPI extends GenericServiceAPI<Cliente, Long> {
    Cliente findByDni(String dni);
}
