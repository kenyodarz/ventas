package com.bykenyodarz.ventas.services.apis;

import com.bykenyodarz.ventas.models.Venta;
import com.bykenyodarz.ventas.shared.GenericServiceAPI;

public interface VentaServiceAPI extends GenericServiceAPI<Venta, Long> {
    Integer findMAxNumeroSerie();
}
