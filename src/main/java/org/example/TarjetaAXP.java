package org.example;

import java.time.LocalDate;

public class TarjetaAXP extends TarjetaCredito{

    public TarjetaAXP( String numero, String cardholder, LocalDate fechaVencimiento) {
        super("AMEX", numero, cardholder, fechaVencimiento);
    }
    @Override
    public double calculo() {
        return getFechaVencimiento().getMonthValue() * 0.1;
    }
}

