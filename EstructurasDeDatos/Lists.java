package EstructurasDeDatos;

import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {

        // Declaración y creación
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        // Tamaño

        System.out.println(names.size());

        // Inserción

        names.add("Luis");
        names.add("Francisco");
        names.add("Contreras");
        System.out.println(names.size());

        // Acceso

        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        // Modificación

        names.set(2, "contrerasgonzalezluisfco@gmail.com");
        System.out.println(names.getLast());

        // Eliminación

        names.remove(2);
        // System.out.println(names.get(2)); // Error
        System.out.println(names.size());

        // Búsqueda

        System.out.println(names.contains("Luis"));
        System.out.println(names.contains("contrerasgonzalezluisfco@gmail.com"));

        // Limpieza

        names.add("Fer");
        System.out.println(names);
        names.clear();
        System.out.println(names.size());

    }
}