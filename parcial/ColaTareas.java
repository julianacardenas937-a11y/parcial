import java.util.LinkedList;
import java.util.Queue;

public class ColaTareas {

    private Queue<Tarea> cola;

    public ColaTareas() {
        cola = new LinkedList<>();
    }

    // Agregar tarea
    public void agregarTarea(Tarea t) {
        cola.add(t);
        System.out.println(" Tarea agregada: " + t);
    }

    // Atender tarea
    public void atenderTarea() {
        if (cola.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
        } else {
            Tarea t = cola.poll();
            System.out.println("Atendiendo tarea: " + t);
        }
    }

    // Buscar por prioridad
    public void buscarPorPrioridad(int prioridad) {
        int contador = 0;
        System.out.println("Buscando tareas con prioridad " + prioridad + ":");

        for (Tarea t : cola) {
            if (t.getPrioridad() == prioridad) {
                System.out.println("- " + t);
                contador++;
            }
        }

        System.out.println("Total encontradas: " + contador + " tareas");
    }

    public int totalPendientes() {
        return cola.size();
    }
}