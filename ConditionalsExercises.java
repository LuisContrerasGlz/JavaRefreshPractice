public class ConditionalsExercises {
    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int edad = 20;
        if (edad >= 18) {
            System.out.println("Puede votar");
        } else {
            System.out.println("No puede votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int num1 = 15;
        int num2 = 20;
        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.println("Son iguales");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int numero = -7;
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        // 4. Crea un programa que diga si un número es par o impar.
        int parImpar = 11;
        if (parImpar % 2 == 0) {
            System.out.println(parImpar + " es par");
        } else {
            System.out.println(parImpar + " es impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        int rango = 55;
        if (rango >= 1 && rango <= 100) {
            System.out.println(rango + " está en el rango de 1 a 100");
        } else {
            System.out.println(rango + " está fuera del rango");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int dia = 3;
        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Día inválido");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        int nota = 72;
        if (nota >= 90) {
            System.out.println("Sobresaliente");
        } else if (nota >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        int edadCine = 13;
        boolean acompanado = true;
        if (edadCine >= 15 || acompanado) {
            System.out.println("Puedes entrar al cine");
        } else {
            System.out.println("No puedes entrar al cine");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char letra = 'a';
        letra = Character.toLowerCase(letra); // asegurar minúscula
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println(letra + " es una vocal");
        } else if (Character.isLetter(letra)) {
            System.out.println(letra + " es una consonante");
        } else {
            System.out.println(letra + " no es una letra");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        int a = 12, b = 25, c = 18;
        if (a >= b && a >= c) {
            System.out.println("El mayor es " + a);
        } else if (b >= a && b >= c) {
            System.out.println("El mayor es " + b);
        } else {
            System.out.println("El mayor es " + c);
        }
    }
}
