package com.bykenyodarz.ventas.services.apis;

import com.bykenyodarz.ventas.models.Empleado;
import com.bykenyodarz.ventas.shared.GenericServiceAPI;

public interface EmpleadoServiceAPI extends GenericServiceAPI<Empleado, Long> {
    Empleado findEmpleadoByUserAndDni(String user, String dni);
}
