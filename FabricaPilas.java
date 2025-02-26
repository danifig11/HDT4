public class FabricaPilas {
    public static <T> Pila<T> crearPila(String tipo) {
        switch (tipo.toLowerCase()) {
            case "arraylista":
                return new PilaArrayLista<>();
            case "vector":
                return new PilaVector<>();
            case "lista":
                return new PilaLista<>(new ListaSimple<>());
            default:
                throw new IllegalArgumentException("Tipo de pila no válido");
        }
    }
}