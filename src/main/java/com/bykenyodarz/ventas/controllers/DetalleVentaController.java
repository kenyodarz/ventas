package com.bykenyodarz.ventas.controllers;

import com.bykenyodarz.ventas.models.DetalleVenta;
import com.bykenyodarz.ventas.services.apis.DetalleVentaServiceAPI;
import com.bykenyodarz.ventas.shared.GenericRestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin({"*"})
@RequestMapping("/detalle")
public class DetalleVentaController extends GenericRestController<DetalleVenta, Long> {

    private final DetalleVentaServiceAPI serviceAPI;

    public DetalleVentaController(DetalleVentaServiceAPI serviceAPI) {
        super(serviceAPI);
        this.serviceAPI = serviceAPI;
    }
}
