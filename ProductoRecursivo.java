public class ProductoRecursivo {
    public static int producto(int n) {
        if (n <= 1) { // caso base
            return 1;
        }
        return n * producto(n - 1); // caso recursivo
    }

    public static void main(String[] args) {
        System.out.println("producto(5) = " + producto(5));
        System.out.println("producto(7) = " + producto(7));
    }
}
