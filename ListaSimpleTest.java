import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListaSimpleTest {
// JUnit para saber si funciona de forma correcta
    @Test
    public void pruebaAgregarYObtener() {
        ListaSimple<Integer> lista = new ListaSimple<>();
        lista.agregar(10);
        lista.agregar(20);

        assertEquals(10, lista.obtener(0));
        assertEquals(20, lista.obtener(1));
    }

    @Test
    public void pruebaEliminar() {
        ListaSimple<Integer> lista = new ListaSimple<>();
        lista.agregar(5);
        lista.agregar(15);
        lista.agregar(25);

        assertEquals(15, lista.eliminar(1));
        assertEquals(2, lista.tamano());
    }

    @Test
    public void pruebaListaVacia() {
        ListaSimple<Integer> lista = new ListaSimple<>();
        assertTrue(lista.estaVacia());

        lista.agregar(3);
        assertFalse(lista.estaVacia());
    }
}