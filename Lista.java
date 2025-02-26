public interface Lista<T> {
    void agregar(T elemento);
    T eliminar(int indice);
    T obtener(int indice);
    int tamano();
    boolean estaVacia();
}