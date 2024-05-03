package org.example;

import java.time.LocalDate;

public class TarjetaV extends TarjetaCredito{

    public TarjetaV(String numero, String cardholder, LocalDate fechaVencimiento) {
        super("VISA", numero, cardholder, fechaVencimiento);
    }

    @Override
    public double calculo() {
        return (double) (getFechaVencimiento().getYear() %100) / getFechaVencimiento().getMonthValue();
    }

}
