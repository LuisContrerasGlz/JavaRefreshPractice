public class BaseEx {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String nombre = "Luis";

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int edad = 30;

        // 3. Crea una variable double con tu altura en metros.
        double altura = 1.83;

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean meGustaProgramar = true;

        // 5. Declara una constante con tu email.
        final String EMAIL = "luis@example.com";

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char inicial = 'L';

        // 7. Declara una variable de tipo String con tu localidad,
        //    y a continuación cambia su valor y vuelve a imprimirla.
        String localidad = "Aguascalientes";
        System.out.println("Localidad inicial: " + localidad);
        localidad = "Guadalajara";
        System.out.println("Localidad actualizada: " + localidad);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 10;
        int b = 20;
        int suma = a + b;
        System.out.println("Suma de a + b = " + suma);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        //    (En Java no se imprime directamente el tipo, pero se puede con getClass().getSimpleName())
        System.out.println("El tipo de 'nombre' es: " + nombre.getClass().getSimpleName());
        System.out.println("El tipo de 'altura' es: " + ((Object) altura).getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int sinValor;
        sinValor = 100;
        System.out.println("Variable sinValor = " + sinValor);
    }
}
