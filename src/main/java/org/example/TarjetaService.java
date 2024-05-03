package org.example;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class TarjetaService {

    public double calcularTasa(String marca, double monto){
        TarjetaCredito card = switch (marca) {
            case "VISA" -> new TarjetaV("", "", LocalDate.now().plusDays(60));
            case "NARA" -> new TarjetaNAR("", "", LocalDate.now().plusDays(3));
            case "AMEX" -> new TarjetaAXP("", "", LocalDate.now().plusDays(3));
            default -> throw new IllegalArgumentException("Marca de tarjeta no válida");
        };
        return card.calcularTasa(monto);
    }
}
