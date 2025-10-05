package programacionorientadaobjetos;

public class Classes {
    public static void main(String[] args) {
        Person person = new Person("Luis", 30, "123456789A");

        person.sayHello();

        // Usar setter para cambiar nombre
        person.setName("Luis Contreras");
        System.out.println(person.getName());

        // Usar getter para acceder al id
        System.out.println(person.getId());
    }
}
