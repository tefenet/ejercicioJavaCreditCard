package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.LocalDate;
import java.util.Optional;

public class Ejercicio1 {
        static Logger logger= LoggerFactory.getLogger(Ejercicio1.class) ;
    public static void main(String[] args) {
            String marca=args[0];
            double monto= Double.parseDouble(args[1]);
            TarjetaCredito card = switch (marca.toUpperCase()) {
                    case "VISA" -> new TarjetaV("1234567890123456", new CardHolder("Juan", "Perez"), LocalDate.of(2025, 9, 20));
                    case "NARA" -> new TarjetaNAR("9876543210987654", new CardHolder("Juan", "Perez"), LocalDate.of(2024, 4, 15));
                    case "AMEX" -> new TarjetaAXP("1111222233334444", new CardHolder("Carlos", "Juarez"), LocalDate.of(2025, 9, 20));
                    default -> throw new IllegalArgumentException("Marca de tarjeta no válida");
            };
            TarjetaCredito americanExpress = new TarjetaAXP("1111222233334444", new CardHolder("Carlos", "Juarez"), LocalDate.of(2025, 9, 20));

            logger.info(card.toString());
            logger.info("Operación válida para tarjeta {} (monto $ {}): {}", marca,monto, Optional.of(card.operacionValida(monto)).get());
            logger.info("Tarjeta {} válida para operar: {}",marca, Optional.of(card.tarjetaValidaParaOperar()).get());
            logger.info("Tarjeta {} es {} a {}", marca, Boolean.TRUE.equals(Optional.of(card.equals(americanExpress)).get())? "igual":"distinta", americanExpress);
            logger.info("Tasa de operación para tarjeta {} (monto $ {}): {}", marca, monto, Optional.of(card.calcularTasa(monto)).get());
    }
}