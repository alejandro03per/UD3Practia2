package org.ieschabas;
import java.util.Scanner;

public class CalculadoraSegura {
    public Integer operarDatosUsuario() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Inserte un numero: ");
        String n1 = lector.nextLine();
        String n2 = lector.nextLine();
        try {
            int a = Integer.parseInt(n1);
            int b = Integer.parseInt(n2);
            int division = a / b;
            System.out.println("El resultado de la division es :" + division);
            return division;
        } catch (NumberFormatException e) {
            System.out.println("El dato introducido debe ser un numero " + e.getMessage());
            return null;
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividor por cero " + e.getMessage());
            return null;
        } finally {
            lector.close();
        }
    }
}


/**
    public Integer operar(String n1, String n2){
        try{
            int a = Integer.parseInt(n1);
            int b = Integer.parseInt(n2);
            int division = a/b;
            System.out.println("El resultado de la division es: " + division);
            return division;
        }catch(NumberFormatException e){
            System.out.println("El dato introducido debe ser un numero " + e.getMessage());
            return null;
        }catch(ArithmeticException e){
            System.out.println("Error: No se puede dividor por cero " + e.getMessage() );
            return null;
        }


    }
}
*/