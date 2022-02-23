package com.bykenyodarz.ventas.services.apis;

import com.bykenyodarz.ventas.models.Producto;
import com.bykenyodarz.ventas.shared.GenericServiceAPI;

public interface ProductoServiceAPI extends GenericServiceAPI<Producto, Long> {
    Producto findProductoWithStock(String id);
}
