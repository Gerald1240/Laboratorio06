package Actividad2;

// Interfaz TDAList que define los métodos que deben implementar las clases que implementen una lista genérica
public interface TDAList<T> {
    public boolean isEmptyList(); // Devuelve 'true' si la lista está vacía, 'false' en caso contrario
    public int length(); // Devuelve la cantidad de elementos en la lista
    public void destroyList(); // Elimina todos los elementos de la lista
    public boolean search(T x); // Busca si el elemento 'x' está en la lista y devuelve 'true' si se encuentra, 'false' en caso contrario
    public void insertFirst(T x); // Inserta un nuevo elemento 'x' al principio de la lista
    public void insertLast(T x); // Inserta un nuevo elemento 'x' al final de la lista
    public void removeNode(T x); // Elimina el primer elemento de la lista que sea igual a 'x'
}
