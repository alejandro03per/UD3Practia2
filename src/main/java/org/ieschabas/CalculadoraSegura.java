package org.ieschabas;

import java.util.Scanner;

public class CalculadoraSegura {

    public double dividir(int numerador, int denominador) {
        double resultado;
        try {
            // Realiza división entera para forzar ArithmeticException si denominador es 0
            int divisionEntera = numerador / denominador;
            resultado = (double) divisionEntera;
        } catch (ArithmeticException e) {
            System.out.println("Error: divisor cero no permitido");
            resultado = Double.NaN;
        }
        return resultado;
    }
}

