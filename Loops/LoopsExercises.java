package Loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LoopsExercises {
    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");

        int j = 0;
        do {
            System.out.print(lista.get(j) + " ");
            j++;
        } while (j < lista.size());
        System.out.println();

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (int k = 1; k <= 50; k++) {
            if (k % 5 == 0) {
                System.out.print(k + " ");
            }
        }
        System.out.println();

        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] numeros = {2, 4, 6, 8, 10};
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        System.out.println("Suma total = " + suma);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        for (int k = 0; k < numeros.length; k++) {
            System.out.print(numeros[k] + " ");
        }
        System.out.println();

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        HashSet<String> set = new HashSet<>();
        set.add("Rojo");
        set.add("Verde");
        set.add("Azul");

        for (String color : set) {
            System.out.println("Color: " + color);
        }

        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Uno");
        mapa.put(2, "Dos");
        mapa.put(3, "Tres");

        for (Integer clave : mapa.keySet()) {
            System.out.println("Clave: " + clave + ", Valor: " + mapa.get(clave));
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int k = 10; k >= 1; k--) {
            System.out.print(k + " ");
        }
        System.out.println();

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int k = 1; k <= 20; k++) {
            if (k % 3 == 0) {
                continue;
            }
            System.out.print(k + " ");
        }
        System.out.println();

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] arreglo = {4, 7, -2, 9, 5};
        for (int num : arreglo) {
            if (num < 0) {
                System.out.println("Número negativo encontrado: " + num);
                break;
            }
            System.out.println(num);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        int n = 5;
        int factorial = 1;
        for (int k = 1; k <= n; k++) {
            factorial *= k;
        }
        System.out.println("Factorial de " + n + " = " + factorial);
    }
}
