package org.ieschabas;

public class CargadorDeClases {
    public void cargarClase(String nombreClase){
        try {
            Class.forName(nombreClase);
        }catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada " + e.getMessage());
        }
    }
}
