package net.salesianos.entidades;

import java.util.LinkedList;
import java.util.Queue;
import net.salesianos.entidades.Cliente;

public class Cajero {
    private int numeroDeCaja;
    Queue<Cliente> colaClientes;

    public Cajero(int numeroDeCaja) {
        this.numeroDeCaja = numeroDeCaja;
        colaClientes = new LinkedList<Cliente>();
    }

    public void anyadirClienteALaCola(Cliente cliente) {
        this.colaClientes.add(cliente);
    }

    public void atenderCliente() {
        this.colaClientes.remove();
    }

    @Override
    public String toString() {
        String msg = "=================================================\n";
        msg += "*Número de caja: " + this.numeroDeCaja + "\n";
        msg += "*Total de clientes: " + this.colaClientes.size() + "\n";
        msg += "*Clientes en la fila: \n";
        for(int i = 0; i < colaClientes.size(); i++) {
            msg += "<" + colaClientes.poll() + ">" + "\n";
        }
        msg += "=================================================";
        return msg;
    }
}
