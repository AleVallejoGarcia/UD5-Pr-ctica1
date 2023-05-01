package net.salesianos.utilidades;
import java.util.Random;


public class GeneradorEstatico {

    private static final String[] PRODUCTOS = new String[] {
        "Lentejas", "Huevos", "Chuletas", "Papas", "Cervezas", "Lechuga", "Helados", "GarrafaDeAgua", "Leche", "Fanta", "Tomates", "Peras", "GorraNuevaParaAdri"
      };

    public static String getRandomProducto() {

        Random random = new Random();
        int randomIndex = random.nextInt(GeneradorEstatico.PRODUCTOS.length);
        return GeneradorEstatico.PRODUCTOS[randomIndex];
    }  
}
