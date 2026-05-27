public class SumaPares {
    public static int sumarPares(int n) {
        if (n < 2) { // caso base
            return 0;
        }
        if (n % 2 == 0) { // si es par
            return n + sumarPares(n - 2);
        } else { // si es impar
            return sumarPares(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("sumarPares(10) = " + sumarPares(10));
    }
}
