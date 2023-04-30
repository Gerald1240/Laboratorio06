package Actividad2;

public class ListArray<T> implements TDAList<T> {

    private T[] list;     // Array que almacena los elementos de la lista
    private int maxSize;  // Tamaño máximo de la lista
    private int length;   // Longitud actual de la lista

    // Constructor de la clase
    @SuppressWarnings("unchecked")
    public ListArray(int size) {
        maxSize = size;
        length = 0;
        list = (T[]) new Object[maxSize]; // Se crea un nuevo array de tamaño 'maxSize'
    }

    // Obtiene el elemento en la posición 'index' de la lista
    public T get(int index) {
        if (index >= 0 && index < length) {
            return list[index]; // Devuelve el elemento en la posición 'index'
        } else {
            // Lanza una excepción si 'index' está fuera de los límites de la lista
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + length);
        }
    }

    // Establece el valor de la posición 'index' de la lista a 'x'
    public void set(int index, T x) {
        if (index >= 0 && index < length) {
            list[index] = x; // Establece el valor de la posición 'index' a 'x'
        } else {
            // Lanza una excepción si 'index' está fuera de los límites de la lista
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + length);
        }
    }

    // Devuelve 'true' si la lista está vacía, 'false' en caso contrario
    public boolean isEmptyList() {
        return length == 0;
    }

    // Devuelve la longitud actual de la lista
    public int length() {
        return length;
    }

    // Elimina todos los elementos de la lista
    public void destroyList() {
        length = 0;
        list = (T[]) new Object[maxSize]; // Se crea un nuevo array de tamaño 'maxSize'
    }

    // Busca si 'x' está en la lista y devuelve 'true' si se encuentra, 'false' en caso contrario
    public boolean search(T x) {
        for (int i = 0; i < length; i++) {
            if (list[i].equals(x)) {
                return true; // Devuelve 'true' si 'x' se encuentra en la lista
            }
        }
        return false; // Devuelve 'false' si 'x' no se encuentra en la lista
    }

    // Inserta el elemento 'x' al inicio de la lista
    public void insertFirst(T x) {
        if (length < maxSize) { // Verifica que la lista no esté llena
            for (int i = length; i > 0; i--) {
                list[i] = list[i-1]; // Desplaza los elementos de la lista a la derecha
            }
            list[0] = x; // Establece el valor de la primera posición a 'x'
            length++; // Incrementa la longitud de la lista
        }
    }
    // Inserta el elemento 'x' al final de la lista
    public void insertLast(T x) {
        if (length < maxSize) { // Verifica que la lista no esté llena
            list[length] = x; // Establece el valor de la última posición a 'x'
            length++; // Incrementa la longitud de la lista
        }
    }

    // Inserta el elemento 'x' en la posición 'index' de la lista
    public void insertNode(int index, T x) {
        if (index >= 0 && index <= length && length < maxSize) { // Verifica que la posición 'index' sea válida y que la lista no esté llena
            for (int i = length; i > index; i--) {
                list[i] = list[i-1]; // Desplaza los elementos de la lista a la derecha
            }
            list[index] = x; // Establece el valor de la posición 'index' a 'x'
            length++; // Incrementa la longitud de la lista
        }
    }

    // Elimina el primer elemento de la lista que es igual a 'x'
    public void removeNode(T x) {
        int index = -1; // Variable para almacenar la posición del elemento a eliminar
        for (int i = 0; i < length; i++) {
            if (list[i].equals(x)) {
                index = i; // Se almacena la posición del elemento a eliminar
                break; // Se sale del bucle al encontrar el elemento a eliminar
            }
        }
        if (index != -1) { // Verifica que se haya encontrado el elemento a eliminar
            for (int i = index; i < length-1; i++) {
                list[i] = list[i+1]; // Desplaza los elementos de la lista a la izquierda
            }
            length--; // Decrementa la longitud de la lista
        }
    }
}

