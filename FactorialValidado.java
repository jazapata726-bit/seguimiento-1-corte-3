public class FactorialValidado {
    public static int factorial(int n) {
        if (n < 0) { // validación
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        if (n == 0 || n == 1) { // caso base
            return 1;
        }
        return n * factorial(n - 1); // caso recursivo
    }

    public static void main(String[] args) {
        try {
            System.out.println("factorial(5) = " + factorial(5));
            System.out.println("factorial(0) = " + factorial(0));
            System.out.println("factorial(-3) = " + factorial(-3)); // lanza excepción
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
