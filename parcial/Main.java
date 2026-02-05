public class Main {

    public static void main(String[] args) {

        System.out.println("***Sistema de Gestión de Tareas***\n");

        ColaTareas sistema = new ColaTareas();

        System.out.println("Agregando tareas a la cola...\n");

        sistema.agregarTarea(new Tarea(1, "Corregir bug en login", "julian", 3));
        sistema.agregarTarea(new Tarea(2, "Actualizar documentación", "natalia", 2));
        sistema.agregarTarea(new Tarea(3, "Implementar API REST", "bairon", 3));
        sistema.agregarTarea(new Tarea(4, "Optimizar base de datos", "alejandra", 3));

        System.out.println("\nAtendiendo primera tarea");
        sistema.atenderTarea();

        System.out.println("\nAtendiendo segunda tarea");
        sistema.atenderTarea();

        System.out.println();
        sistema.buscarPorPrioridad(3);

        System.out.println("\nTareas pendientes: " + sistema.totalPendientes());
    }
}