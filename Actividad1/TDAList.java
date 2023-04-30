
package Actividad1;

public interface TDAList<E> { // Se define la interface genérica TDAList
    
    // Métodos abstractos de la interface TDAList
    public boolean isEmpty();
    public int size();
    public void add(E element);
    public void add(int index, E element);
    public E get(int index);
    public E remove(int index);
    public void clear();
}
