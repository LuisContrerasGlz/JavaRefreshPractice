package estructurasdedatos;

import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {

        // Declaración y creación
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // Tamaño

        System.out.println(names.size());

        // Inserción

        names.put("Luis", "luis.fco.contreras@gmail.com");
        names.put("Francisco", "contrerasgonzalezluisfco@gmail.com");
        names.put("prof", "luis.contreras.glz@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        // Acceso

        System.out.println(names.get("Luis"));
        System.out.println(names.get("Francisco"));

        // Verificación

        System.out.println(names.containsKey("Luis"));
        System.out.println(names.containsKey("Francisco"));

        System.out.println(names.containsValue("luis.fco.contreras@gmail.com"));

        // Eliminación

        System.out.println(names.remove("Luis"));
        System.out.println(names.remove("Francisco"));
        System.out.println(names);

        // Limpieza

        names.clear();
        System.out.println(names);

        // Modificación

        names.put("Luis", "lfcg@gmail.com");
        System.out.println(names);

        names.put("Francisco", "contreras@gmail.com");
        System.out.println(names);

        names.replace("prof", "luisprof@gmail.com"); // Reemplaza el valor si existe
        System.out.println(names);

        names.putIfAbsent("maestro", "maestro@gmail.com"); // Solo lo añade si no existe
        System.out.println(names);

        // Otras operaciones

        System.out.println(names.isEmpty());
        var values = names.values();
        System.out.println(values);
     }
}
