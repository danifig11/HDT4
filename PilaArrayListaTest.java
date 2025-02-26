import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PilaArrayListaTest {
// JUnit para saber si funciona de forma correcta

    @Test
    public void pruebaApilarYDesapilar() {
        PilaArrayLista<Integer> pila = new PilaArrayLista<>();
        pila.apilar(10);
        pila.apilar(20);

        assertEquals(20, pila.desapilar());
        assertEquals(10, pila.desapilar());
        assertTrue(pila.estaVacia());
    }

    @Test
    public void pruebaCima() {
        PilaArrayLista<Integer> pila = new PilaArrayLista<>();
        pila.apilar(5);
        pila.apilar(15);

        assertEquals(15, pila.cima());
    }

    @Test
    public void pruebaPilaVacia() {
        PilaArrayLista<Integer> pila = new PilaArrayLista<>();
        assertTrue(pila.estaVacia());

        pila.apilar(1);
        assertFalse(pila.estaVacia());
    }
}