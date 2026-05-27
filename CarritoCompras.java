import java.util.*;

public class CarritoCompras {
    public static void main(String[] args) {
        ArrayList<String> carrito = new ArrayList<>();

        // Paso 1: agregar cinco productos
        carrito.add("Leche");
        carrito.add("Pan");
        carrito.add("Huevos");
        carrito.add("Arroz");
        carrito.add("Café");

        // Paso 2: insertar al inicio
        carrito.add(0, "Frutas");

        // Paso 3: reemplazar el tercer producto
        carrito.set(2, "Queso");

        // Paso 4: eliminar el segundo producto
        carrito.remove(1);

        // Paso 5: imprimir carrito final
        System.out.println("Carrito final:");
        carrito.forEach(System.out::println);
    }
}
