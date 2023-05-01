package net.salesianos.utilidades;
import java.util.Random;


public class GeneradorEstatico {

    private static final String[] PRODUCTOS = new String[] {
        "Lentejas", "Huevos", "Chuletas", "Papas", "Cervezas", "Lechuga", "Helados", "GarrafaDeAgua", "Leche", "Fanta", "Tomates", "Peras", "GorraNuevaParaAdri"
      };

    private static final String[] NOMBRES = new String[] {
        "Adrian", "Alejandro", "Pablo", "Ricardo", "Adan", "Jeremy", "Luis", "Guilermo", "Daniel", "Gabriel", "Amanda", "Chibui", "Goyo", "Antonio", "Javier", "Laura", "Ana", "Sofia", "Matias", "Manuel"
    };

    public static String getRandomProducto() {

        Random random = new Random();
        int randomIndex = random.nextInt(GeneradorEstatico.PRODUCTOS.length);
        return GeneradorEstatico.PRODUCTOS[randomIndex];
    } 
    
    public static String getRandomNombre() {

        Random random = new Random();
        int randomIndex = random.nextInt(GeneradorEstatico.NOMBRES.length);
        return GeneradorEstatico.NOMBRES[randomIndex];
    } 
    
}
