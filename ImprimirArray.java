public class ImprimirArray {
    public static void imprimirArray(int[] arr, int indice) {
        if (indice == arr.length) { // caso base
            return;
        }
        System.out.println(arr[indice]); // acción
        imprimirArray(arr, indice + 1);  // caso recursivo
    }

    public static void main(String[] args) {
        int[] numeros = {5, 8, 12, 20, 25, 30};
        imprimirArray(numeros, 0);
    }
}
