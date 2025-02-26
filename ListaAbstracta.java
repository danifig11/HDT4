import java.util.LinkedList;

public abstract class ListaAbstracta<T> implements Lista<T> {
    protected LinkedList<T> elementos = new LinkedList<>();

    @Override
    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    @Override
    public T eliminar(int indice) {
        return elementos.remove(indice);
    }

    @Override
    public T obtener(int indice) {
        return elementos.get(indice);
    }

    @Override
    public int tamano() {
        return elementos.size();
    }

    @Override
    public boolean estaVacia() {
        return elementos.isEmpty();
    }
}