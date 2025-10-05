package funciones;

import java.util.ArrayList;

public class FunctionsExercises {

    // 1. Crea una función que imprima un mensaje de bienvenida
    public static void bienvenida() {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    // 2. Función que reciba un nombre y salude
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    // 3. Método que reciba dos números y devuelva su resta
    public static int resta(int a, int b) {
        return a - b;
    }

    // 4. Método que calcule el cuadrado de un número
    public static int cuadrado(int n) {
        return n * n;
    }

    // 5. Función que diga si un número es par o impar
    public static void esParImpar(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " es par");
        } else {
            System.out.println(n + " es impar");
        }
    }

    // 6. Método que reciba una edad y retorne true si es mayor de edad
    public static boolean esMayorEdad(int edad) {
        return edad >= 18;
    }

    // 7. Función que reciba una cadena y retorne su longitud
    public static int longitudCadena(String texto) {
        return texto.length();
    }

    // 8. Método que reciba un array de enteros y calcule su media
    public static double mediaArray(int[] numeros) {
        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }
        return (double) suma / numeros.length;
    }

    // 9. Método que reciba un número y retorne su factorial
    public static long factorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // 10. Función que reciba un ArrayList<String> y lo recorra mostrando cada elemento
    public static void recorrerArrayList(ArrayList<String> lista) {
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {

        // 1
        bienvenida();

        // 2
        saludar("Luis");

        // 3
        System.out.println("Resta: " + resta(10, 4));

        // 4
        System.out.println("Cuadrado de 6 = " + cuadrado(6));

        // 5
        esParImpar(7);

        // 6
        System.out.println("¿Es mayor de edad (20)? " + esMayorEdad(20));

        // 7
        System.out.println("Longitud de 'Java': " + longitudCadena("Java"));

        // 8
        int[] numeros = {5, 10, 15, 20};
        System.out.println("Media = " + mediaArray(numeros));

        // 9
        System.out.println("Factorial de 5 = " + factorial(5));

        // 10
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Naranja");
        recorrerArrayList(lista);
    }
}
