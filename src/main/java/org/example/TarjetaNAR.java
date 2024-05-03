package org.example;

import java.time.LocalDate;

public class TarjetaNAR extends TarjetaCredito{

    public TarjetaNAR(String numero, String cardholder, LocalDate fechaVencimiento) {
        super("NARA", numero, cardholder, fechaVencimiento);
    }

    @Override
    public double calculo() {
        return getFechaVencimiento().getDayOfMonth() * 0.5;
    }

}

