package com.bykenyodarz.ventas.controllers;

import com.bykenyodarz.ventas.models.Producto;
import com.bykenyodarz.ventas.services.apis.EmpleadoServiceAPI;
import com.bykenyodarz.ventas.services.apis.ProductoServiceAPI;
import com.bykenyodarz.ventas.shared.GenericRestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin({"*"})
@RequestMapping("/productos")
public class ProductoRestController extends GenericRestController<Producto, Long> {
    private final ProductoServiceAPI serviceAPI;

    public ProductoRestController(ProductoServiceAPI serviceAPI) {
        super(serviceAPI);
        this.serviceAPI = serviceAPI;
    }
}