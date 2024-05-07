package org.example;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class TarjetaService {

    public double calcularTasa(String marca, double monto){
        TarjetaCredito card = switch (marca.toUpperCase()) {
            case "VISA" -> new TarjetaV();
            case "NARA" -> new TarjetaNAR();
            case "AMEX" -> new TarjetaAXP();
            default -> throw new IllegalArgumentException("Marca de tarjeta no válida");
        };
        return card.calcularTasa(monto);
    }
}
