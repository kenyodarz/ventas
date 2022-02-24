package com.bykenyodarz.ventas.controllers;

import com.bykenyodarz.ventas.models.Venta;
import com.bykenyodarz.ventas.services.apis.VentaServiceAPI;
import com.bykenyodarz.ventas.shared.GenericRestController;
import com.bykenyodarz.ventas.utils.GenerarSerie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin({"*"})
@RequestMapping("/ventas")
public class VentaRestController extends GenericRestController<Venta, Long> {
    private final VentaServiceAPI serviceAPI;

    public VentaRestController(VentaServiceAPI serviceAPI) {
        super(serviceAPI);
        this.serviceAPI = serviceAPI;
    }

    @GetMapping("/serie")
    public ResponseEntity<GenerarSerie> obtenerNumeroSerie() {
        var generarSerie = new GenerarSerie();
        generarSerie.numeroSerie(serviceAPI.findMAxNumeroSerie());
        return ResponseEntity.ok().body(generarSerie);
    }
}
