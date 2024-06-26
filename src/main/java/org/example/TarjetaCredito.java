package org.example;

import java.time.LocalDate;
import java.time.temporal.ValueRange;
import java.util.Objects;

public abstract class TarjetaCredito {

    private String marca;
    private String numero;
    private CardHolder cardholder;
    private LocalDate fechaVencimiento;

    protected TarjetaCredito(String marca) {
        numero="0000 0000 0000 0000";
        this.marca=marca;
        cardholder=new CardHolder("","");
        fechaVencimiento=LocalDate.now().plusDays(60);

    }

    protected TarjetaCredito(String marca, String numero, CardHolder cardholder, LocalDate fechaVencimiento) {
        this.marca = marca;
        this.numero = numero;
        this.cardholder = cardholder;
        this.fechaVencimiento = fechaVencimiento;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TarjetaCredito that = (TarjetaCredito) o;
        return marca.equals(that.marca) &&
                numero.equals(that.numero) &&
                cardholder.equals(that.cardholder) &&
                fechaVencimiento.equals(that.fechaVencimiento);
    }
    @Override
    public int hashCode() {
        return Objects.hash(marca, numero, cardholder, fechaVencimiento);
    }

    public String toString() {
        return "Tarjeta de crédito: " + marca + ", Número: " + numero + ", Cardholder: " + cardholder + ", Fecha de vencimiento: " + fechaVencimiento;
    }

    public String getMarca() {
        return marca;
    }

    public String getNumero() {
        return numero;
    }

    public CardHolder getCardholder() {
        return cardholder;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public boolean operacionValida(double monto) throws IllegalArgumentException {
        if (monto > 0 && monto + calcularTasa(monto) < 1000.00) return true;
        else throw new IllegalArgumentException("el monto de operacion debe estar en el rango 0 .. 1000");
    }

    public boolean tarjetaValidaParaOperar() {
        return fechaVencimiento.isAfter(LocalDate.now());
    }

    public double calcularTasa(double monto){
        double resultadoNormalizado = (this.calculo() - 0.3) / (5 - 0.3);
        double efinal = resultadoNormalizado * (5 - 0.3) + 0.3;
        return efinal/100 * monto;
    }
    public abstract double calculo();
}
