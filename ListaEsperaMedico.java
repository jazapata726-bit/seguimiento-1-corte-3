import java.util.*;

public class ListaEsperaMedico {
    public static void main(String[] args) {
        LinkedList<String> pacientes = new LinkedList<>(Arrays.asList(
            "Ana", "Carlos", "Laura", "Miguel", "Sofía"
        ));

        // Paso 1: agregar paciente VIP al frente
        pacientes.addFirst("PacienteVIP");

        // Paso 2: llamar al siguiente paciente
        String llamado = pacientes.removeFirst();
        System.out.println("Paciente llamado: " + llamado);

        // Paso 3: mostrar cuántos quedan
        System.out.println("Pacientes restantes en sala: " + pacientes.size());
    }
}
