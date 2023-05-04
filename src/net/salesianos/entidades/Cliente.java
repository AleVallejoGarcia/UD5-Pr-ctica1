package net.salesianos.entidades;
import java.util.Stack;
import net.salesianos.utilidades.*;

public class Cliente {
    Stack<String> cestaDeLaCompra;
    private String nombre;

    public Cliente() {
        int numeroProductos = (int)(Math.random()*13+1);
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

    @Override
    public String toString() {
        String msg = "=================================================\n";
        msg += "*Nombre: " + this.nombre + "\n";
        msg += "*Total de productos: " + this.cestaDeLaCompra.size() + "\n";
        msg += "*Lista de artículos en la cesta: \n";
        for(int i = 0; i < cestaDeLaCompra.size(); i++) {
            msg += cestaDeLaCompra.get(i) + "\n";
        }
        msg += "=================================================";
        return msg;
    }
}
