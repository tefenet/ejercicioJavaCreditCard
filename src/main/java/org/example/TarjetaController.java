package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TarjetaController {

    @Autowired
    private TarjetaService tarjetaService;

    @GetMapping("/tasa")
    public double getTasa(@RequestParam String marca, @RequestParam double monto){
        return tarjetaService.calcularTasa(marca ,monto);
    }
}
