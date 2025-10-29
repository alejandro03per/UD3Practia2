package org.ieschabas;


public class Main {
    static void main() {
        //Main 1
        CargadorDeClases cargadorDeClases = new CargadorDeClases();
        cargadorDeClases.cargarClase("java.lang.String");
        cargadorDeClases.cargarClase("com.ieschabas.NoExiste");

        // Main 2
        ConversionDeNumero conversionNumero =new ConversionDeNumero();
        conversionNumero.convertir("3");
        conversionNumero.convertir("hola");

        //Main 3
        CalculadoraSegura calculadoraSegura= new CalculadoraSegura();
        /**calculadoraSegura.operar("6","2");
        calculadoraSegura.operar("h","2");
        calculadoraSegura.operar("6","0");
         */


    }
}
