public class Tarea {

    private int id;
    private String titulo;
    private String programador;
    private int prioridad;

    public Tarea(int id, String titulo, String programador, int prioridad) {
        this.id = id;
        this.titulo = titulo;
        this.programador = programador;
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String toString() {
        return "ID: " + id +
               " | Título: " + titulo +
               " | Programador: " + programador +
               " | Prioridad: " + prioridad;
    }
}