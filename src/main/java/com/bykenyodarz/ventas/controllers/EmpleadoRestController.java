package com.bykenyodarz.ventas.controllers;

import com.bykenyodarz.ventas.models.Empleado;
import com.bykenyodarz.ventas.services.apis.EmpleadoServiceAPI;
import com.bykenyodarz.ventas.shared.GenericRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("validar/{user}/{dni}")
    public ResponseEntity<?> validarEmpleado(@PathVariable("user") String user, @PathVariable("dni") String dni) {
        var empleado = serviceAPI.findEmpleadoByUserAndDni(user, dni);
        if (empleado == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(empleado);
    }
}
