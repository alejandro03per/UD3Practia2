package org.ieschabas;

import java.util.Scanner;

public class MainCalculadoraSegura {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            CalculadoraSegura calc = new CalculadoraSegura();

            System.out.print("Inserte un numero como numerador: ");
            int numerador = sc.nextInt();

            System.out.print("Inserte un numero como denominador: ");
            int denominador = sc.nextInt();

            double resultado = calc.dividir(numerador, denominador);
            System.out.println("Resultado: " + resultado);

            sc.close();
    }
}
