package net.salesianos.entidades;

import java.util.LinkedList;
import java.util.Queue;

public class Cajero {
   private int numeroDeCaja;
   Queue<Cliente> colaClientes = new LinkedList<>();

   public Cajero(int numeroDeCaja) {
       this.numeroDeCaja = numeroDeCaja;
   }

   public int getNumeroDeCaja() { return this.numeroDeCaja; }

   public void anyadirClienteALaCola() {
       Cliente clienteAnyadido = new Cliente();
       System.out.println(clienteAnyadido);
       this.colaClientes.add(clienteAnyadido);
   }

   public void atenderCliente() {
       if (this.colaClientes.isEmpty() == false) {
           System.out.println(this.colaClientes.remove());
       } else {
           System.out.println("No hay clientes en la cola");
       }
   }

   public void desplegarClientes() {
       if (this.colaClientes.isEmpty() == false) {
           System.out.println("El cajero con id " + this.numeroDeCaja);
           for(int i = 0; i < colaClientes.size(); i++) {
               System.out.println(colaClientes.poll());
           }
       } else {
           System.out.println("No hay clientes");
       }
   }

   @Override
   public String toString() {
       String msg = "=================================================\n";
       msg += "*Número de caja: " + this.numeroDeCaja + "\n";
       msg += "*Total de clientes: " + this.colaClientes.size() + "\n";
       msg += "*Clientes en la fila: \n";
       for(Cliente cliente : colaClientes) {
           msg += "<" + cliente + ">" + "\n";
       }
       msg += "=================================================";
       return msg;
   }
}