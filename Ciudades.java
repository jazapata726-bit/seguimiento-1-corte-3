import java.util.*;

public class Ciudades {
    public static void main(String[] args) {
        List<String> ciudades = Arrays.asList(
            "Bogotá", "Medellín", "Cali", "Cartagena", "Bogotá", "Armenia"
        );

        // Imprimir lista completa
        System.out.println("Lista de ciudades: " + ciudades);

        // Tamaño de la lista
        System.out.println("Tamaño de la lista: " + ciudades.size());

        // Verificar si contiene una ciudad
        System.out.println("¿Contiene Cali? " + ciudades.contains("Cali"));

        // Crear un Set a partir de la lista
        Set<String> ciudadesUnicas = new HashSet<>(ciudades);
        System.out.println("Conjunto de ciudades únicas: " + ciudadesUnicas);

        // Comparar tamaños
        System.out.println("Tamaño del Set: " + ciudadesUnicas.size());
    }
}
