public class OperatorsExercises {
    public static void main(String[] args) {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        int suma = 5 + 3;
        int resta = 10 - 4;
        int multiplicacion = 6 * 2;
        int division = 20 / 5;
        int modulo = 17 % 3;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

        // 2. Crea una variable para cada tipo de operación de asignación.
        int x = 10;
        x += 5;  // x = x + 5
        int y = 20;
        y -= 3;  // y = y - 3
        int z = 4;
        z *= 2;  // z = z * 2
        int w = 15;
        w /= 3;  // w = w / 3
        int m = 17;
        m %= 5;  // m = m % 5

        System.out.println("\nAsignaciones: x=" + x + ", y=" + y + ", z=" + z + ", w=" + w + ", m=" + m);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println("\nComparaciones verdaderas:");
        System.out.println("5 > 2 -> " + (5 > 2));
        System.out.println("10 == 10 -> " + (10 == 10));
        System.out.println("7 <= 9 -> " + (7 <= 9));

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println("\nComparaciones falsas:");
        System.out.println("3 > 8 -> " + (3 > 8));
        System.out.println("4 == 6 -> " + (4 == 6));
        System.out.println("9 < 1 -> " + (9 < 1));

        // 5. Utiliza el operador lógico and.
        boolean andExample = (5 > 2) && (10 > 3);
        System.out.println("\nOperador AND: (5 > 2 && 10 > 3) -> " + andExample);

        // 6. Utiliza el operador lógico or.
        boolean orExample = (5 > 10) || (3 < 8);
        System.out.println("Operador OR: (5 > 10 || 3 < 8) -> " + orExample);

        // 7. Combina ambos operadores lógicos.
        boolean combo = ((5 > 2) && (8 < 10)) || (3 > 7);
        System.out.println("Combinación AND y OR: ((5 > 2 && 8 < 10) || 3 > 7) -> " + combo);

        // 8. Añade alguna negación.
        boolean negacion = !(5 > 2);
        System.out.println("Negación: !(5 > 2) -> " + negacion);

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        int a = 5;
        System.out.println("\nOperadores unarios:");
        System.out.println("a++ = " + (a++));  // primero imprime, luego incrementa
        System.out.println("++a = " + (++a));  // primero incrementa, luego imprime
        System.out.println("-a = " + (-a));    // cambia el signo

        // 10. Combina operadores aritméticos, de comparación y lógicos.
        boolean combinados = ((10 + 5) > (3 * 4)) && (20 % 2 == 0);
        System.out.println("\nCombinados: ((10 + 5) > (3 * 4)) && (20 % 2 == 0) -> " + combinados);
    }
}
