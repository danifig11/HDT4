public abstract class PilaAbstracta<T> implements Pila<T> {
    protected Lista<T> elementos;

    public PilaAbstracta(Lista<T> lista) {
        this.elementos = lista;
    }

    @Override
    public void apilar(T elemento) {
        elementos.agregar(elemento);
    }

    @Override
    public T desapilar() {
        if (!estaVacia()) {
            return elementos.eliminar(elementos.tamano() - 1);
        }
        return null;
    }

    @Override
    public T cima() {
        if (!estaVacia()) {
            return elementos.obtener(elementos.tamano() - 1);
        }
        return null;
    }

    @Override
    public boolean estaVacia() {
        return elementos.estaVacia();
    }
}