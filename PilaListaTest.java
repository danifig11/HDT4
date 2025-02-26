import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PilaListaTest {
// JUnit para saber si funciona de forma correcta

    @Test
    public void pruebaApilarYDesapilar() {
        PilaLista<Integer> pila = new PilaLista<>(new ListaSimple<>());
        pila.apilar(30);
        pila.apilar(40);

        assertEquals(40, pila.desapilar());
        assertEquals(30, pila.desapilar());
        assertTrue(pila.estaVacia());
    }

    @Test
    public void pruebaCima() {
        PilaLista<Integer> pila = new PilaLista<>(new ListaSimple<>());
        pila.apilar(7);
        pila.apilar(9);

        assertEquals(9, pila.cima());
    }

    @Test
    public void pruebaPilaVacia() {
        PilaLista<Integer> pila = new PilaLista<>(new ListaSimple<>());
        assertTrue(pila.estaVacia());

        pila.apilar(2);
        assertFalse(pila.estaVacia());
    }
}