import net.salesianos.entidades.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean salir = false;
       boolean cajaAbierta = false;
       Scanner teclado = new Scanner(System.in);

       Cajero cajeroHiperDino = new Cajero(1);

       while (salir != true) {
           System.out.println("a. Abrir caja");
           System.out.println("b. Añadir un nuevo cliente");
           System.out.println("c. Atender a un cliente");
           System.out.println("d. Ver clientes pendientes");
           System.out.println("e. Cerrar supermecado");

           String opcion = teclado.nextLine();
           switch (opcion) {
               case "a":
                   if (cajaAbierta == false) {
                       cajaAbierta = true;
                       System.out.println("Se ha abierto la caja número" + cajeroHiperDino.getNumeroDeCaja());
                   } else {
                       System.out.println("La caja ya se encuentra abierta");
                   }
                   break;
               case "b":
                   if (cajaAbierta == true) {
                       cajeroHiperDino.anyadirClienteALaCola();
                   } else {
                       System.out.println("La caja esta cerrada");
                   }
                   break;
               case "c":
                   cajeroHiperDino.atenderCliente();
                   break;
               case "d":
                   System.out.println(cajeroHiperDino);
                   break;
               case "e":
                   if (cajaAbierta == true) {
                       cajaAbierta = false;
                       System.out.println("Cerranco caja");
                       salir = true;
                   } else {
                       salir = true;
                   }
                   break;
           }
       }
    }
}
