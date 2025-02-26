public class FabricaListas {
    public static <T> Lista<T> crearLista(String tipo) {
        switch (tipo.toLowerCase()) {
            case "simple":
                return new ListaSimple<>();
            case "doble":
                return new ListaDoble<>();
            default:
                throw new IllegalArgumentException("Tipo de lista no válido");
        }
    }
}