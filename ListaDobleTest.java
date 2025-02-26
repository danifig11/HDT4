import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListaDobleTest {
// JUnit para saber si funciona de forma correcta

    @Test
    public void pruebaAgregarYObtener() {
        ListaDoble<Integer> lista = new ListaDoble<>();
        lista.agregar(100);
        lista.agregar(200);

        assertEquals(100, lista.obtener(0));
        assertEquals(200, lista.obtener(1));
    }

    @Test
    public void pruebaEliminar() {
        ListaDoble<Integer> lista = new ListaDoble<>();
        lista.agregar(50);
        lista.agregar(150);
        lista.agregar(250);

        assertEquals(150, lista.eliminar(1));
        assertEquals(2, lista.tamano());
    }

    @Test
    public void pruebaListaVacia() {
        ListaDoble<Integer> lista = new ListaDoble<>();
        assertTrue(lista.estaVacia());

        lista.agregar(30);
        assertFalse(lista.estaVacia());
    }
}