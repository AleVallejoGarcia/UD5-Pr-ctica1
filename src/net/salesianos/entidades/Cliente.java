package net.salesianos.entidades;
import java.util.Stack;
import net.salesianos.utilidades.*;

public class Cliente {
    Stack<String> cestaDeLaCompra;
    private String nombre;

    public Cliente(int numeroProductos) {
        cestaDeLaCompra = new Stack<String>();
        for (int i = 0; i < numeroProductos; i++) {
            String producto = GeneradorEstatico.getRandomProducto();
            cestaDeLaCompra.push(producto);
            i++;
        }
        this.nombre =  GeneradorEstatico.getRandomNombre();
    }

    public void anyadirProducto() {
        cestaDeLaCompra.push(GeneradorEstatico.getRandomProducto());
    }
}
