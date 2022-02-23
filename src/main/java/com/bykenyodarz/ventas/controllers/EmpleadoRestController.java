package com.bykenyodarz.ventas.controllers;

import com.bykenyodarz.ventas.models.Empleado;
import com.bykenyodarz.ventas.services.apis.DetalleVentaServiceAPI;
import com.bykenyodarz.ventas.services.apis.EmpleadoServiceAPI;
import com.bykenyodarz.ventas.shared.GenericRestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin({"*"})
@RequestMapping("/empleados")
public class EmpleadoRestController extends GenericRestController<Empleado, Long> {
    private final EmpleadoServiceAPI serviceAPI;

    public EmpleadoRestController(EmpleadoServiceAPI serviceAPI) {
        super(serviceAPI);
        this.serviceAPI = serviceAPI;
    }
}
