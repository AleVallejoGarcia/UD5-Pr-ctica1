# Clases
## Clase Cajero

La clase cajero contiene como atributos el numero de caja que atiende el cajero y una cola de todos los clientes en su caja, tiene un constructor que como unico dato pide el número de la caja.

Esta clase contiene además métodos para añadir clientes a la cola y otro para atenderlos y sacarlos de ella.

El método to String de esta clase está sobrescrito para que muestre el número de la caja, el total de clientes haciendo cola y la información de cada uno.

![cajero de un hiperdino](../images/HiperdinoCajero.jpg)

## Clase Cliente

La clase cliente contiene como atributos el nombre del cliente que sale de forma aleatoria de un array de la clase GeneradorEstatico y una pila que es su cesta de la compra que se rellena con una cantidad aleatoria de 1 a 13 productos los cuales salen de un array en la clase nombrada anteriormente.

Esta clase contiene métodos para añadir poductos a la cesta.

El método to String de esta clase está sobrescrito para que muestre el nombre de el cliente, el total de productos en la cesta y el nombre de cada uno.

## Generador Estatico

La finalidad de esta clase es tener los métodos que sacan aleatoriamente nombres y productos de los arrays dentro de esta clase.

## App

Esta es la clase ejecutable del proyecto lo principal que tiene esta clase es un switch que hace de menú de interacción con el usuario.

### Readme
Para volver al README pinche [aquí](/README.md)