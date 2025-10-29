package org.ieschabas;

public class ConversionDeNumero {
    public Integer convertir(String numero){
        try {
            int valor = Integer.parseInt(numero);
            return valor;
        }catch (NumberFormatException e) {
            System.out.println("El dato introducido debe ser un número " + e.getMessage());
            return null;
        }

    }
}
