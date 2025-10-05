package estructurasdedatos;
import java.util.Arrays;


public class ArraysInfo {
    public static void main(String[] args) {

        // Declaración y creación
        int[] numbers = new int[3];
        System.out.println(numbers);

        String[] names = {"Luis", "Francisco", "Contreras"};
        System.out.println(names);

        // Acceso
        System.out.println(numbers[0]);
        System.out.println(names[0]);

        System.out.println((new String[3])[0]);

        // Modificación
        numbers[0] = 1;
        numbers[1] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        // numbers[3] = 2; Error

        System.out.println(names[2]);
        names[2] = "contrerasgonzalezluisfco@gmail.com";
        System.out.println(names[2]);

        System.out.println(names.length);
        names[2] = null;
        System.out.println(names[2]);
        System.out.println(names.length);

        // numbers[2] = null; Error

        boolean[] booleans = new boolean[5];
        System.out.println(booleans[4]);

        // Si usas directamente:

        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(numeros);

        // Eso es la referencia en memoria, no los valores del array. [I@5acf9800

        // Opciones correctas para mostrar arrays:

        // Usar Arrays.toString() (más común)

        int[] numeros2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numeros2));
        // Resultado: [1, 2, 3, 4, 5]

        // Recorrer el array con un for

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en posición " + i + ": " + numeros[i]);
        }

        // Usar un for-each (más limpio)

        for (int n : numeros) {
            System.out.println(n);
        }

        // Si es multidimensional: Arrays.deepToString()

        int[][] matriz = {{1,2}, {3,4}, {5,6}};
            System.out.println(Arrays.deepToString(matriz));
        // Resultado: [[1, 2], [3, 4], [5, 6]]

    }
}
