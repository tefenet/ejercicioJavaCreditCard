package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDate;
import java.util.Optional;

public class Main {
        static Logger logger= LoggerFactory.getLogger(Main.class) ;
    public static void main(String[] args) {
            TarjetaCredito visa = new TarjetaV("1234567890123456", "Juan Pérez", LocalDate.of(2024, 6, 24));
            TarjetaCredito naranja = new TarjetaNAR("9876543210987654", "María López", LocalDate.of(2024, 4, 15));
            TarjetaCredito americanExpress = new TarjetaAXP("1111222233334444", "Carlos Martínez", LocalDate.of(2025, 9, 20));


            logger.info("Información de tarjeta visa: {}", visa);
            logger.info("Operación válida para tarjeta naranja (monto $500): {}", Optional.of(naranja.operacionValida(500)).get());
            logger.info("Tarjeta naranja válida para operar: {}", Optional.of(naranja.tarjetaValidaParaOperar()).get());
            logger.info("Tarjeta visa es distinta a tarjeta amex: {}", Optional.of(!visa.equals(americanExpress)).get());
            logger.info("Tasa de operación para tarjeta amex (monto $1000): {}", Optional.of(visa.calcularTasa(1000)).get());
    }
}