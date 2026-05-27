import java.util.*;

public class CompararListSet {
    public static void main(String[] args) {
        List<Integer> numerosLista = Arrays.asList(5, 3, 8, 3, 1, 5, 7, 8);
        System.out.println("Lista: " + numerosLista);
        System.out.println("Tamaño de la lista: " + numerosLista.size());

        Set<Integer> numerosSet = new HashSet<>(numerosLista);
        System.out.println("Set: " + numerosSet);
        System.out.println("Tamaño del set: " + numerosSet.size());

        System.out.println("Explicación: La lista permite duplicados, "
            + "por eso tiene más elementos. El set elimina duplicados automáticamente, "
            + "por eso su tamaño es menor.");
    }
}
