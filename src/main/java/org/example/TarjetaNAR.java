package org.example;

import java.time.LocalDate;

public class TarjetaNAR extends TarjetaCredito{

    public TarjetaNAR(String numero, CardHolder cardholder, LocalDate fechaVencimiento) {
        super("NARA", numero, cardholder, fechaVencimiento);
    }

    public TarjetaNAR() {
        super("NARA");
    }

    @Override
    public double calculo() {
        return getFechaVencimiento().getDayOfMonth() * 0.5;
    }

}

