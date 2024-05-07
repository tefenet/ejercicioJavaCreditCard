package org.example;

public class Ejercicio5 {

    public static void main(String[] args) {
        String resultant = unirYConvertir(args[0].split(" "));
        System.out.println(resultant.trim());
    }

    public static String unirYConvertir(String[] array) {
        if (array.length > 10) {
            return "Error: La longitud del array supera los 10.";
        }
        StringBuilder resultant = new StringBuilder();
        for (String palabra : array) {
            resultant.append(palabra.toLowerCase()).append(" ");
        }
    return resultant.toString();
    }
}
