package net.salesianos.entidades;
import java.util.Stack;
import net.salesianos.utilidades.*;

public class Cliente {
    Stack<String> cestaDeLaCompra = new Stack<>();
    private String nombre;

    public Cliente() {
        this.nombre =  GeneradorEstatico.getRandomNombre();
    
    }

    public void anyadirProducto() {
        cestaDeLaCompra.push(GeneradorEstatico.getRandomProducto());
    }
}
