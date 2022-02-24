package com.bykenyodarz.ventas.controllers;

import com.bykenyodarz.ventas.models.Cliente;
import com.bykenyodarz.ventas.services.apis.ClienteServiceAPI;
import com.bykenyodarz.ventas.shared.GenericRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin({"*"})
@RequestMapping("/clientes")
public class ClienteRestController extends GenericRestController<Cliente, Long> {

    private final ClienteServiceAPI serviceAPI;

    public ClienteRestController(ClienteServiceAPI serviceAPI) {
        super(serviceAPI);
        this.serviceAPI = serviceAPI;
    }

    @GetMapping("/dni/{dni}")
    public ResponseEntity<Cliente> findByDni(@PathVariable String dni) {

        var cliente = serviceAPI.findByDni(dni);
        if (cliente == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok().body(cliente);
    }
}
