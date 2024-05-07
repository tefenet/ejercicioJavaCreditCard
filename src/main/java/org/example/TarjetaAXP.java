package org.example;

import java.time.LocalDate;

public class TarjetaAXP extends TarjetaCredito{

    public TarjetaAXP( String numero, CardHolder cardholder, LocalDate fechaVencimiento) {
        super("AMEX", numero, cardholder, fechaVencimiento);
    }

    public TarjetaAXP() {
        super("AMEX");
    }

    @Override
    public double calculo() {
        return getFechaVencimiento().getMonthValue() * 0.1;
    }
}

