package Actividad2;

//b) Clase TestList que prueba los métodos de la lista ListArray para diferentes tipos de datos
public class TestList {
 public static void main(String[] args) {
     // Prueba la lista con un arreglo de enteros
     ListArray<Integer> intList = new ListArray<Integer>(10); // Se crea una lista de enteros con capacidad máxima de 10 elementos
     intList.insertLast(5); // Se inserta el valor 5 al final de la lista
     intList.insertFirst(10); // Se inserta el valor 10 al principio de la lista
     intList.insertLast(20); // Se inserta el valor 20 al final de la lista
     System.out.println(intList.get(0)); // Se imprime el valor de la posición 0 de la lista (debe ser 10)
     System.out.println(intList.search(5)); // Se busca el valor 5 en la lista (debe ser verdadero)
     intList.removeNode(5); // Se elimina el primer elemento de la lista que sea igual a 5
     System.out.println(intList.search(5)); // Se busca el valor 5 en la lista (debe ser falso)

     // Prueba la lista con un arreglo de cadenas de texto
     ListArray<String> stringList = new ListArray<String>(5); // Se crea una lista de cadenas de texto con capacidad máxima de 5 elementos
     stringList.insertFirst("Hola"); // Se inserta la cadena "Hola" al principio de la lista
     stringList.insertLast("Mundo"); // Se inserta la cadena "Mundo" al final de la lista
     stringList.insertFirst("!"); // Se inserta la cadena "!" al principio de la lista
     System.out.println(stringList.get(2)); // Se imprime el valor de la posición 2 de la lista (debe ser "Hola")
     stringList.destroyList(); // Se destruye la lista
     System.out.println(stringList.isEmptyList()); // Se verifica si la lista está vacía (debe ser verdadero)
 }
}

