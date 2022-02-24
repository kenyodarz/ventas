package com.bykenyodarz.ventas.controllers;

import com.bykenyodarz.ventas.models.Producto;
import com.bykenyodarz.ventas.services.apis.ProductoServiceAPI;
import com.bykenyodarz.ventas.shared.GenericRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping("/with-stock/{id}")
    public ResponseEntity<Producto> findProductoWithStock(@PathVariable("id") Long id) {
        var producto = serviceAPI.findProductoWithStock(id);
        if (producto == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok().body(producto);
    }


    @PutMapping("/actualizar/{id}/{cantidad}")
    public ResponseEntity<Producto> actualizarStock(@PathVariable Long id, @PathVariable Integer cantidad) {
        var producto = serviceAPI.findProductoWithStock(id);
        if (producto == null) return ResponseEntity.notFound().build();
        producto.setStock(producto.getStock() - cantidad);
        return ResponseEntity.ok().body(this.serviceAPI.save(producto));
    }
}
