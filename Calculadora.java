import java.util.Stack;

public class Calculadora {
    private static Calculadora instancia;

    private Calculadora() {}

    public static Calculadora obtenerInstancia() {
        if (instancia == null) {
            instancia = new Calculadora();
        }
        return instancia;
    }

    // Método para convertir una expresión infija a postfijo
    public String convertirAPostfijo(String expresion) {
        StringBuilder resultado = new StringBuilder();
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            // Si es un número, lo agregamos directamente al resultado
            if (Character.isDigit(c)) {
                resultado.append(c);
            }
            // Si es un paréntesis de apertura, lo agregamos a la pila
            else if (c == '(') {
                pila.push(c);
            }
            // Si es un paréntesis de cierre, vaciamos la pila hasta encontrar '('
            else if (c == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    resultado.append(" ").append(pila.pop());
                }
                pila.pop(); // Sacamos '('
            }
            // Si es un operador
            else if (esOperador(c)) {
                resultado.append(" "); // Espacio para separar números
                while (!pila.isEmpty() && prioridad(pila.peek()) >= prioridad(c)) {
                    resultado.append(pila.pop()).append(" ");
                }
                pila.push(c);
            }
        }

        // Vaciar cualquier operador restante en la pila
        while (!pila.isEmpty()) {
            resultado.append(" ").append(pila.pop());
        }

        return resultado.toString().trim();
    }

    // Método para evaluar una expresión en notación postfija
    public double evaluarPostfijo(String expresion) {
        Stack<Double> pila = new Stack<>();
        String[] tokens = expresion.split("\\s+");

        for (String token : tokens) {
            if (esNumero(token)) {
                pila.push(Double.parseDouble(token));
            } else if (esOperador(token.charAt(0))) {
                double b = pila.pop();
                double a = pila.pop();
                pila.push(operar(a, b, token.charAt(0)));
            }
        }

        return pila.pop(); // Resultado final
    }

    // Métodos auxiliares
    private boolean esOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private int prioridad(char c) {
        if (c == '+' || c == '-') return 1;
        if (c == '*' || c == '/') return 2;
        return -1;
    }

    private boolean esNumero(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private double operar(double a, double b, char operador) {
        switch (operador) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }
}