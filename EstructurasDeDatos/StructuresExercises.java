package estructurasdedatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        String[] arr = {"Luis", "Ana", "Juan", "Eva", "Mario"};
        System.out.println("1) Longitud del array: " + arr.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        int idx = 2; // posición a modificar
        System.out.println("2) Antes: arr[" + idx + "] = " + arr[idx]);
        arr[idx] = "Carlos";
        System.out.println("   Después: arr[" + idx + "] = " + arr[idx]);

        // 3. Crea un ArrayList vacío.
        List<String> list = new ArrayList<>();
        System.out.println("3) ArrayList vacío: " + list);

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        list.add("Rojo");
        list.add("Verde");
        list.add("Azul");
        list.add("Amarillo");
        System.out.println("4) List antes de eliminar: " + list);
        list.remove("Verde"); // elimina por valor
        System.out.println("   List después de eliminar: " + list);

        // 5. Crea un HashSet con 2 valores diferentes.
        Set<String> set = new HashSet<>();
        set.add("MX");
        set.add("ES");
        System.out.println("5) Set inicial: " + set);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        set.add("ES");     // repetido -> no cambia
        set.add("AR");     // nuevo
        System.out.println("6) Set tras intentos de add: " + set);

        // 7. Elimina uno de los elementos del HashSet.
        set.remove("MX");
        System.out.println("7) Set tras remove(\"MX\"): " + set);

        // 8. Crea un HashMap (nombre -> teléfono). Añade tres contactos.
        Map<String, String> agenda = new HashMap<>();
        agenda.put("Luis", "555-111-222");
        agenda.put("Ana", "555-333-444");
        agenda.put("Juan", "555-555-666");
        System.out.println("8) Agenda inicial: " + agenda);

        // 9. Modifica uno de los contactos y elimina otro.
        agenda.put("Ana", "555-000-000"); // modificar = sobrescribir
        agenda.remove("Juan");
        System.out.println("9) Agenda modificada: " + agenda);

        // 10. Dado un Array, transfórmalo en ArrayList, luego en HashSet y finalmente en HashMap clave=valor.
        List<String> list10 = new ArrayList<>(Arrays.asList(arr));
        Set<String> set10 = new HashSet<>(list10);
        Map<String, String> map10 = new HashMap<>();
        for (String s : set10) {
            map10.put(s, s); // clave y valor iguales
        }
        System.out.println("10) ArrayList desde array: " + list10);
        System.out.println("    HashSet desde lista: " + set10);
        System.out.println("    HashMap clave=valor: " + map10);
    }
}
