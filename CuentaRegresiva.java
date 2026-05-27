public class CuentaRegresiva {
    public static void cuentaRegresiva(int n) {
        if (n == 0) { // caso base
            System.out.println("¡Despegue!");
            return;
        }
        System.out.println(n);      // acción
        cuentaRegresiva(n - 1);     // caso recursivo
    }

    public static void main(String[] args) {
        cuentaRegresiva(10);
    }
}