public class Combinaciones {
    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Número negativo");
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int combinaciones(int n, int k) {
        if (k > n) throw new IllegalArgumentException("k no puede ser mayor que n");
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static void main(String[] args) {
        System.out.println("C(6,3) = " + combinaciones(6, 3));
        System.out.println("C(10,4) = " + combinaciones(10, 4));
        System.out.println("C(8,2) = " + combinaciones(8, 2));
    }
}
