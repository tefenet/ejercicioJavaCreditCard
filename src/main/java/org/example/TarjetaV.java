package org.example;

import java.time.LocalDate;

public class TarjetaV extends TarjetaCredito{

    public TarjetaV(String numero, CardHolder cardholder, LocalDate fechaVencimiento) {
        super("VISA", numero, cardholder, fechaVencimiento);
    }

    public TarjetaV() {
        super("VISA");
    }

    @Override
    public double calculo() {
        return (double) (getFechaVencimiento().getYear() %100) / getFechaVencimiento().getMonthValue();
    }

}
