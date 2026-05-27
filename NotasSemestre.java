import java.util.*;

public class NotasSemestre {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>(Arrays.asList(
            2.5, 3.8, 4.2, 1.9, 3.0, 4.5, 2.8, 3.7
        ));

        double max = notas.get(0);
        double min = notas.get(0);
        int contadorAprobadas = 0;
        double suma = 0;

        for (double nota : notas) {
            if (nota > max) max = nota;
            if (nota < min) min = nota;
            if (nota >= 3.0) contadorAprobadas++;
            suma += nota;
        }

        double promedio = suma / notas.size();

        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);
        System.out.println("Notas >= 3.0: " + contadorAprobadas);
        System.out.println("Promedio del semestre: " + promedio);
    }
}
