package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TarjetaController {

    @Autowired
    private TarjetaService tarjetaService;

    @GetMapping("/tasa")
    public OperacionBasicaDTO getTasa(@RequestBody OperacionBasicaDTO operacion){
        operacion.setTasa(tarjetaService.calcularTasa(operacion.getMarca() ,operacion.getMonto()));
        return operacion;
    }
}
