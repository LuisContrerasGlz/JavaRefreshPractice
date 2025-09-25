public class StringsExercises {
    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String saludo = "Hola";
        String nombre = "Mundo";
        String concatenado = saludo + " " + nombre;
        System.out.println("Concatenación: " + concatenado);

        // 2. Muestra la longitud de una cadena de texto.
        String texto = "Programación en Java";
        System.out.println("Longitud: " + texto.length());

        // 3. Muestra el primer y último carácter de un string.
        char primero = texto.charAt(0);
        char ultimo = texto.charAt(texto.length() - 1);
        System.out.println("Primer carácter: " + primero);
        System.out.println("Último carácter: " + ultimo);

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println("Mayúsculas: " + texto.toUpperCase());
        System.out.println("Minúsculas: " + texto.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println("¿Contiene 'Java'? " + texto.contains("Java"));
        System.out.println("¿Contiene 'Python'? " + texto.contains("Python"));

        // 6. Formatea un string con un entero.
        int edad = 25;
        String mensaje = String.format("Tengo %d años", edad);
        System.out.println(mensaje);

        // 7. Elimina los espacios en blanco al principio y final de un string.
        String conEspacios = "   Hola Java   ";
        System.out.println("Sin espacios: '" + conEspacios.trim() + "'");

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        String conGuiones = conEspacios.trim().replace(" ", "-");
        System.out.println("Con guiones: " + conGuiones);

        // 9. Comprueba si dos strings son iguales.
        String a = "java";
        String b = "java";
        String c = "Java";
        System.out.println("¿a == b? " + a.equals(b));       // true
        System.out.println("¿a == c? " + a.equals(c));       // false
        System.out.println("¿a == c (ignorando mayúsculas)? " + a.equalsIgnoreCase(c)); // true

        // 10. Comprueba si dos strings tienen la misma longitud.
        String str1 = "Hola";
        String str2 = "Java";
        String str3 = "Mundo!";
        System.out.println("¿'Hola' y 'Java' tienen la misma longitud? " + (str1.length() == str2.length()));
        System.out.println("¿'Hola' y 'Mundo!' tienen la misma longitud? " + (str1.length() == str3.length()));
    }
}
