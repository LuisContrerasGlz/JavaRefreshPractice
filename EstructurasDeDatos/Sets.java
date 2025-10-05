package estructurasdedatos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        // Declaración y creación
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Tamaño

        System.out.println(names.size());

        // Inserción

        names.add("Brais");
        names.add("Moure");
        names.add("MoureDev");
        names.add("mouredev@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Eliminación

        names.remove("Brais");
        System.out.println(names.size());

        // Búsqueda

        System.out.println(names.contains("Brais"));
        System.out.println(names.contains("mouredev@gmail.com"));

        System.out.println(names);
        names.add("Moure");
        names.add("Moure");
        names.add("Moure");
        System.out.println(names);

        // Conjuntos

        // names.addAll(numbers); Error

        var countries = new HashSet<String>();
        countries.add("España");
        countries.add("México");
        countries.add("Argentina");
        countries.add("MoureDev");

        names.addAll(countries);
        System.out.println(names);

        names.removeAll(countries);
        System.out.println(names);

        names.retainAll(countries);
        System.out.println(names);

        // Cómo “acceder” a un elemento en un Set

        Set<String> nombres = new HashSet<>();
        nombres.add("Luis");
        nombres.add("Ana");
        nombres.add("Juan");  

        // Recorriendo con for-each

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Convertir el Set a Lista (para usar índices):

        List<String> lista = new ArrayList<>(nombres);
        System.out.println(lista.get(0)); // ahora sí accedes con índice

        // Buscar directamente si contiene algo

        if (nombres.contains("Ana")) {
            System.out.println("Ana está en el set");
        }
    
    }
}
