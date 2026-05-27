import java.util.*;

public class PilaLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> pila = new LinkedList<>();

        // Paso 1: meter elementos
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);

        // Paso 2: sacar dos elementos
        System.out.println("Elemento sacado: " + pila.pop());
        System.out.println("Elemento sacado: " + pila.pop());

        // Paso 3: mostrar estado final
        System.out.println("Estado final de la pila: " + pila);
    }
}
